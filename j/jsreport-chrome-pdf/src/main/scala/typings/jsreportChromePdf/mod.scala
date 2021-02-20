package typings.jsreportChromePdf

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.anon.Bottom
import typings.jsreportChromePdf.anon.Height
import typings.jsreportChromePdf.anon.PartialChrome
import typings.jsreportChromePdf.anon.PartialChromeImage
import typings.jsreportChromePdf.anon.PartialLaunchOptions
import typings.jsreportChromePdf.anon.PartialOptions
import typings.jsreportChromePdf.anon.Partialwidthstringheights
import typings.jsreportChromePdf.jsreportChromePdfStrings.`chrome-image`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`chrome-pdf`
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
import typings.jsreportCore.mod.ExtensionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-chrome-pdf", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-chrome-pdf", JSImport.Namespace)
  @js.native
  def apply(options: PartialOptions): ExtensionDefinition = js.native
  
  // https://jsreport.net/learn/chrome-pdf
  // https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
  @js.native
  trait Chrome extends StObject {
    
    var displayHeaderFooter: Boolean = js.native
    
    var footerTemplate: String = js.native
    
    // 1-5, 8, 11-13
    var format: String = js.native
    
    // https://github.com/jsreport/jsreport-chrome-pdf/blob/master/test/chromeTest.js
    var header: String = js.native
    
    var headerTemplate: String = js.native
    
    var height: String | Double = js.native
    
    var landscape: Boolean = js.native
    
    var margin: Bottom = js.native
    
    var marginBottom: String | Double = js.native
    
    var marginLeft: String | Double = js.native
    
    var marginRight: String | Double = js.native
    
    // https://jsreport.net/learn/chrome-pdf
    var marginTop: String | Double = js.native
    
    var mediaType: screen | print = js.native
    
    var pageNumber: Double = js.native
    
    var pageRanges: String = js.native
    
    var path: String = js.native
    
    var preferCSSPageSize: Boolean = js.native
    
    var printBackground: Boolean = js.native
    
    var scale: Double = js.native
    
    var totalPages: Double = js.native
    
    var url: String = js.native
    
    var waitForJS: Boolean = js.native
    
    var waitForNetworkIddle: Boolean = js.native
    
    var width: String | Double = js.native
  }
  object Chrome {
    
    @scala.inline
    def apply(
      displayHeaderFooter: Boolean,
      footerTemplate: String,
      format: String,
      header: String,
      headerTemplate: String,
      height: String | Double,
      landscape: Boolean,
      margin: Bottom,
      marginBottom: String | Double,
      marginLeft: String | Double,
      marginRight: String | Double,
      marginTop: String | Double,
      mediaType: screen | print,
      pageNumber: Double,
      pageRanges: String,
      path: String,
      preferCSSPageSize: Boolean,
      printBackground: Boolean,
      scale: Double,
      totalPages: Double,
      url: String,
      waitForJS: Boolean,
      waitForNetworkIddle: Boolean,
      width: String | Double
    ): Chrome = {
      val __obj = js.Dynamic.literal(displayHeaderFooter = displayHeaderFooter.asInstanceOf[js.Any], footerTemplate = footerTemplate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageRanges = pageRanges.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], preferCSSPageSize = preferCSSPageSize.asInstanceOf[js.Any], printBackground = printBackground.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], waitForNetworkIddle = waitForNetworkIddle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chrome]
    }
    
    @scala.inline
    implicit class ChromeMutableBuilder[Self <: Chrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: String | Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeft(value: String | Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRight(value: String | Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTop(value: String | Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: screen | print): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForNetworkIddle(value: Boolean): Self = StObject.set(x, "waitForNetworkIddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // https://jsreport.net/learn/chrome-image
  // https://github.com/puppeteer/puppeteer/blob/v1.11.0/docs/api.md#pagescreenshotoptions
  @js.native
  trait ChromeImage extends StObject {
    
    var clip: Height = js.native
    
    var encoding: base64 | binary = js.native
    
    // 0-100
    var fullPage: Boolean = js.native
    
    var omitBackground: Boolean = js.native
    
    var path: String = js.native
    
    var quality: Double = js.native
    
    var `type`: jpeg | png = js.native
  }
  object ChromeImage {
    
    @scala.inline
    def apply(
      clip: Height,
      encoding: base64 | binary,
      fullPage: Boolean,
      omitBackground: Boolean,
      path: String,
      quality: Double,
      `type`: jpeg | png
    ): ChromeImage = {
      val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fullPage = fullPage.asInstanceOf[js.Any], omitBackground = omitBackground.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeImage]
    }
    
    @scala.inline
    implicit class ChromeImageMutableBuilder[Self <: ChromeImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: Height): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: base64 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: jpeg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#puppeteerlaunchoptions
  @js.native
  trait LaunchOptions extends StObject {
    
    var args: js.Array[String] = js.native
    
    var defaultViewport: Partialwidthstringheights = js.native
    
    var devtools: Boolean = js.native
    
    var dumpio: Boolean = js.native
    
    var env: StringDictionary[String] = js.native
    
    var executablePath: String = js.native
    
    var extraPrefsFirefox: StringDictionary[js.Any] = js.native
    
    var handleSIGHUP: Boolean = js.native
    
    var handleSIGINT: Boolean = js.native
    
    var handleSIGTERM: Boolean = js.native
    
    var headless: Boolean = js.native
    
    var ignoreDefaultArgs: Boolean | js.Array[String] = js.native
    
    var ignoreHTTPSErrors: Boolean = js.native
    
    var pipe: Boolean = js.native
    
    var product: chrome | firefox = js.native
    
    var slowMo: Double = js.native
    
    var timeout: Double = js.native
    
    var userDataDir: String = js.native
  }
  object LaunchOptions {
    
    @scala.inline
    def apply(
      args: js.Array[String],
      defaultViewport: Partialwidthstringheights,
      devtools: Boolean,
      dumpio: Boolean,
      env: StringDictionary[String],
      executablePath: String,
      extraPrefsFirefox: StringDictionary[js.Any],
      handleSIGHUP: Boolean,
      handleSIGINT: Boolean,
      handleSIGTERM: Boolean,
      headless: Boolean,
      ignoreDefaultArgs: Boolean | js.Array[String],
      ignoreHTTPSErrors: Boolean,
      pipe: Boolean,
      product: chrome | firefox,
      slowMo: Double,
      timeout: Double,
      userDataDir: String
    ): LaunchOptions = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], defaultViewport = defaultViewport.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], dumpio = dumpio.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], executablePath = executablePath.asInstanceOf[js.Any], extraPrefsFirefox = extraPrefsFirefox.asInstanceOf[js.Any], handleSIGHUP = handleSIGHUP.asInstanceOf[js.Any], handleSIGINT = handleSIGINT.asInstanceOf[js.Any], handleSIGTERM = handleSIGTERM.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], ignoreDefaultArgs = ignoreDefaultArgs.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], slowMo = slowMo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], userDataDir = userDataDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit class LaunchOptionsMutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDefaultViewport(value: Partialwidthstringheights): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
    }
  }
  
  // https://jsreport.net/learn/configuration
  @js.native
  trait Options extends StObject {
    
    var allowLocalFilesAccess: Boolean = js.native
    
    var allowedModules: js.Array[String] = js.native
    
    var host: String = js.native
    
    var launchOptions: PartialLaunchOptions = js.native
    
    var numberOfWorkers: Double = js.native
    
    var portLeftBoundary: Double = js.native
    
    var portRightBoundary: Double = js.native
    
    var strategy: `dedicated-process` | `http-server` | `in-process` = js.native
    
    var timeout: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      allowLocalFilesAccess: Boolean,
      allowedModules: js.Array[String],
      host: String,
      launchOptions: PartialLaunchOptions,
      numberOfWorkers: Double,
      portLeftBoundary: Double,
      portRightBoundary: Double,
      strategy: `dedicated-process` | `http-server` | `in-process`,
      timeout: Double
    ): Options = {
      val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], allowedModules = allowedModules.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], numberOfWorkers = numberOfWorkers.asInstanceOf[js.Any], portLeftBoundary = portLeftBoundary.asInstanceOf[js.Any], portRightBoundary = portRightBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModules(value: js.Array[String]): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchOptions(value: PartialLaunchOptions): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkers(value: Double): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortLeftBoundary(value: Double): Self = StObject.set(x, "portLeftBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortRightBoundary(value: Double): Self = StObject.set(x, "portRightBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var chrome: js.UndefOr[PartialChrome] = js.native
      
      var chromeImage: js.UndefOr[PartialChromeImage] = js.native
      
      var recipe: `chrome-pdf` | `chrome-image` | String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(recipe: `chrome-pdf` | `chrome-image` | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChrome(value: PartialChrome): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChromeImage(value: PartialChromeImage): Self = StObject.set(x, "chromeImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChromeImageUndefined: Self = StObject.set(x, "chromeImage", js.undefined)
        
        @scala.inline
        def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
        
        @scala.inline
        def setRecipe(value: `chrome-pdf` | `chrome-image` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
