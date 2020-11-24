package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaAnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSyntaxResponse]
  }
  
  @scala.inline
  implicit class SchemaAnalyzeSyntaxResponseOps[Self <: SchemaAnalyzeSyntaxResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setSentencesVarargs(value: SchemaSentence*): Self = this.set("sentences", js.Array(value :_*))
    
    @scala.inline
    def setSentences(value: js.Array[SchemaSentence]): Self = this.set("sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: SchemaToken*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[SchemaToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
}
