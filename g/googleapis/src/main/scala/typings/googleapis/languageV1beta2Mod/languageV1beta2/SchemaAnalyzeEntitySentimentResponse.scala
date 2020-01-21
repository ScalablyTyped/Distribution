package typings.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity-level sentiment analysis response message.
  */
@js.native
trait SchemaAnalyzeEntitySentimentResponse extends js.Object {
  /**
    * The recognized entities in the input document with associated sentiments.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}

object SchemaAnalyzeEntitySentimentResponse {
  @scala.inline
  def apply(entities: js.Array[SchemaEntity] = null, language: String = null): SchemaAnalyzeEntitySentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyzeEntitySentimentResponse]
  }
}

