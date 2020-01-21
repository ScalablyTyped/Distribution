package typings.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The syntax analysis response message.
  */
@js.native
trait SchemaAnalyzeSyntaxResponse extends js.Object {
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.native
}

object SchemaAnalyzeSyntaxResponse {
  @scala.inline
  def apply(
    language: String = null,
    sentences: js.Array[SchemaSentence] = null,
    tokens: js.Array[SchemaToken] = null
  ): SchemaAnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyzeSyntaxResponse]
  }
}

