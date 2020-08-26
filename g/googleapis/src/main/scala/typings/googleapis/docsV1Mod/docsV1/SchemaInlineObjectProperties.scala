package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of an InlineObject.
  */
@js.native
trait SchemaInlineObjectProperties extends js.Object {
  /**
    * The embedded object of this inline object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.native
}

object SchemaInlineObjectProperties {
  @scala.inline
  def apply(): SchemaInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInlineObjectProperties]
  }
  @scala.inline
  implicit class SchemaInlineObjectPropertiesOps[Self <: SchemaInlineObjectProperties] (val x: Self) extends AnyVal {
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
    def setEmbeddedObject(value: SchemaEmbeddedObject): Self = this.set("embeddedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedObject: Self = this.set("embeddedObject", js.undefined)
  }
  
}

