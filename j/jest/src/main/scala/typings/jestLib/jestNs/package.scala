package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestNs {
  type Bytes = scala.Double
  type ConfigGlobals = js.Object
  type ConsoleBuffer = js.Array[LogEntry]
  type CustomMatcher = js.ThisFunction2[
    /* this */ MatcherUtils, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    CustomMatcherResult | js.Promise[CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[scala.Unit]
  type Environment = $JestEnvironment
  type Glob = java.lang.String
  // Global
  type Global = js.Object
  type HasteFS = js.Any
  type HasteResolver = js.Any
  type Lifecycle = js.Function2[/* fn */ ProvidesCallback, /* timeout */ js.UndefOr[scala.Double], js.Any]
  // Console
  type LogMessage = java.lang.String
  type LogType = jestLib.jestLibStrings.log | jestLib.jestLibStrings.info | jestLib.jestLibStrings.warn | jestLib.jestLibStrings.error
  // types for implementing custom interfaces, from https://github.com/facebook/jest/tree/dd6c5c4/types
  // https://facebook.github.io/jest/docs/en/configuration.html#transform-object-string-string
  // const transformer: Transformer;
  // https://facebook.github.io/jest/docs/en/configuration.html#reporters-array-modulename-modulename-options
  // const reporter: Reporter;
  // https://facebook.github.io/jest/docs/en/configuration.html#testrunner-string
  // const testRunner: TestFramework;
  // https://facebook.github.io/jest/docs/en/configuration.html#testresultsprocessor-string
  // const testResultsProcessor: TestResultsProcessor;
  // leave above declarations for referening type-dependencies
  // .vscode/settings.json: "typescript.referencesCodeLens.enabled": true
  // custom
  // flow's Maybe type https://flow.org/en/docs/types/primitives/#toc-maybe-types
  type Maybe[T] = js.UndefOr[scala.Unit | scala.Null | T]
  type Milliseconds = scala.Double
  /**
    * Wrap module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import { Api } from "../api";
    *
    *  const myApi: jest.Mocked<Api> = new Api() as any;
    *  myApi.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = jestLib.jestLibStrings.Mocked with js.Any with T
  type ModuleMap = js.Any
  type ModuleMocker = js.Any
  // Config
  type Path = java.lang.String
  type ProvidesCallback = js.Function1[/* cb */ DoneCallback, js.Any]
  type ReporterConfig = js.Tuple2[java.lang.String, js.Object]
  type Runtime = js.Any
  type Script = js.Any
  type SnapshotUpdateState = jestLib.jestLibStrings.all | jestLib.jestLibStrings.`new` | jestLib.jestLibStrings.none
  type SpyInstance[T, Y /* <: js.Array[_] */] = MockInstance[T, Y]
  type Status = jestLib.jestLibStrings.passed | jestLib.jestLibStrings.failed | jestLib.jestLibStrings.skipped | jestLib.jestLibStrings.pending
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ Environment, 
    /* runtime */ Runtime, 
    /* testPath */ java.lang.String, 
    js.Promise[TestResult]
  ]
  type TestResultsProcessor = js.Function1[/* testResult */ AggregatedResult, AggregatedResult]
}
