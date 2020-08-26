package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenStreetMapProviderOptionsResultLanguage extends js.Object {
  var `accept-language`: js.UndefOr[String] = js.native
}

object OpenStreetMapProviderOptionsResultLanguage {
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLanguage]
  }
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLanguageOps[Self <: OpenStreetMapProviderOptionsResultLanguage] (val x: Self) extends AnyVal {
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
    def `setAccept-language`(value: String): Self = this.set("accept-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-language`: Self = this.set("accept-language", js.undefined)
  }
  
}

