package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The syntax analysis request message.
  */
@js.native
trait SchemaAnalyzeSyntaxRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object SchemaAnalyzeSyntaxRequest {
  @scala.inline
  def apply(document: SchemaDocument = null, encodingType: String = null): SchemaAnalyzeSyntaxRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyzeSyntaxRequest]
  }
}

