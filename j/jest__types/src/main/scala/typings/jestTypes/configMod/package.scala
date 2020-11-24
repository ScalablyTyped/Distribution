package typings.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type Argv = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Arguments<Partial<{  all :boolean,   automock :boolean,   bail :boolean | number,   cache :boolean,   cacheDirectory :string,   changedFilesWithAncestor :boolean,   changedSince :string,   ci :boolean,   clearCache :boolean,   clearMocks :boolean,   collectCoverage :boolean,   collectCoverageFrom :string,   collectCoverageOnlyFrom :Array<string>,   color :boolean,   colors :boolean,   config :string,   coverage :boolean,   coverageDirectory :string,   coveragePathIgnorePatterns :Array<string>,   coverageReporters :Array<string>,   coverageThreshold :string,   debug :boolean,   env :string,   expand :boolean,   findRelatedTests :boolean,   forceExit :boolean,   globals :string,   globalSetup :string | null | undefined,   globalTeardown :string | null | undefined,   haste :string,   init :boolean,   injectGlobals :boolean,   json :boolean,   lastCommit :boolean,   logHeapUsage :boolean,   maxWorkers :number | string,   moduleDirectories :Array<string>,   moduleFileExtensions :Array<string>,   moduleNameMapper :string,   modulePathIgnorePatterns :Array<string>,   modulePaths :Array<string>,   noStackTrace :boolean,   notify :boolean,   notifyMode :string,   onlyChanged :boolean,   onlyFailures :boolean,   outputFile :string,   preset :string | null | undefined,   projects :Array<string>,   prettierPath :string | null | undefined,   resetMocks :boolean,   resetModules :boolean,   resolver :string | null | undefined,   restoreMocks :boolean,   rootDir :string,   roots :Array<string>,   runInBand :boolean,   selectProjects :Array<string>,   setupFiles :Array<string>,   setupFilesAfterEnv :Array<string>,   showConfig :boolean,   silent :boolean,   snapshotSerializers :Array<string>,   testEnvironment :string,   testFailureExitCode :string | null | undefined,   testMatch :Array<string>,   testNamePattern :string,   testPathIgnorePatterns :Array<string>,   testPathPattern :Array<string>,   testRegex :string | Array<string>,   testResultsProcessor :string,   testRunner :string,   testSequencer :string,   testURL :string,   testTimeout :number | null | undefined,   timers :string,   transform :string,   transformIgnorePatterns :Array<string>,   unmockedModulePathPatterns :Array<string> | null | undefined,   updateSnapshot :boolean,   useStderr :boolean,   verbose :boolean,   version :boolean,   watch :boolean,   watchAll :boolean,   watchman :boolean,   watchPathIgnorePatterns :Array<string>}>> */ js.Any
  
  type ConfigGlobals = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type CoverageReporterWithOptions[K] = js.Tuple2[
    K, 
    typings.std.Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: istanbul-reports.istanbul-reports.ReportOptions[K] */ js.Any
    ]
  ]
  
  type CoverageReporters = js.Array[
    typings.jestTypes.configMod.CoverageReporterName | typings.jestTypes.configMod.CoverageReporterWithOptions[typings.jestTypes.configMod.CoverageReporterName]
  ]
  
  type Glob = java.lang.String
  
  type Path = java.lang.String
  
  type ReporterConfig = js.Tuple2[java.lang.String, typings.std.Record[java.lang.String, js.Any]]
  
  type TransformerConfig = js.Tuple2[java.lang.String, typings.std.Record[java.lang.String, js.Any]]
}
