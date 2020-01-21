package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footnote.
  */
@js.native
trait SchemaFootnote extends js.Object {
  /**
    * The contents of the footnote.  The indexes for a footnote&#39;s content
    * begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String] = js.native
}

object SchemaFootnote {
  @scala.inline
  def apply(content: js.Array[SchemaStructuralElement] = null, footnoteId: String = null): SchemaFootnote = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFootnote]
  }
}

