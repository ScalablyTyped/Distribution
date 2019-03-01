package typings
package loadDashGoogleDashMapsDashApiLib.loadDashGoogleDashMapsDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Client usage reporting channel
    *
    * https://developers.google.com/maps/premium/reports/usage-reports#channels
    */
  var channel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Client ID
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#specifying-a-client-id-when-loading-the-api
    */
  var client: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Your API key
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#step-2-add-the-api-key-to-your-application
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Language
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Supplemental libraries to load
    *
    * Default Value `[]`
    *
    * https://developers.google.com/maps/documentation/javascript/libraries
    */
  var libraries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Region
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time in milliseconds before rejecting the Promise
    *
    * Default Value `10000`
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * API Version
    *
    * https://developers.google.com/maps/documentation/javascript/versions
    */
  var v: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    channel: java.lang.String = null,
    client: java.lang.String = null,
    key: java.lang.String = null,
    language: java.lang.String = null,
    libraries: js.Array[java.lang.String] = null,
    region: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    v: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (client != null) __obj.updateDynamic("client")(client)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (libraries != null) __obj.updateDynamic("libraries")(libraries)
    if (region != null) __obj.updateDynamic("region")(region)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Options]
  }
}

