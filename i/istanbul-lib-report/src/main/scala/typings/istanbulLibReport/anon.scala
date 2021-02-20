package typings.istanbulLibReport

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.mod.Summarizers
import typings.istanbulLibReport.mod.Watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ContextOptions> */
  @js.native
  trait PartialContextOptions extends StObject {
    
    var coverageMap: js.UndefOr[CoverageMap] = js.native
    
    var defaultSummarizer: js.UndefOr[Summarizers] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var sourceFinder: js.UndefOr[js.Function1[/* filepath */ String, String]] = js.native
    
    var watermarks: js.UndefOr[PartialWatermarks] = js.native
  }
  object PartialContextOptions {
    
    @scala.inline
    def apply(): PartialContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContextOptions]
    }
    
    @scala.inline
    implicit class PartialContextOptionsMutableBuilder[Self <: PartialContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageMapUndefined: Self = StObject.set(x, "coverageMap", js.undefined)
      
      @scala.inline
      def setDefaultSummarizer(value: Summarizers): Self = StObject.set(x, "defaultSummarizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSummarizerUndefined: Self = StObject.set(x, "defaultSummarizer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setSourceFinder(value: /* filepath */ String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceFinderUndefined: Self = StObject.set(x, "sourceFinder", js.undefined)
      
      @scala.inline
      def setWatermarks(value: PartialWatermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ReportBaseOptions> */
  @js.native
  trait PartialReportBaseOptions extends StObject {
    
    var summarizer: js.UndefOr[Summarizers] = js.native
  }
  object PartialReportBaseOptions {
    
    @scala.inline
    def apply(): PartialReportBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReportBaseOptions]
    }
    
    @scala.inline
    implicit class PartialReportBaseOptionsMutableBuilder[Self <: PartialReportBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSummarizer(value: Summarizers): Self = StObject.set(x, "summarizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummarizerUndefined: Self = StObject.set(x, "summarizer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.Watermarks> */
  @js.native
  trait PartialWatermarks extends StObject {
    
    var branches: js.UndefOr[Watermark] = js.native
    
    var functions: js.UndefOr[Watermark] = js.native
    
    var lines: js.UndefOr[Watermark] = js.native
    
    var statements: js.UndefOr[Watermark] = js.native
  }
  object PartialWatermarks {
    
    @scala.inline
    def apply(): PartialWatermarks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWatermarks]
    }
    
    @scala.inline
    implicit class PartialWatermarksMutableBuilder[Self <: PartialWatermarks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
}
