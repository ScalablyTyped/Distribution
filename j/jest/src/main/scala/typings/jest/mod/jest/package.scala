package typings.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jest {
  type AndNot[T] = T with typings.jest.AnonNot[T]
  type ArgsType[T] = js.Any
  type ConstructorArgsType[T] = js.Any
  type ConstructorPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends new (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  type CustomAsymmetricMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* args */ typings.jest.mod.jest.RemoveFirstFromTuple[typings.jest.mod.jest.Parameters[TMatcher]], 
    typings.jest.mod.jest.AsymmetricMatcher
  ]
  type CustomAsyncMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in jest.jest.jest.NonAsyncMatchers<TMatchers> ]: jest.jest.jest.CustomAsymmetricMatcher<TMatchers[K]>}
    */ typings.jest.jestStrings.CustomAsyncMatchers with TMatchers
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  type CustomJestMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */, TMatcherReturn] = js.Function1[
    /* args */ typings.jest.mod.jest.RemoveFirstFromTuple[typings.jest.mod.jest.Parameters[TMatcher]], 
    TMatcherReturn
  ]
  type CustomMatcher = js.ThisFunction2[
    /* this */ typings.jest.mod.jest.MatcherContext, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    typings.jest.mod.jest.CustomMatcherResult | js.Promise[typings.jest.mod.jest.CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[scala.Unit]
  type EqualityTester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  type ExpectExtendMap = org.scalablytyped.runtime.StringDictionary[typings.jest.mod.jest.CustomMatcher]
  type ExtendedExpect[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = typings.jest.mod.jest.ExpectProperties with typings.jest.mod.jest.AndNot[typings.jest.mod.jest.CustomAsyncMatchers[TMatchers]] with typings.jest.mod.jest.ExtendedExpectFunction[TMatchers]
  // when have called expect.extend
  type ExtendedExpectFunction[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = js.Function1[/* actual */ js.Any, typings.jest.mod.jest.JestExtendedMatchers[TMatchers, js.Any]]
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  // Use the `void` type for return types only. Otherwise, use `undefined`. See: https://github.com/Microsoft/dtslint/blob/master/docs/void-return.md
  // have added issue https://github.com/microsoft/dtslint/issues/256 - Cannot have type union containing void ( to be used as return type only
  type ExtendedMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */, TMatcherReturn, TActual] = (typings.jest.mod.jest.Matchers[TMatcherReturn, TActual]) with typings.jest.jestStrings.ExtendedMatchers with TMatchers
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  type JestExtendedMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */, TActual] = typings.jest.mod.jest.JestMatchersShape[
    typings.jest.mod.jest.ExtendedMatchers[TMatchers, scala.Unit, TActual], 
    typings.jest.mod.jest.ExtendedMatchers[TMatchers, js.Promise[scala.Unit], TActual]
  ]
  type JestMatchersShape[TNonPromise /* <: js.Object */, TPromise /* <: js.Object */] = typings.jest.AnonRejects[TPromise] with typings.jest.mod.jest.AndNot[TNonPromise]
  type Lifecycle = js.Function2[
    /* fn */ typings.jest.mod.jest.ProvidesCallback, 
    /* timeout */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type MatcherHintColor = js.Function1[/* arg */ java.lang.String, java.lang.String]
  /**
    * Wrap an object or a module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import * as api from "../api";
    *
    *  const mockApi = api as jest.Mocked<typeof api>;
    *  api.MyApi.prototype.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = typings.jest.jestStrings.Mocked with js.Any with T
  /**
    * Wrap a class with mock definitions
    *
    * @example
    *
    *  import { MyClass } from "./libary";
    *  jest.mock("./library");
    *
    *  const mockedMyClass = MyClass as jest.MockedClass<MyClass>;
    *
    *  expect(mockedMyClass.mock.calls[0][0]).toBe(42); // Constructor calls
    *  expect(mockedMyClass.prototype.myMethod.mock.calls[0][0]).toBe(42); // Method calls
    */
  type MockedClass[T /* <: typings.jest.mod.jest.Constructable */] = (typings.jest.mod.jest.MockInstance[typings.std.InstanceType[T], _]) with js.Object with T
  /**
    * Wrap a function with mock definitions
    *
    * @example
    *
    *  import { myFunction } from "./library";
    *  jest.mock("./library");
    *
    *  const mockMyFunction = myFunction as jest.MockedFunction<typeof myFunction>;
    *  expect(mockMyFunction.mock.calls[0][0]).toBe(42);
    */
  type MockedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = (typings.jest.mod.jest.MockInstance[typings.std.ReturnType[T], typings.jest.mod.jest.ArgsType[T]]) with T
  type NonAsyncMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TMatchers ]: std.ReturnType<TMatchers[K]> extends std.Promise<jest.jest.jest.CustomMatcherResult>? never : K}[keyof TMatchers] */ js.Any
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  type NonPromiseMatchers[T /* <: typings.jest.JestMatchersShape */] = typings.jest.mod.jest.Omit[
    T, 
    typings.jest.jestStrings.resolves | typings.jest.jestStrings.rejects | typings.jest.jestStrings.not
  ]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type PrintLabel = js.Function1[/* string */ java.lang.String, java.lang.String]
  type PromiseMatchers[T /* <: typings.jest.JestMatchersShape */] = typings.jest.mod.jest.Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: T['resolves'] */ js.Any, 
    typings.jest.jestStrings.not
  ]
  type ProvidesCallback = js.Function1[/* cb */ typings.jest.mod.jest.DoneCallback, js.Any]
  type RejectedValue[T] = js.Any
  type RemoveFirstFromTuple[T /* <: js.Array[_] */] = js.Array[js.Any]
  type ResolvedValue[T] = js.Any | T
  type SnapshotSerializerPlugin = typings.prettyFormat.mod.Plugin
  /**
    * Represents a function that has been spied on.
    */
  type SpiedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typings.jest.mod.jest.SpyInstance[typings.std.ReturnType[T], typings.jest.mod.jest.ArgsType[T]]
  type SpyInstance[T, Y /* <: js.Array[_] */] = typings.jest.mod.jest.MockInstance[T, Y]
}
