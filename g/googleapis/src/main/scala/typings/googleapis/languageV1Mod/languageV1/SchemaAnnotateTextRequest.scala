package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the text annotation API, which can perform multiple
  * analysis types (sentiment, entities, and syntax) in one call.
  */
@js.native
trait SchemaAnnotateTextRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
  /**
    * The enabled features.
    */
  var features: js.UndefOr[SchemaFeatures] = js.native
}

object SchemaAnnotateTextRequest {
  @scala.inline
  def apply(document: SchemaDocument = null, encodingType: String = null, features: SchemaFeatures = null): SchemaAnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotateTextRequest]
  }
}

