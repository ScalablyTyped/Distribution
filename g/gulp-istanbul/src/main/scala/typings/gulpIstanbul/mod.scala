package typings.gulpIstanbul

import typings.gulpIstanbul.anon.CoverageVariable
import typings.gulpIstanbul.anon.Dir
import typings.gulpIstanbul.anon.Each
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-istanbul", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-istanbul", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ReadWriteStream = js.native
  
  @JSImport("gulp-istanbul", "enforceThresholds")
  @js.native
  def enforceThresholds(): ReadWriteStream = js.native
  @JSImport("gulp-istanbul", "enforceThresholds")
  @js.native
  def enforceThresholds(opts: ThresholdOptions): ReadWriteStream = js.native
  
  @JSImport("gulp-istanbul", "hookRequire")
  @js.native
  def hookRequire(): ReadWriteStream = js.native
  
  @JSImport("gulp-istanbul", "summarizeCoverage")
  @js.native
  def summarizeCoverage(): Coverage = js.native
  @JSImport("gulp-istanbul", "summarizeCoverage")
  @js.native
  def summarizeCoverage(opts: CoverageVariable): Coverage = js.native
  
  @JSImport("gulp-istanbul", "writeReports")
  @js.native
  def writeReports(): ReadWriteStream = js.native
  @JSImport("gulp-istanbul", "writeReports")
  @js.native
  def writeReports(opts: ReportOptions): ReadWriteStream = js.native
  
  @js.native
  trait Coverage extends StObject {
    
    var branches: CoverageStats = js.native
    
    var functions: CoverageStats = js.native
    
    var lines: CoverageStats = js.native
    
    var statements: CoverageStats = js.native
  }
  object Coverage {
    
    @scala.inline
    def apply(branches: CoverageStats, functions: CoverageStats, lines: CoverageStats, statements: CoverageStats): Coverage = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coverage]
    }
    
    @scala.inline
    implicit class CoverageMutableBuilder[Self <: Coverage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: CoverageStats): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctions(value: CoverageStats): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: CoverageStats): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: CoverageStats): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CoverageOptions extends StObject {
    
    var branches: js.UndefOr[Double] = js.native
    
    var functions: js.UndefOr[Double] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var statements: js.UndefOr[Double] = js.native
  }
  object CoverageOptions {
    
    @scala.inline
    def apply(): CoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverageOptions]
    }
    
    @scala.inline
    implicit class CoverageOptionsMutableBuilder[Self <: CoverageOptions] (val x: Self) extends AnyVal {
      
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
  trait CoverageStats extends StObject {
    
    var covered: Double = js.native
    
    var pct: Double = js.native
    
    var skipped: Double = js.native
    
    var total: Double = js.native
  }
  object CoverageStats {
    
    @scala.inline
    def apply(covered: Double, pct: Double, skipped: Double, total: Double): CoverageStats = {
      val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageStats]
    }
    
    @scala.inline
    implicit class CoverageStatsMutableBuilder[Self <: CoverageStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var codeGenerationOptions: js.UndefOr[js.Object] = js.native
    
    var coverageVariable: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var embedSource: js.UndefOr[Boolean] = js.native
    
    var includeUntested: js.UndefOr[Boolean] = js.native
    
    var noAutoWrap: js.UndefOr[Boolean] = js.native
    
    var noCompact: js.UndefOr[Boolean] = js.native
    
    var preserveComments: js.UndefOr[Boolean] = js.native
    
    var walkDebug: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeGenerationOptions(value: js.Object): Self = StObject.set(x, "codeGenerationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeGenerationOptionsUndefined: Self = StObject.set(x, "codeGenerationOptions", js.undefined)
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEmbedSource(value: Boolean): Self = StObject.set(x, "embedSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedSourceUndefined: Self = StObject.set(x, "embedSource", js.undefined)
      
      @scala.inline
      def setIncludeUntested(value: Boolean): Self = StObject.set(x, "includeUntested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUntestedUndefined: Self = StObject.set(x, "includeUntested", js.undefined)
      
      @scala.inline
      def setNoAutoWrap(value: Boolean): Self = StObject.set(x, "noAutoWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAutoWrapUndefined: Self = StObject.set(x, "noAutoWrap", js.undefined)
      
      @scala.inline
      def setNoCompact(value: Boolean): Self = StObject.set(x, "noCompact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCompactUndefined: Self = StObject.set(x, "noCompact", js.undefined)
      
      @scala.inline
      def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      @scala.inline
      def setWalkDebug(value: Boolean): Self = StObject.set(x, "walkDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalkDebugUndefined: Self = StObject.set(x, "walkDebug", js.undefined)
    }
  }
  
  @js.native
  trait ReportOptions extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var reportOpts: js.UndefOr[Dir] = js.native
    
    var reporters: js.UndefOr[js.Array[String]] = js.native
  }
  object ReportOptions {
    
    @scala.inline
    def apply(): ReportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOptions]
    }
    
    @scala.inline
    implicit class ReportOptionsMutableBuilder[Self <: ReportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setReportOpts(value: Dir): Self = StObject.set(x, "reportOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportOptsUndefined: Self = StObject.set(x, "reportOpts", js.undefined)
      
      @scala.inline
      def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ThresholdOptions extends StObject {
    
    var coverageVariable: js.UndefOr[String] = js.native
    
    var thresholds: js.UndefOr[Each] = js.native
  }
  object ThresholdOptions {
    
    @scala.inline
    def apply(): ThresholdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdOptions]
    }
    
    @scala.inline
    implicit class ThresholdOptionsMutableBuilder[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageVariableUndefined: Self = StObject.set(x, "coverageVariable", js.undefined)
      
      @scala.inline
      def setThresholds(value: Each): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    }
  }
}
