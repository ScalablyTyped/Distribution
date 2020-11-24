package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  */
@js.native
trait SchemaFeatures extends js.Object {
  
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.native
  
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}
object SchemaFeatures {
  
  @scala.inline
  def apply(): SchemaFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatures]
  }
  
  @scala.inline
  implicit class SchemaFeaturesOps[Self <: SchemaFeatures] (val x: Self) extends AnyVal {
    
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
    def setExtractDocumentSentiment(value: Boolean): Self = this.set("extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractDocumentSentiment: Self = this.set("extractDocumentSentiment", js.undefined)
    
    @scala.inline
    def setExtractEntities(value: Boolean): Self = this.set("extractEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractEntities: Self = this.set("extractEntities", js.undefined)
    
    @scala.inline
    def setExtractSyntax(value: Boolean): Self = this.set("extractSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractSyntax: Self = this.set("extractSyntax", js.undefined)
  }
}
