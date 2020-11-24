package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected entity from video analysis.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2Entity extends js.Object {
  
  /**
    * Textual description, e.g. `Fixed-gear bicycle`.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph
    * Search API](https://developers.google.com/knowledge-graph/).
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * Language code for `description` in BCP-47 format.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVideointelligenceV1beta2Entity {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2Entity]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2EntityOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2Entity] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
}
