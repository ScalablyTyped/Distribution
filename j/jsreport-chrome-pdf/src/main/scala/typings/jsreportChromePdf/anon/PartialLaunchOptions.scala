package typings.jsreportChromePdf.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typings.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.LaunchOptions> */
@js.native
trait PartialLaunchOptions extends js.Object {
  
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var defaultViewport: js.UndefOr[Partialwidthstringheights] = js.native
  
  var devtools: js.UndefOr[Boolean] = js.native
  
  var dumpio: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  var executablePath: js.UndefOr[String] = js.native
  
  var extraPrefsFirefox: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var handleSIGHUP: js.UndefOr[Boolean] = js.native
  
  var handleSIGINT: js.UndefOr[Boolean] = js.native
  
  var handleSIGTERM: js.UndefOr[Boolean] = js.native
  
  var headless: js.UndefOr[Boolean] = js.native
  
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  
  var pipe: js.UndefOr[Boolean] = js.native
  
  var product: js.UndefOr[chrome | firefox] = js.native
  
  var slowMo: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var userDataDir: js.UndefOr[String] = js.native
}
object PartialLaunchOptions {
  
  @scala.inline
  def apply(): PartialLaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLaunchOptions]
  }
  
  @scala.inline
  implicit class PartialLaunchOptionsOps[Self <: PartialLaunchOptions] (val x: Self) extends AnyVal {
    
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
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDefaultViewport(value: Partialwidthstringheights): Self = this.set("defaultViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultViewport: Self = this.set("defaultViewport", js.undefined)
    
    @scala.inline
    def setDevtools(value: Boolean): Self = this.set("devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools: Self = this.set("devtools", js.undefined)
    
    @scala.inline
    def setDumpio(value: Boolean): Self = this.set("dumpio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpio: Self = this.set("dumpio", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutablePath: Self = this.set("executablePath", js.undefined)
    
    @scala.inline
    def setExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = this.set("extraPrefsFirefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraPrefsFirefox: Self = this.set("extraPrefsFirefox", js.undefined)
    
    @scala.inline
    def setHandleSIGHUP(value: Boolean): Self = this.set("handleSIGHUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGHUP: Self = this.set("handleSIGHUP", js.undefined)
    
    @scala.inline
    def setHandleSIGINT(value: Boolean): Self = this.set("handleSIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGINT: Self = this.set("handleSIGINT", js.undefined)
    
    @scala.inline
    def setHandleSIGTERM(value: Boolean): Self = this.set("handleSIGTERM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGTERM: Self = this.set("handleSIGTERM", js.undefined)
    
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    
    @scala.inline
    def setIgnoreDefaultArgsVarargs(value: String*): Self = this.set("ignoreDefaultArgs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = this.set("ignoreDefaultArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDefaultArgs: Self = this.set("ignoreDefaultArgs", js.undefined)
    
    @scala.inline
    def setIgnoreHTTPSErrors(value: Boolean): Self = this.set("ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHTTPSErrors: Self = this.set("ignoreHTTPSErrors", js.undefined)
    
    @scala.inline
    def setPipe(value: Boolean): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setProduct(value: chrome | firefox): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setSlowMo(value: Double): Self = this.set("slowMo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowMo: Self = this.set("slowMo", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserDataDir(value: String): Self = this.set("userDataDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataDir: Self = this.set("userDataDir", js.undefined)
  }
}
