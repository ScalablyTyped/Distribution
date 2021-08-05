package typings.jsreportPhantomPdf

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import typings.jsreportPhantomPdf.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Options> */
  trait PartialOptions extends StObject {
    
    var allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined
    
    var defaultPhantomjsVersion: js.UndefOr[String] = js.undefined
    
    var strategy: js.UndefOr[`dedicated-process` | `phantom-server`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowLocalFilesAccessUndefined: Self = StObject.set(x, "allowLocalFilesAccess", js.undefined)
      
      inline def setDefaultPhantomjsVersion(value: String): Self = StObject.set(x, "defaultPhantomjsVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultPhantomjsVersionUndefined: Self = StObject.set(x, "defaultPhantomjsVersion", js.undefined)
      
      inline def setStrategy(value: `dedicated-process` | `phantom-server`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Phantom> */
  trait PartialPhantom extends StObject {
    
    var blockJavaScript: js.UndefOr[Boolean] = js.undefined
    
    var customPhantomJS: js.UndefOr[Boolean] = js.undefined
    
    var fitToPage: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[String] = js.undefined
    
    var footerHeight: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerHeight: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String | Margin] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var phantomjsVersion: js.UndefOr[String] = js.undefined
    
    var resourceTimeout: js.UndefOr[Double] = js.undefined
    
    var waitForJS: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object PartialPhantom {
    
    inline def apply(): PartialPhantom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPhantom]
    }
    
    extension [Self <: PartialPhantom](x: Self) {
      
      inline def setBlockJavaScript(value: Boolean): Self = StObject.set(x, "blockJavaScript", value.asInstanceOf[js.Any])
      
      inline def setBlockJavaScriptUndefined: Self = StObject.set(x, "blockJavaScript", js.undefined)
      
      inline def setCustomPhantomJS(value: Boolean): Self = StObject.set(x, "customPhantomJS", value.asInstanceOf[js.Any])
      
      inline def setCustomPhantomJSUndefined: Self = StObject.set(x, "customPhantomJS", js.undefined)
      
      inline def setFitToPage(value: Boolean): Self = StObject.set(x, "fitToPage", value.asInstanceOf[js.Any])
      
      inline def setFitToPageUndefined: Self = StObject.set(x, "fitToPage", js.undefined)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterHeight(value: String): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      inline def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeight(value: String): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: String | Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPhantomjsVersion(value: String): Self = StObject.set(x, "phantomjsVersion", value.asInstanceOf[js.Any])
      
      inline def setPhantomjsVersionUndefined: Self = StObject.set(x, "phantomjsVersion", js.undefined)
      
      inline def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
      
      inline def setResourceTimeoutUndefined: Self = StObject.set(x, "resourceTimeout", js.undefined)
      
      inline def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      inline def setWaitForJSUndefined: Self = StObject.set(x, "waitForJS", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
