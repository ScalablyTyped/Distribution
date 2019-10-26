package typings.jest.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jest {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jest.Anon_Not
  import typings.jest.Anon_Rejects
  import typings.jest.jestStrings.not
  import typings.jest.jestStrings.rejects
  import typings.jest.jestStrings.resolves
  import typings.std.Exclude
  import typings.std.InstanceType
  import typings.std.Pick
  import typings.std.ReturnType

  type AndNot[T] = T with Anon_Not[T]
  type ArgsType[T] = js.Any
  type Bytes = Double
  type ConfigGlobals = js.Object
  type ConsoleBuffer = js.Array[LogEntry]
  type CustomAsymmetricMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[/* args */ RemoveFirstFromTuple[Parameters[TMatcher]], AsymmetricMatcher]
  type CustomAsyncMatchers[TMatchers /* <: ExpectExtendMap */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in jest.jest.jest.NonAsyncMatchers<TMatchers> ]: jest.jest.jest.CustomAsymmetricMatcher<TMatchers[K]>}
    */ typings.jest.jestStrings.CustomAsyncMatchers with TMatchers
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  type CustomJestMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */, TMatcherReturn] = js.Function1[/* args */ RemoveFirstFromTuple[Parameters[TMatcher]], TMatcherReturn]
  type CustomMatcher = js.ThisFunction2[
    /* this */ MatcherContext, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    CustomMatcherResult | js.Promise[CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[Unit]
  type Environment = $JestEnvironment
  type ExpectExtendMap = StringDictionary[CustomMatcher]
  type ExpectProperties = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in 'not' ]: jest.jest.jest.Expect[K]}
    */ typings.jest.jestStrings.ExpectProperties with Expect
  type ExtendedExpect[TMatchers /* <: ExpectExtendMap */] = ExpectProperties with AndNot[CustomAsyncMatchers[TMatchers]] with ExtendedExpectFunction[TMatchers]
  // when have called expect.extend
  type ExtendedExpectFunction[TMatchers /* <: ExpectExtendMap */] = js.Function1[/* actual */ js.Any, JestExtendedMatchers[TMatchers, js.Any]]
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  // Use the `void` type for return types only. Otherwise, use `undefined`. See: https://github.com/Microsoft/dtslint/blob/master/docs/void-return.md
  // have added issue https://github.com/microsoft/dtslint/issues/256 - Cannot have type union containing void ( to be used as return type only
  type ExtendedMatchers[TMatchers /* <: ExpectExtendMap */, TMatcherReturn, TActual] = (Matchers[TMatcherReturn, TActual]) with typings.jest.jestStrings.ExtendedMatchers with TMatchers
  type FunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  type Glob = String
  // Global
  type Global = js.Object
  type HasteFS = js.Any
  type HasteResolver = js.Any
  type JestExtendedMatchers[TMatchers /* <: ExpectExtendMap */, TActual] = JestMatchersShape[
    ExtendedMatchers[TMatchers, Unit, TActual], 
    ExtendedMatchers[TMatchers, js.Promise[Unit], TActual]
  ]
  type JestMatchers[T] = JestMatchersShape[Matchers[Unit, T], Matchers[js.Promise[Unit], T]]
  type JestMatchersShape[TNonPromise /* <: js.Object */, TPromise /* <: js.Object */] = Anon_Rejects[TPromise] with AndNot[TNonPromise]
  type Lifecycle = js.Function2[/* fn */ ProvidesCallback, /* timeout */ js.UndefOr[Double], js.Any]
  // Console
  type LogMessage = String
  type MatcherContext = MatcherUtils with MatcherState
  // types for implementing custom interfaces, from https://github.com/facebook/jest/tree/dd6c5c4/types
  // https://facebook.github.io/jest/docs/en/configuration.html#transform-object-string-string
  // const transformer: Transformer;
  // https://facebook.github.io/jest/docs/en/configuration.html#reporters-array-modulename-modulename-options
  // const reporter: Reporter;
  // https://facebook.github.io/jest/docs/en/configuration.html#testrunner-string
  // const testRunner: TestFramework;
  // https://facebook.github.io/jest/docs/en/configuration.html#testresultsprocessor-string
  // const testResultsProcessor: TestResultsProcessor;
  // leave above declarations for referencing type-dependencies
  // .vscode/settings.json: "typescript.referencesCodeLens.enabled": true
  // custom
  // flow's Maybe type https://flow.org/en/docs/types/primitives/#toc-maybe-types
  type Maybe[T] = js.UndefOr[Unit | Null | T]
  type Milliseconds = Double
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
  type MockedClass[T /* <: Constructable */] = (MockInstance[InstanceType[T], _]) with js.Object with T
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
  type MockedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = (MockInstance[ReturnType[T], ArgsType[T]]) with T
  type ModuleMap = js.Any
  type ModuleMocker = js.Any
  type NonAsyncMatchers[TMatchers /* <: ExpectExtendMap */] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof TMatchers ]: std.ReturnType<TMatchers[K]> extends std.Promise<jest.jest.jest.CustomMatcherResult>? never : K}[keyof TMatchers] */ js.Any
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with String
  type NonPromiseMatchers[T /* <: JestMatchersShape[js.Object, js.Object] */] = Omit[T, resolves | rejects | not]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  // Config
  type Path = String
  type PromiseMatchers[T /* <: JestMatchersShape[js.Object, js.Object] */] = Omit[
    /* import warning: ImportType.apply Failed type conversion: T['resolves'] */ js.Any, 
    not
  ]
  type ProvidesCallback = js.Function1[/* cb */ DoneCallback, js.Any]
  type RawCoverage = StringDictionary[RawFileCoverage]
  type RejectedValue[T] = js.Any
  type RemoveFirstFromTuple[T /* <: js.Array[_] */] = js.Array[js.Any]
  type ReporterConfig = js.Tuple2[String, js.Object]
  type ResolvedValue[T] = js.Any | T
  type Runtime = js.Any
  type Script = js.Any
  type SpyInstance[T, Y /* <: js.Array[_] */] = MockInstance[T, Y]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ Environment, 
    /* runtime */ Runtime, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
  type TestResultsProcessor = js.Function1[/* testResult */ AggregatedResult, AggregatedResult]
}
