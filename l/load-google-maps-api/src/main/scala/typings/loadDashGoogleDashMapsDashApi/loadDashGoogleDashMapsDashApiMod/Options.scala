package typings.loadDashGoogleDashMapsDashApi.loadDashGoogleDashMapsDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The Google Maps API `script` tag URL
    *
    * Default Value `'https://maps.googleapis.com/maps/api/js'`
    */
  var apiUrl: js.UndefOr[String] = js.undefined
  /**
    * Client usage reporting channel
    *
    * https://developers.google.com/maps/premium/reports/usage-reports#channels
    */
  var channel: js.UndefOr[String] = js.undefined
  /**
    * Client ID
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#specifying-a-client-id-when-loading-the-api
    */
  var client: js.UndefOr[String] = js.undefined
  /**
    * Your API key
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#step-2-add-the-api-key-to-your-application
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Language
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Supplemental libraries to load
    *
    * Default Value `[]`
    *
    * https://developers.google.com/maps/documentation/javascript/libraries
    */
  var libraries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Region
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Time in milliseconds before rejecting the Promise
    *
    * Default Value `10000`
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * API Version
    *
    * https://developers.google.com/maps/documentation/javascript/versions
    */
  var v: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    apiUrl: String = null,
    channel: String = null,
    client: String = null,
    key: String = null,
    language: String = null,
    libraries: js.Array[String] = null,
    region: String = null,
    timeout: Int | Double = null,
    v: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
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

