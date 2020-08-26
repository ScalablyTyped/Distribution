package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tab stop within a paragraph.
  */
@js.native
trait SchemaTabStop extends js.Object {
  /**
    * The alignment of this tab stop. If unset, the value defaults to START.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The offset between this tab stop and the start margin.
    */
  var offset: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTabStop {
  @scala.inline
  def apply(): SchemaTabStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTabStop]
  }
  @scala.inline
  implicit class SchemaTabStopOps[Self <: SchemaTabStop] (val x: Self) extends AnyVal {
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setOffset(value: SchemaDimension): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

