package typings.htmlPdfNode

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-pdf-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePdf(file: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generatePdf(file: File, options: Unit, callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generatePdf(file: File, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generatePdf(
    file: File,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generatePdfs(files: js.Array[File]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePdfs")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generatePdfs(
    files: js.Array[File],
    options: Unit,
    callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdfs")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generatePdfs(files: js.Array[File], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdfs")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generatePdfs(
    files: js.Array[File],
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdfs")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait File extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
    
    var footerTemplate: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[OptionsMargin] = js.undefined
    
    var pageRanges: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
    
    var printBackground: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
      
      inline def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
      
      inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      inline def setMargin(value: OptionsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
      
      inline def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
      
      inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      inline def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OptionsMargin extends StObject {
    
    var bottom: js.UndefOr[String | Double] = js.undefined
    
    var left: js.UndefOr[String | Double] = js.undefined
    
    var right: js.UndefOr[String | Double] = js.undefined
    
    var top: js.UndefOr[String | Double] = js.undefined
  }
  object OptionsMargin {
    
    inline def apply(): OptionsMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsMargin]
    }
    
    extension [Self <: OptionsMargin](x: Self) {
      
      inline def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
