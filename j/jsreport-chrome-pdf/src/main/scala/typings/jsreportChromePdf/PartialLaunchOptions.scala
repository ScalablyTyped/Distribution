package typings.jsreportChromePdf

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typings.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.LaunchOptions> */
trait PartialLaunchOptions extends js.Object {
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
  def apply(
    args: js.Array[String] = null,
    defaultViewport: Partialwidthstringheights = null,
    devtools: js.UndefOr[Boolean] = js.undefined,
    dumpio: js.UndefOr[Boolean] = js.undefined,
    env: StringDictionary[String] = null,
    executablePath: String = null,
    extraPrefsFirefox: StringDictionary[js.Any] = null,
    handleSIGHUP: js.UndefOr[Boolean] = js.undefined,
    handleSIGINT: js.UndefOr[Boolean] = js.undefined,
    handleSIGTERM: js.UndefOr[Boolean] = js.undefined,
    headless: js.UndefOr[Boolean] = js.undefined,
    ignoreDefaultArgs: Boolean | js.Array[String] = null,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    pipe: js.UndefOr[Boolean] = js.undefined,
    product: chrome | firefox = null,
    slowMo: Int | Double = null,
    timeout: Int | Double = null,
    userDataDir: String = null
  ): PartialLaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools.asInstanceOf[js.Any])
    if (!js.isUndefined(dumpio)) __obj.updateDynamic("dumpio")(dumpio.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath.asInstanceOf[js.Any])
    if (extraPrefsFirefox != null) __obj.updateDynamic("extraPrefsFirefox")(extraPrefsFirefox.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGHUP)) __obj.updateDynamic("handleSIGHUP")(handleSIGHUP.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGINT)) __obj.updateDynamic("handleSIGINT")(handleSIGINT.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGTERM)) __obj.updateDynamic("handleSIGTERM")(handleSIGTERM.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    if (ignoreDefaultArgs != null) __obj.updateDynamic("ignoreDefaultArgs")(ignoreDefaultArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(pipe)) __obj.updateDynamic("pipe")(pipe.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (slowMo != null) __obj.updateDynamic("slowMo")(slowMo.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLaunchOptions]
  }
}

