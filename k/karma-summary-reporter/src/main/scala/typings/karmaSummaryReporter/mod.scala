package typings.karmaSummaryReporter

import typings.karmaSummaryReporter.anon.Failure
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.all
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.always
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.failed
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.ifneeded
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.never
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.skipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Show a table detailing the test results for all connected browsers at the end of a test run.
      * This gives a better overview which browsers are broken than the output of other reporters.
      * see {@link https://github.com/sth/karma-summary-reporter#config}
      */
    val summaryReporter: js.UndefOr[SummaryReporterConfig] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setSummaryReporter(value: SummaryReporterConfig): Self = StObject.set(x, "summaryReporter", value.asInstanceOf[js.Any])
      
      inline def setSummaryReporterUndefined: Self = StObject.set(x, "summaryReporter", js.undefined)
    }
  }
  
  trait SummaryReporterConfig extends StObject {
    
    /**
      * Show the list of connected browsers before the result table:
      * * 'always': Show always (default)
      * * 'never': Show never
      * * 'ifneeded': Show only if there are test results shown from multiple browsers
      */
    var browserList: js.UndefOr[always | never | ifneeded] = js.undefined
    
    /**
      * Shows a overview column in the results table, showing the total result of a test over all browsers
      * ("failed" if the test failed anywhere, ...)
      */
    var overviewColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select which tests are displayed in the summary:
      * * 'failed': Only show tests that failed in some browser (default)
      * * 'skipped': Additionally show tests that got skipped in some browser
      * * 'all': Show all test, also ones that didn't fail specLength
      */
    var show: js.UndefOr[failed | skipped | all] = js.undefined
    
    /**
      * Space reserved to display the spec label (width of the first column in the results table).
      */
    var specLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Use custom symbols to indicate success and failure:
      * * success: used for successful test results
      * * failure: used for failed test results
      */
    var symbols: js.UndefOr[Failure] = js.undefined
  }
  object SummaryReporterConfig {
    
    inline def apply(): SummaryReporterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryReporterConfig]
    }
    
    extension [Self <: SummaryReporterConfig](x: Self) {
      
      inline def setBrowserList(value: always | never | ifneeded): Self = StObject.set(x, "browserList", value.asInstanceOf[js.Any])
      
      inline def setBrowserListUndefined: Self = StObject.set(x, "browserList", js.undefined)
      
      inline def setOverviewColumn(value: Boolean): Self = StObject.set(x, "overviewColumn", value.asInstanceOf[js.Any])
      
      inline def setOverviewColumnUndefined: Self = StObject.set(x, "overviewColumn", js.undefined)
      
      inline def setShow(value: failed | skipped | all): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSpecLength(value: Double): Self = StObject.set(x, "specLength", value.asInstanceOf[js.Any])
      
      inline def setSpecLengthUndefined: Self = StObject.set(x, "specLength", js.undefined)
      
      inline def setSymbols(value: Failure): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
