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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-chrome-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // https://jsreport.net/learn/chrome-pdf
  // https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
  trait Chrome extends StObject {
    
    var displayHeaderFooter: Boolean
    
    var footerTemplate: String
    
    // 1-5, 8, 11-13
    var format: String
    
    // https://github.com/jsreport/jsreport-chrome-pdf/blob/master/test/chromeTest.js
    var header: String
    
    var headerTemplate: String
    
    var height: String | Double
    
    var landscape: Boolean
    
    var margin: Bottom
    
    var marginBottom: String | Double
    
    var marginLeft: String | Double
    
    var marginRight: String | Double
    
    // https://jsreport.net/learn/chrome-pdf
    var marginTop: String | Double
    
    var mediaType: screen | print
    
    var pageNumber: Double
    
    var pageRanges: String
    
    var path: String
    
    var preferCSSPageSize: Boolean
    
    var printBackground: Boolean
    
    var scale: Double
    
    var totalPages: Double
    
    var url: String
    
    var waitForJS: Boolean
    
    var waitForNetworkIddle: Boolean
    
    var width: String | Double
  }
  object Chrome {
    
    inline def apply(
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
    
    extension [Self <: Chrome](x: Self) {
      
      inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
      
      inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: String | Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginLeft(value: String | Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginRight(value: String | Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginTop(value: String | Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: screen | print): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
      
      inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWaitForJS(value: Boolean): Self = StObject.set(x, "waitForJS", value.asInstanceOf[js.Any])
      
      inline def setWaitForNetworkIddle(value: Boolean): Self = StObject.set(x, "waitForNetworkIddle", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  // https://jsreport.net/learn/chrome-image
  // https://github.com/puppeteer/puppeteer/blob/v1.11.0/docs/api.md#pagescreenshotoptions
  trait ChromeImage extends StObject {
    
    var clip: Height
    
    var encoding: base64 | binary
    
    // 0-100
    var fullPage: Boolean
    
    var omitBackground: Boolean
    
    var path: String
    
    var quality: Double
    
    var `type`: jpeg | png
  }
  object ChromeImage {
    
    inline def apply(
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
    
    extension [Self <: ChromeImage](x: Self) {
      
      inline def setClip(value: Height): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: base64 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
      
      inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setType(value: jpeg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#puppeteerlaunchoptions
  trait LaunchOptions extends StObject {
    
    var args: js.Array[String]
    
    var defaultViewport: Partialwidthstringheights
    
    var devtools: Boolean
    
    var dumpio: Boolean
    
    var env: StringDictionary[String]
    
    var executablePath: String
    
    var extraPrefsFirefox: StringDictionary[js.Any]
    
    var handleSIGHUP: Boolean
    
    var handleSIGINT: Boolean
    
    var handleSIGTERM: Boolean
    
    var headless: Boolean
    
    var ignoreDefaultArgs: Boolean | js.Array[String]
    
    var ignoreHTTPSErrors: Boolean
    
    var pipe: Boolean
    
    var product: chrome | firefox
    
    var slowMo: Double
    
    var timeout: Double
    
    var userDataDir: String
  }
  object LaunchOptions {
    
    inline def apply(
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
    
    extension [Self <: LaunchOptions](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setDefaultViewport(value: Partialwidthstringheights): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
      
      inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: chrome | firefox): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setSlowMo(value: Double): Self = StObject.set(x, "slowMo", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
    }
  }
  
  // https://jsreport.net/learn/configuration
  trait Options extends StObject {
    
    var allowLocalFilesAccess: Boolean
    
    var allowedModules: js.Array[String]
    
    var host: String
    
    var launchOptions: PartialLaunchOptions
    
    var numberOfWorkers: Double
    
    var portLeftBoundary: Double
    
    var portRightBoundary: Double
    
    var strategy: `dedicated-process` | `http-server` | `in-process`
    
    var timeout: Double
  }
  object Options {
    
    inline def apply(
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
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowLocalFilesAccess(value: Boolean): Self = StObject.set(x, "allowLocalFilesAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowedModules(value: js.Array[String]): Self = StObject.set(x, "allowedModules", value.asInstanceOf[js.Any])
      
      inline def setAllowedModulesVarargs(value: String*): Self = StObject.set(x, "allowedModules", js.Array(value :_*))
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setLaunchOptions(value: PartialLaunchOptions): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
      
      inline def setNumberOfWorkers(value: Double): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      inline def setPortLeftBoundary(value: Double): Self = StObject.set(x, "portLeftBoundary", value.asInstanceOf[js.Any])
      
      inline def setPortRightBoundary(value: Double): Self = StObject.set(x, "portRightBoundary", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: `dedicated-process` | `http-server` | `in-process`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var chrome: js.UndefOr[PartialChrome] = js.undefined
      
      var chromeImage: js.UndefOr[PartialChromeImage] = js.undefined
      
      var recipe: `chrome-pdf` | `chrome-image` | String
    }
    object Template {
      
      inline def apply(recipe: `chrome-pdf` | `chrome-image` | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      extension [Self <: Template](x: Self) {
        
        inline def setChrome(value: PartialChrome): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
        
        inline def setChromeImage(value: PartialChromeImage): Self = StObject.set(x, "chromeImage", value.asInstanceOf[js.Any])
        
        inline def setChromeImageUndefined: Self = StObject.set(x, "chromeImage", js.undefined)
        
        inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
        
        inline def setRecipe(value: `chrome-pdf` | `chrome-image` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
