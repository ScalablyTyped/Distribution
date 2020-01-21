package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document body.  The body typically contains the full document contents
  * except for headers, footers and footnotes.
  */
@js.native
trait SchemaBody extends js.Object {
  /**
    * The contents of the body.  The indexes for the body&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
}

object SchemaBody {
  @scala.inline
  def apply(content: js.Array[SchemaStructuralElement] = null): SchemaBody = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBody]
  }
}

