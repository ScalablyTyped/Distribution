package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity analysis response message.
  */
@js.native
trait SchemaAnalyzeEntitiesResponse extends js.Object {
  /**
    * The recognized entities in the input document.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
}

object SchemaAnalyzeEntitiesResponse {
  @scala.inline
  def apply(entities: js.Array[SchemaEntity] = null, language: String = null): SchemaAnalyzeEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyzeEntitiesResponse]
  }
}

