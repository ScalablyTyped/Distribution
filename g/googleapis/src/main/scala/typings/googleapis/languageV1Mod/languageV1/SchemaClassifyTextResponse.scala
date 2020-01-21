package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification response message.
  */
@js.native
trait SchemaClassifyTextResponse extends js.Object {
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
}

object SchemaClassifyTextResponse {
  @scala.inline
  def apply(categories: js.Array[SchemaClassificationCategory] = null): SchemaClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClassifyTextResponse]
  }
}

