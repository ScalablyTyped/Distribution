package typings.jest.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jest {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.InstanceType
  import typings.std.ReturnType

  type ArgsType[T] = js.Any
  type Bytes = Double
  type ConfigGlobals = js.Object
  type ConsoleBuffer = js.Array[LogEntry]
  type CustomMatcher = js.ThisFunction2[
    /* this */ MatcherUtils, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    CustomMatcherResult | js.Promise[CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[Unit]
  type Environment = $JestEnvironment
  type ExpectExtendMap = StringDictionary[CustomMatcher]
  type FunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  type Glob = String
  // Global
  type Global = js.Object
  type HasteFS = js.Any
  type HasteResolver = js.Any
  type Lifecycle = js.Function2[/* fn */ ProvidesCallback, /* timeout */ js.UndefOr[Double], js.Any]
  // Console
  type LogMessage = String
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
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with String
  // Config
  type Path = String
  type ProvidesCallback = js.Function1[/* cb */ DoneCallback, js.Any]
  type RawCoverage = StringDictionary[RawFileCoverage]
  type RejectedValue[T] = js.Any
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
