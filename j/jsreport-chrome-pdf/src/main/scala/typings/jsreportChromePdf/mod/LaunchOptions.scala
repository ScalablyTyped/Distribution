package typings.jsreportChromePdf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.anon.Partialwidthstringheights
import typings.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typings.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#puppeteerlaunchoptions
@js.native
trait LaunchOptions extends js.Object {
  
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
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewport(value: Partialwidthstringheights): Self = this.set("defaultViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumpio(value: Boolean): Self = this.set("dumpio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = this.set("extraPrefsFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleSIGHUP(value: Boolean): Self = this.set("handleSIGHUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleSIGINT(value: Boolean): Self = this.set("handleSIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleSIGTERM(value: Boolean): Self = this.set("handleSIGTERM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDefaultArgsVarargs(value: String*): Self = this.set("ignoreDefaultArgs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = this.set("ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreHTTPSErrors(value: Boolean): Self = this.set("ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: Boolean): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: chrome | firefox): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowMo(value: Double): Self = this.set("slowMo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataDir(value: String): Self = this.set("userDataDir", value.asInstanceOf[js.Any])
  }
}
