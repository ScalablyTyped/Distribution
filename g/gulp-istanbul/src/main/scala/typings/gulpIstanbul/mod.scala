package typings.gulpIstanbul

import typings.gulpIstanbul.anon.CoverageVariable
import typings.gulpIstanbul.anon.Dir
import typings.gulpIstanbul.anon.Each
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(opts: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-istanbul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enforceThresholds(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceThresholds")().asInstanceOf[ReadWriteStream]
  inline def enforceThresholds(opts: ThresholdOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceThresholds")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  inline def hookRequire(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("hookRequire")().asInstanceOf[ReadWriteStream]
  
  inline def summarizeCoverage(): Coverage = ^.asInstanceOf[js.Dynamic].applyDynamic("summarizeCoverage")().asInstanceOf[Coverage]
  inline def summarizeCoverage(opts: CoverageVariable): Coverage = ^.asInstanceOf[js.Dynamic].applyDynamic("summarizeCoverage")(opts.asInstanceOf[js.Any]).asInstanceOf[Coverage]
  
  inline def writeReports(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("writeReports")().asInstanceOf[ReadWriteStream]
  inline def writeReports(opts: ReportOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("writeReports")(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  trait Coverage extends StObject {
    
    var branches: CoverageStats
    
    var functions: CoverageStats
    
    var lines: CoverageStats
    
    var statements: CoverageStats
  }
  object Coverage {
    
    inline def apply(branches: CoverageStats, functions: CoverageStats, lines: CoverageStats, statements: CoverageStats): Coverage = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coverage]
    }
    
    extension [Self <: Coverage](x: Self) {
      
      inline def setBranches(value: CoverageStats): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: CoverageStats): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLines(value: CoverageStats): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: CoverageStats): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoverageOptions extends StObject {
    
    var branches: js.UndefOr[Double] = js.undefined
    
    var functions: js.UndefOr[Double] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var statements: js.UndefOr[Double] = js.undefined
  }
  object CoverageOptions {
    
    inline def apply(): CoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverageOptions]
    }
    
    extension [Self <: CoverageOptions](x: Self) {
      
      inline def setBranches(value: Double): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setFunctions(value: Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
  
  trait CoverageStats extends StObject {
    
    var covered: Double
    
    var pct: Double
    
    var skipped: Double
    
    var total: Double
  }
  object CoverageStats {
    
    inline def apply(covered: Double, pct: Double, skipped: Double, total: Double): CoverageStats = {
      val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageStats]
    }
    
    extension [Self <: CoverageStats](x: Self) {
      
      inline def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      inline def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var codeGenerationOptions: js.UndefOr[js.Object] = js.undefined
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var embedSource: js.UndefOr[Boolean] = js.undefined
    
    var includeUntested: js.UndefOr[Boolean] = js.undefined
    
    var noAutoWrap: js.UndefOr[Boolean] = js.undefined
    
    var noCompact: js.UndefOr[Boolean] = js.undefined
    
    var preserveComments: js.UndefOr[Boolean] = js.undefined
    
    var walkDebug: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCodeGenerationOptions(value: js.Object): Self = StObject.set(x, "codeGenerationOptions", value.asInstanceOf[js.Any])
      
      inline def setCodeGenerationOptionsUndefined: Self = StObject.set(x, "codeGenerationOptions", js.undefined)
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEmbedSource(value: Boolean): Self = StObject.set(x, "embedSource", value.asInstanceOf[js.Any])
      
      inline def setEmbedSourceUndefined: Self = StObject.set(x, "embedSource", js.undefined)
      
      inline def setIncludeUntested(value: Boolean): Self = StObject.set(x, "includeUntested", value.asInstanceOf[js.Any])
      
      inline def setIncludeUntestedUndefined: Self = StObject.set(x, "includeUntested", js.undefined)
      
      inline def setNoAutoWrap(value: Boolean): Self = StObject.set(x, "noAutoWrap", value.asInstanceOf[js.Any])
      
      inline def setNoAutoWrapUndefined: Self = StObject.set(x, "noAutoWrap", js.undefined)
      
      inline def setNoCompact(value: Boolean): Self = StObject.set(x, "noCompact", value.asInstanceOf[js.Any])
      
      inline def setNoCompactUndefined: Self = StObject.set(x, "noCompact", js.undefined)
      
      inline def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      inline def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      inline def setWalkDebug(value: Boolean): Self = StObject.set(x, "walkDebug", value.asInstanceOf[js.Any])
      
      inline def setWalkDebugUndefined: Self = StObject.set(x, "walkDebug", js.undefined)
    }
  }
  
  trait ReportOptions extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var reportOpts: js.UndefOr[Dir] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReportOptions {
    
    inline def apply(): ReportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOptions]
    }
    
    extension [Self <: ReportOptions](x: Self) {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setReportOpts(value: Dir): Self = StObject.set(x, "reportOpts", value.asInstanceOf[js.Any])
      
      inline def setReportOptsUndefined: Self = StObject.set(x, "reportOpts", js.undefined)
      
      inline def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value :_*))
    }
  }
  
  trait ThresholdOptions extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.undefined
    
    var thresholds: js.UndefOr[Each] = js.undefined
  }
  object ThresholdOptions {
    
    inline def apply(): ThresholdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdOptions]
    }
    
    extension [Self <: ThresholdOptions](x: Self) {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      inline def setThresholds(value: Each): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    }
  }
}
