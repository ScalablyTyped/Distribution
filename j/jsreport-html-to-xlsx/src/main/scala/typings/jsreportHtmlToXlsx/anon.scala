package typings.jsreportHtmlToXlsx

import typings.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod.htmlEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HtmlEngine extends StObject {
    
    var htmlEngine: typings.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod.htmlEngine
  }
  object HtmlEngine {
    
    @scala.inline
    def apply(htmlEngine: htmlEngine): HtmlEngine = {
      val __obj = js.Dynamic.literal(htmlEngine = htmlEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlEngine]
    }
    
    @scala.inline
    implicit class HtmlEngineMutableBuilder[Self <: HtmlEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlEngine(value: htmlEngine): Self = StObject.set(x, "htmlEngine", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<jsreport-html-to-xlsx.jsreport-html-to-xlsx.Options> */
  trait PartialOptions extends StObject {
    
    var addBufferSize: js.UndefOr[Double] = js.undefined
    
    var escapeAmp: js.UndefOr[Boolean] = js.undefined
    
    var numberOfParsedAddIterations: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBufferSize(value: Double): Self = StObject.set(x, "addBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddBufferSizeUndefined: Self = StObject.set(x, "addBufferSize", js.undefined)
      
      @scala.inline
      def setEscapeAmp(value: Boolean): Self = StObject.set(x, "escapeAmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeAmpUndefined: Self = StObject.set(x, "escapeAmp", js.undefined)
      
      @scala.inline
      def setNumberOfParsedAddIterations(value: Double): Self = StObject.set(x, "numberOfParsedAddIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfParsedAddIterationsUndefined: Self = StObject.set(x, "numberOfParsedAddIterations", js.undefined)
      
      @scala.inline
      def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
