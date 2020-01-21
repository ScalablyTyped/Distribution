package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification request message.
  */
@js.native
trait SchemaClassifyTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
}

object SchemaClassifyTextRequest {
  @scala.inline
  def apply(document: SchemaDocument = null): SchemaClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClassifyTextRequest]
  }
}

