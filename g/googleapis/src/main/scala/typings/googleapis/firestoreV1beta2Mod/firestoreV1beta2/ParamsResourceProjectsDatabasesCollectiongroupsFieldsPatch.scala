package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A field name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    * A field path may be a simple field name, e.g. `address` or a path to
    * fields within map_value , e.g. `address.city`, or a special field path.
    * The only valid special field is `*`, which represents any field.  Field
    * paths may be quoted using ` (backtick). The only character that needs to
    * be escaped within a quoted field path is the backtick character itself,
    * escaped using a backslash. Special characters in field paths that must be
    * quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii
    * symbolic characters.  Examples: (Note: Comments here are written in
    * markdown syntax, so there is an  additional layer of backticks to
    * represent a code block) `\`address.city\`` represents a field named
    * `address.city`, not the map key `city` in the field `address`. `\`*\``
    * represents a field named `*`, not any field.  A special `Field` contains
    * the default indexing settings for all fields. This field's resource name
    * is:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/x`
    * Indexes defined on this `Field` will be applied to all fields which do
    * not have their own `Field` index configuration.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Field] = js.native
  
  /**
    * A mask, relative to the field. If specified, only configuration specified
    * by this field_mask will be updated in the field.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatchOps[Self <: ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleFirestoreAdminV1beta2Field): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
