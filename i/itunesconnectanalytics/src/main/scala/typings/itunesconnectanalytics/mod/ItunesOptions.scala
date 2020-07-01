package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItunesOptions extends js.Object {
  var appleWidgetKey: js.UndefOr[String] = js.undefined
  var baseURL: js.UndefOr[String] = js.undefined
  var concurrentRequests: js.UndefOr[Double] = js.undefined
  var loginURL: js.UndefOr[String] = js.undefined
  var settingsURL: js.UndefOr[String] = js.undefined
  def errorCallback(error: js.Any): Unit
  def successCallback(cookies: String): Unit
}

object ItunesOptions {
  @scala.inline
  def apply(
    errorCallback: js.Any => Unit,
    successCallback: String => Unit,
    appleWidgetKey: String = null,
    baseURL: String = null,
    concurrentRequests: js.UndefOr[Double] = js.undefined,
    loginURL: String = null,
    settingsURL: String = null
  ): ItunesOptions = {
    val __obj = js.Dynamic.literal(errorCallback = js.Any.fromFunction1(errorCallback), successCallback = js.Any.fromFunction1(successCallback))
    if (appleWidgetKey != null) __obj.updateDynamic("appleWidgetKey")(appleWidgetKey.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrentRequests)) __obj.updateDynamic("concurrentRequests")(concurrentRequests.get.asInstanceOf[js.Any])
    if (loginURL != null) __obj.updateDynamic("loginURL")(loginURL.asInstanceOf[js.Any])
    if (settingsURL != null) __obj.updateDynamic("settingsURL")(settingsURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItunesOptions]
  }
}

