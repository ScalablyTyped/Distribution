package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Place metadata for an entity.
  */
@js.native
trait SchemaPlace extends js.Object {
  /**
    * Output-only. The language_code that the name is localized with. This
    * should be the language_code specified in the request, but may be a
    * fallback.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Output-only. The name of the place, localized to the language_code.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Place identifier, as described in
    * https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String] = js.native
}

object SchemaPlace {
  @scala.inline
  def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  @scala.inline
  implicit class SchemaPlaceOps[Self <: SchemaPlace] (val x: Self) extends AnyVal {
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
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
  }
  
}

