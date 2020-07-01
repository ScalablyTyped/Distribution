package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a category returned from the text classifier.
  */
@js.native
trait SchemaClassificationCategory extends js.Object {
  /**
    * The classifier&#39;s confidence of the category. Number represents how
    * certain the classifier is that this category represents the given text.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The name of the category representing the document, from the [predefined
    * taxonomy](/natural-language/docs/categories).
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClassificationCategory {
  @scala.inline
  def apply(confidence: js.UndefOr[Double] = js.undefined, name: String = null): SchemaClassificationCategory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClassificationCategory]
  }
}

