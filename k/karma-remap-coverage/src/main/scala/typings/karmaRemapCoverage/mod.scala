package typings.karmaRemapCoverage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Key-value pairs where key is report type and value - path to file/dir where to save it.
      * Reporters like `text-summary`, `text-lcov` and `teamcity` can print out to console as well
      * - in this case just provide any falsy value instead of path.
      *
      * @example
      * ```ts
      * 'text-summary': null, // to show summary in console
      * html: './coverage/html',
      * ```
      *
      * {@link https://github.com/sshev/karma-remap-coverage#remapcoveragereporter-format }
      */
    var remapCoverageReporter: js.UndefOr[KarmaRemapCoverageReporter] = js.undefined
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
      def setRemapCoverageReporter(value: KarmaRemapCoverageReporter): Self = StObject.set(x, "remapCoverageReporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemapCoverageReporterUndefined: Self = StObject.set(x, "remapCoverageReporter", js.undefined)
    }
  }
  
  // remapped reporter types to key-value pairs
  /* Inlined std.Partial<std.Record<karma-coverage.karma.ReporterType, string | null | undefined>> */
  trait KarmaRemapCoverageReporter extends StObject {
    
    var cobertura: js.UndefOr[String | Null] = js.undefined
    
    var html: js.UndefOr[String | Null] = js.undefined
    
    var `in-memory`: js.UndefOr[String | Null] = js.undefined
    
    var json: js.UndefOr[String | Null] = js.undefined
    
    var `json-summary`: js.UndefOr[String | Null] = js.undefined
    
    var lcov: js.UndefOr[String | Null] = js.undefined
    
    var lcovonly: js.UndefOr[String | Null] = js.undefined
    
    var none: js.UndefOr[String | Null] = js.undefined
    
    var teamcity: js.UndefOr[String | Null] = js.undefined
    
    var text: js.UndefOr[String | Null] = js.undefined
    
    var `text-summary`: js.UndefOr[String | Null] = js.undefined
  }
  object KarmaRemapCoverageReporter {
    
    @scala.inline
    def apply(): KarmaRemapCoverageReporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KarmaRemapCoverageReporter]
    }
    
    @scala.inline
    implicit class KarmaRemapCoverageReporterMutableBuilder[Self <: KarmaRemapCoverageReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCobertura(value: String): Self = StObject.set(x, "cobertura", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoberturaNull: Self = StObject.set(x, "cobertura", null)
      
      @scala.inline
      def setCoberturaUndefined: Self = StObject.set(x, "cobertura", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlNull: Self = StObject.set(x, "html", null)
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def `setIn-memory`(value: String): Self = StObject.set(x, "in-memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIn-memoryNull`: Self = StObject.set(x, "in-memory", null)
      
      @scala.inline
      def `setIn-memoryUndefined`: Self = StObject.set(x, "in-memory", js.undefined)
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJson-summary`(value: String): Self = StObject.set(x, "json-summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJson-summaryNull`: Self = StObject.set(x, "json-summary", null)
      
      @scala.inline
      def `setJson-summaryUndefined`: Self = StObject.set(x, "json-summary", js.undefined)
      
      @scala.inline
      def setJsonNull: Self = StObject.set(x, "json", null)
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLcov(value: String): Self = StObject.set(x, "lcov", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcovNull: Self = StObject.set(x, "lcov", null)
      
      @scala.inline
      def setLcovUndefined: Self = StObject.set(x, "lcov", js.undefined)
      
      @scala.inline
      def setLcovonly(value: String): Self = StObject.set(x, "lcovonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcovonlyNull: Self = StObject.set(x, "lcovonly", null)
      
      @scala.inline
      def setLcovonlyUndefined: Self = StObject.set(x, "lcovonly", js.undefined)
      
      @scala.inline
      def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoneNull: Self = StObject.set(x, "none", null)
      
      @scala.inline
      def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
      
      @scala.inline
      def setTeamcity(value: String): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamcityNull: Self = StObject.set(x, "teamcity", null)
      
      @scala.inline
      def setTeamcityUndefined: Self = StObject.set(x, "teamcity", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-summary`(value: String): Self = StObject.set(x, "text-summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-summaryNull`: Self = StObject.set(x, "text-summary", null)
      
      @scala.inline
      def `setText-summaryUndefined`: Self = StObject.set(x, "text-summary", js.undefined)
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
