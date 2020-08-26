package typings.loadGoogleMapsApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The Google Maps API `script` tag URL
    *
    * Default Value `'https://maps.googleapis.com/maps/api/js'`
    */
  var apiUrl: js.UndefOr[String] = js.native
  /**
    * Client usage reporting channel
    *
    * https://developers.google.com/maps/premium/reports/usage-reports#channels
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * Client ID
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#specifying-a-client-id-when-loading-the-api
    */
  var client: js.UndefOr[String] = js.native
  /**
    * Your API key
    *
    * https://developers.google.com/maps/documentation/javascript/get-api-key#step-2-add-the-api-key-to-your-application
    */
  var key: js.UndefOr[String] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Language
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Supplemental libraries to load
    *
    * Default Value `[]`
    *
    * https://developers.google.com/maps/documentation/javascript/libraries
    */
  var libraries: js.UndefOr[js.Array[String]] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/localization#Region
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Time in milliseconds before rejecting the Promise
    *
    * Default Value `10000`
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * API Version
    *
    * https://developers.google.com/maps/documentation/javascript/versions
    */
  var v: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setApiUrl(value: String): Self = this.set("apiUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiUrl: Self = this.set("apiUrl", js.undefined)
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = this.set("libraries", js.Array(value :_*))
    @scala.inline
    def setLibraries(value: js.Array[String]): Self = this.set("libraries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraries: Self = this.set("libraries", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

