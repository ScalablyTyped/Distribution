package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataSource extends StObject {
  
  /** Account ID to which this custom data source belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  var childLink: js.UndefOr[Href] = js.native
  
  /** Time this custom data source was created. */
  var created: js.UndefOr[String] = js.native
  
  /** Description of custom data source. */
  var description: js.UndefOr[String] = js.native
  
  /** Custom data source ID. */
  var id: js.UndefOr[String] = js.native
  
  var importBehavior: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics custom data source. */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this custom data source. */
  var name: js.UndefOr[String] = js.native
  
  /** Parent link for this custom data source. Points to the web property to which this custom data source belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  
  /** IDs of views (profiles) linked to the custom data source. */
  var profilesLinked: js.UndefOr[js.Array[String]] = js.native
  
  /** Collection of schema headers of the custom data source. */
  var schema: js.UndefOr[js.Array[String]] = js.native
  
  /** Link for this Analytics custom data source. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Type of the custom data source. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Time this custom data source was last modified. */
  var updated: js.UndefOr[String] = js.native
  
  /** Upload type of the custom data source. */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Web property ID of the form UA-XXXXX-YY to which this custom data source belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}
object CustomDataSource {
  
  @scala.inline
  def apply(): CustomDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataSource]
  }
  
  @scala.inline
  implicit class CustomDataSourceMutableBuilder[Self <: CustomDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImportBehavior(value: String): Self = StObject.set(x, "importBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportBehaviorUndefined: Self = StObject.set(x, "importBehavior", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setProfilesLinked(value: js.Array[String]): Self = StObject.set(x, "profilesLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesLinkedUndefined: Self = StObject.set(x, "profilesLinked", js.undefined)
    
    @scala.inline
    def setProfilesLinkedVarargs(value: String*): Self = StObject.set(x, "profilesLinked", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: js.Array[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
