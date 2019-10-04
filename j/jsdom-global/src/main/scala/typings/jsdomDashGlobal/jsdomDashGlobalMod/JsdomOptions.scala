package typings.jsdomDashGlobal.jsdomDashGlobalMod

import typings.jsdom.jsdomMod.CookieJar
import typings.jsdom.jsdomMod.VirtualConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsdomOptions extends js.Object {
  var beforeParse: js.UndefOr[js.Function0[Unit]] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  var includeNodeLocations: js.UndefOr[Boolean] = js.undefined
  var pretendToBeVisual: js.UndefOr[Boolean] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[String] = js.undefined
  var runScripts: js.UndefOr[String] = js.undefined
  var storageQuota: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var virtualConsole: js.UndefOr[VirtualConsole] = js.undefined
}

object JsdomOptions {
  @scala.inline
  def apply(
    beforeParse: () => Unit = null,
    contentType: String = null,
    cookieJar: CookieJar = null,
    includeNodeLocations: js.UndefOr[Boolean] = js.undefined,
    pretendToBeVisual: js.UndefOr[Boolean] = js.undefined,
    referrer: String = null,
    resources: String = null,
    runScripts: String = null,
    storageQuota: Int | Double = null,
    url: String = null,
    virtualConsole: VirtualConsole = null
  ): JsdomOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeParse != null) __obj.updateDynamic("beforeParse")(js.Any.fromFunction0(beforeParse))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar)
    if (!js.isUndefined(includeNodeLocations)) __obj.updateDynamic("includeNodeLocations")(includeNodeLocations)
    if (!js.isUndefined(pretendToBeVisual)) __obj.updateDynamic("pretendToBeVisual")(pretendToBeVisual)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (runScripts != null) __obj.updateDynamic("runScripts")(runScripts)
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (virtualConsole != null) __obj.updateDynamic("virtualConsole")(virtualConsole)
    __obj.asInstanceOf[JsdomOptions]
  }
}

