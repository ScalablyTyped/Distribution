package typings.jsreportChromePdf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsreportChromePdf.Partialwidthstringheights
import typings.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typings.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#puppeteerlaunchoptions
trait LaunchOptions extends js.Object {
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
}

