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

