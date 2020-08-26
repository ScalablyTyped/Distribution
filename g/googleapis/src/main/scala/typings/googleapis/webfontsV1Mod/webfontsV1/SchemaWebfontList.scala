package typings.googleapis.webfontsV1Mod.webfontsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWebfontList extends js.Object {
  /**
    * The list of fonts currently served by the Google Fonts API.
    */
  var items: js.UndefOr[js.Array[SchemaWebfont]] = js.native
  /**
    * This kind represents a list of webfont objects in the webfonts service.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaWebfontList {
  @scala.inline
  def apply(): SchemaWebfontList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebfontList]
  }
  @scala.inline
  implicit class SchemaWebfontListOps[Self <: SchemaWebfontList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaWebfont*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaWebfont]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

