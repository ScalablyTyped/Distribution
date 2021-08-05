package typings.istanbulLibReport

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.mod.Summarizers
import typings.istanbulLibReport.mod.Watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ContextOptions> */
  trait PartialContextOptions extends StObject {
    
    var coverageMap: js.UndefOr[CoverageMap] = js.undefined
    
    var defaultSummarizer: js.UndefOr[Summarizers] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var sourceFinder: js.UndefOr[js.Function1[/* filepath */ String, String]] = js.undefined
    
    var watermarks: js.UndefOr[PartialWatermarks] = js.undefined
  }
  object PartialContextOptions {
    
    inline def apply(): PartialContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContextOptions]
    }
    
    extension [Self <: PartialContextOptions](x: Self) {
      
      inline def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
      
      inline def setCoverageMapUndefined: Self = StObject.set(x, "coverageMap", js.undefined)
      
      inline def setDefaultSummarizer(value: Summarizers): Self = StObject.set(x, "defaultSummarizer", value.asInstanceOf[js.Any])
      
      inline def setDefaultSummarizerUndefined: Self = StObject.set(x, "defaultSummarizer", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setSourceFinder(value: /* filepath */ String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      inline def setSourceFinderUndefined: Self = StObject.set(x, "sourceFinder", js.undefined)
      
      inline def setWatermarks(value: PartialWatermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
      
      inline def setWatermarksUndefined: Self = StObject.set(x, "watermarks", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ReportBaseOptions> */
  trait PartialReportBaseOptions extends StObject {
    
    var summarizer: js.UndefOr[Summarizers] = js.undefined
  }
  object PartialReportBaseOptions {
    
    inline def apply(): PartialReportBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReportBaseOptions]
    }
    
    extension [Self <: PartialReportBaseOptions](x: Self) {
      
      inline def setSummarizer(value: Summarizers): Self = StObject.set(x, "summarizer", value.asInstanceOf[js.Any])
      
      inline def setSummarizerUndefined: Self = StObject.set(x, "summarizer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.Watermarks> */
  trait PartialWatermarks extends StObject {
    
    var branches: js.UndefOr[Watermark] = js.undefined
    
    var functions: js.UndefOr[Watermark] = js.undefined
    
    var lines: js.UndefOr[Watermark] = js.undefined
    
    var statements: js.UndefOr[Watermark] = js.undefined
  }
  object PartialWatermarks {
    
    inline def apply(): PartialWatermarks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWatermarks]
    }
    
    extension [Self <: PartialWatermarks](x: Self) {
      
      inline def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    }
  }
}
