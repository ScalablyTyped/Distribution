package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents knowledge base resource.  Note: resource
  * `projects.agent.knowledgeBases` is deprecated, please use
  * `projects.knowledgeBases` instead.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeBase extends StObject {
  
  /**
    * Required. The display name of the knowledge base. The name must be 1024
    * bytes or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The knowledge base resource name. The name must be empty when creating a
    * knowledge base. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1KnowledgeBase {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeBaseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
