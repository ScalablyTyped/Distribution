package typings.karmaCoverageIstanbulReporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait CoverageIstanbulReporter extends StObject {
    
    /** Combines coverage information from multiple browsers into one report rather than outputting a report for each browser */
    val combineBrowserReports: js.UndefOr[Boolean] = js.native
    
    /**
      * Base output directory.
      * If you include `%browser%` in the path it will be replaced with the karma browser name.
      */
    val dir: js.UndefOr[String] = js.native
    
    /** if using webpack and pre-loaders, work around webpack breaking the source path. */
    val fixWebpackSourcePaths: js.UndefOr[Boolean] = js.native
    
    // TODO: Add istanbul-api
    /** `instrumentation` is used to configure Istanbul API package. */
    val instrumentation: js.UndefOr[js.Any] = js.native
    
    // TODO: Add istanbul-api
    /** Most reporters accept additional config options. You can pass these through the `report-config` option. */
    val `report-config`: js.UndefOr[js.Any] = js.native
    
    /** Reports can be any that are listed {@link https://github.com/istanbuljs/istanbuljs/tree/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-reports/lib here}. */
    val reports: js.UndefOr[js.Array[String]] = js.native
    
    /** Omit files with no statements, no functions and no branches from the report. */
    val skipFilesWithNoCoverage: js.UndefOr[Boolean] = js.native
    
    /**
      * Enforce percentage thresholds.
      * Anything under these percentages will cause karma to fail with an exit code of 1 if not running in watch mode.
      */
    val thresholds: js.UndefOr[ThresholdConfig] = js.native
    
    /** Output config used by istanbul for debugging. */
    val verbose: js.UndefOr[Boolean] = js.native
  }
  object CoverageIstanbulReporter {
    
    @scala.inline
    def apply(): CoverageIstanbulReporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverageIstanbulReporter]
    }
    
    @scala.inline
    implicit class CoverageIstanbulReporterMutableBuilder[Self <: CoverageIstanbulReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombineBrowserReports(value: Boolean): Self = StObject.set(x, "combineBrowserReports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineBrowserReportsUndefined: Self = StObject.set(x, "combineBrowserReports", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFixWebpackSourcePaths(value: Boolean): Self = StObject.set(x, "fixWebpackSourcePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixWebpackSourcePathsUndefined: Self = StObject.set(x, "fixWebpackSourcePaths", js.undefined)
      
      @scala.inline
      def setInstrumentation(value: js.Any): Self = StObject.set(x, "instrumentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumentationUndefined: Self = StObject.set(x, "instrumentation", js.undefined)
      
      @scala.inline
      def `setReport-config`(value: js.Any): Self = StObject.set(x, "report-config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setReport-configUndefined`: Self = StObject.set(x, "report-config", js.undefined)
      
      @scala.inline
      def setReports(value: js.Array[String]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
      
      @scala.inline
      def setReportsVarargs(value: String*): Self = StObject.set(x, "reports", js.Array(value :_*))
      
      @scala.inline
      def setSkipFilesWithNoCoverage(value: Boolean): Self = StObject.set(x, "skipFilesWithNoCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFilesWithNoCoverageUndefined: Self = StObject.set(x, "skipFilesWithNoCoverage", js.undefined)
      
      @scala.inline
      def setThresholds(value: ThresholdConfig): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait Threshold extends StObject {
    
    /** @default 0 */
    val branches: js.UndefOr[Double] = js.native
    
    /** @default 0 */
    val functions: js.UndefOr[Double] = js.native
    
    /** @default 0 */
    val lines: js.UndefOr[Double] = js.native
    
    /** @default 0 */
    val statements: js.UndefOr[Double] = js.native
  }
  object Threshold {
    
    @scala.inline
    def apply(): Threshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Threshold]
    }
    
    @scala.inline
    implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: Double): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setFunctions(value: Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
  
  @js.native
  trait ThresholdConfig extends StObject {
    
    /** Thresholds per file. */
    val each: js.UndefOr[ThresholdsEach] = js.native
    
    /**
      * Set to `true` to not fail the test command when thresholds are not met.
      * @default false
      */
    val emitWarning: js.UndefOr[Boolean] = js.native
    
    /** Thresholds for all files. */
    val global: js.UndefOr[Threshold] = js.native
  }
  object ThresholdConfig {
    
    @scala.inline
    def apply(): ThresholdConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdConfig]
    }
    
    @scala.inline
    implicit class ThresholdConfigMutableBuilder[Self <: ThresholdConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEach(value: ThresholdsEach): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      @scala.inline
      def setGlobal(value: Threshold): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
  
  @js.native
  trait ThresholdsEach extends Threshold {
    
    /** @default {} */
    val overrides: js.UndefOr[StringDictionary[Threshold]] = js.native
  }
  object ThresholdsEach {
    
    @scala.inline
    def apply(): ThresholdsEach = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdsEach]
    }
    
    @scala.inline
    implicit class ThresholdsEachMutableBuilder[Self <: ThresholdsEach] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverrides(value: StringDictionary[Threshold]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  object karmaAugmentingMod {
    
    @js.native
    trait ConfigOptions extends StObject {
      
      /** {@link https://github.com/istanbuljs/istanbuljs/blob/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-api/lib/config.js#L33-L39 Any of these options are valid}. */
      val coverageIstanbulReporter: js.UndefOr[CoverageIstanbulReporter] = js.native
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCoverageIstanbulReporter(value: CoverageIstanbulReporter): Self = StObject.set(x, "coverageIstanbulReporter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoverageIstanbulReporterUndefined: Self = StObject.set(x, "coverageIstanbulReporter", js.undefined)
      }
    }
  }
}
