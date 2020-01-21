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
  def apply(alignment: String = null, offset: SchemaDimension = null): SchemaTabStop = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTabStop]
  }
}

