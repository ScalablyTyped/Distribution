package typings.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The text annotations response message.
  */
@js.native
trait SchemaAnnotateTextResponse extends js.Object {
  
  /**
    * Categories identified in the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
  
  /**
    * The overall sentiment for the document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_document_sentiment.
    */
  var documentSentiment: js.UndefOr[SchemaSentiment] = js.native
  
  /**
    * Entities, along with their semantic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_entities.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sentences in the input document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
  
  /**
    * Tokens, along with their syntactic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.native
}
object SchemaAnnotateTextResponse {
  
  @scala.inline
  def apply(): SchemaAnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateTextResponse]
  }
  
  @scala.inline
  implicit class SchemaAnnotateTextResponseOps[Self <: SchemaAnnotateTextResponse] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: SchemaClassificationCategory*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[SchemaClassificationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setDocumentSentiment(value: SchemaSentiment): Self = this.set("documentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentSentiment: Self = this.set("documentSentiment", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[SchemaEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
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
