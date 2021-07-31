package typings.jsreportChromePdf

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import typings.jsreportChromePdf.jsreportChromePdfStrings.base64
import typings.jsreportChromePdf.jsreportChromePdfStrings.binary
import typings.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typings.jsreportChromePdf.jsreportChromePdfStrings.firefox
import typings.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typings.jsreportChromePdf.jsreportChromePdfStrings.png
import typings.jsreportChromePdf.jsreportChromePdfStrings.print
import typings.jsreportChromePdf.jsreportChromePdfStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[String | Double] = js.undefined
    
    var left: js.UndefOr[String | Double] = js.undefined
    
    var right: js.UndefOr[String | Double] = js.undefined
    
    var top: js.UndefOr[String | Double] = js.undefined
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Chrome> */
  trait PartialChrome extends StObject {
    
    var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
    
    var footerTemplate: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var landscape: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr[Bottom] = js.undefined
    
    var marginBottom: js.UndefOr[String | Double] = js.undefined
    
    var marginLeft: js.UndefOr[String | Double] = js.undefined
    
    var marginRight: js.UndefOr[String | Double] = js.undefined
    
    var marginTop: js.UndefOr[String | Double] = js.undefined
    
    var mediaType: js.UndefOr[screen | print] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageRanges: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
    
    var printBackground: js.UndefOr[Boolean] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var totalPages: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var waitForJS: js.UndefOr[Boolean] = js.undefined
    
    var waitForNetworkIddle: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object PartialChrome {
    
    @scala.inline
    def apply(): PartialChrome = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChrome]
    }
    
    @scala.inline
    implicit class PartialChromeMutableBuilder[Self <: PartialChrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
      
      @scala.inline
      def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: String | Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: String | Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: String | Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: String | Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMediaType(value: screen | print): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      @scala.inline
      def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
      
      @scala.inline
      def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForJSUndefined: Self = StObject.set(x, "waitForJS", js.undefined)
      
      @scala.inline
      def setWaitForNetworkIddle(value: Boolean): Self = StObject.set(x, "waitForNetworkIddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForNetworkIddleUndefined: Self = StObject.set(x, "waitForNetworkIddle", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.ChromeImage> */
  trait PartialChromeImage extends StObject {
    
    var clip: js.UndefOr[Height] = js.undefined
    
    var encoding: js.UndefOr[base64 | binary] = js.undefined
    
    var fullPage: js.UndefOr[Boolean] = js.undefined
    
    var omitBackground: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[jpeg | png] = js.undefined
  }
  object PartialChromeImage {
    
    @scala.inline
    def apply(): PartialChromeImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChromeImage]
    }
    
    @scala.inline
    implicit class PartialChromeImageMutableBuilder[Self <: PartialChromeImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: Height): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setEncoding(value: base64 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
      
      @scala.inline
      def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setType(value: jpeg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.LaunchOptions> */
  trait PartialLaunchOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultViewport: js.UndefOr[Partialwidthstringheights] = js.undefined
    
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    var dumpio: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var executablePath: js.UndefOr[String] = js.undefined
    
    var extraPrefsFirefox: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
    
    var pipe: js.UndefOr[Boolean] = js.undefined
    
    var product: js.UndefOr[chrome | firefox] = js.undefined
    
    var slowMo: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object PartialLaunchOptions {
    
    @scala.inline
    def apply(): PartialLaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLaunchOptions]
    }
    
    @scala.inline
    implicit class PartialLaunchOptionsMutableBuilder[Self <: PartialLaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDefaultViewport(value: Partialwidthstringheights): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      @scala.inline
      def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      @scala.inline
      def setExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPrefsFirefoxUndefined: Self = StObject.set(x, "extraPrefsFirefox", js.undefined)
      
      @scala.inline
      def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
      
      @scala.inline
      def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      @scala.inline
      def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      @scala.inline
      def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
      
      @scala.inline
      def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
      
      @scala.inline
      def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowMoUndefined: Self = StObject.set(x, "slowMo", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Options> */
  trait PartialOptions extends StObject {
    
    var allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined
    
    var allowedModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var launchOptions: js.UndefOr[PartialLaunchOptions] = js.undefined
    
    var numberOfWorkers: js.UndefOr[Double] = js.undefined
    
    var portLeftBoundary: js.UndefOr[Double] = js.undefined
    
    var portRightBoundary: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
      def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLocalFilesAccessUndefined: Self = StObject.set(x, "allowLocalFilesAccess", js.undefined)
      
      @scala.inline
      def setAllowedModules(value: js.Array[String]): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModulesUndefined: Self = StObject.set(x, "allowedModules", js.undefined)
      
      @scala.inline
      def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLaunchOptions(value: PartialLaunchOptions): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchOptionsUndefined: Self = StObject.set(x, "launchOptions", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Double): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setPortLeftBoundary(value: Double): Self = StObject.set(x, "portLeftBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortLeftBoundaryUndefined: Self = StObject.set(x, "portLeftBoundary", js.undefined)
      
      @scala.inline
      def setPortRightBoundary(value: Double): Self = StObject.set(x, "portRightBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortRightBoundaryUndefined: Self = StObject.set(x, "portRightBoundary", js.undefined)
      
      @scala.inline
      def setStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  width :string,   height :string,   deviceScaleFactor :string,   isMobile :boolean,   hasTouch :boolean,   isLandscape :boolean}> */
  trait Partialwidthstringheights extends StObject {
    
    var deviceScaleFactor: js.UndefOr[String] = js.undefined
    
    var hasTouch: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var isLandscape: js.UndefOr[Boolean] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object Partialwidthstringheights {
    
    @scala.inline
    def apply(): Partialwidthstringheights = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialwidthstringheights]
    }
    
    @scala.inline
    implicit class PartialwidthstringheightsMutableBuilder[Self <: Partialwidthstringheights] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceScaleFactor(value: String): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
      
      @scala.inline
      def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTouchUndefined: Self = StObject.set(x, "hasTouch", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
