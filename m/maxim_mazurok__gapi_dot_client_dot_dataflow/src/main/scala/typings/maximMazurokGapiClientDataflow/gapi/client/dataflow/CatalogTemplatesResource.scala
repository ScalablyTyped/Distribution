package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.Fields
import typings.maximMazurokGapiClientDataflow.anon.Key
import typings.maximMazurokGapiClientDataflow.anon.Name
import typings.maximMazurokGapiClientDataflow.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTemplatesResource extends js.Object {
  
  /** Creates a new TemplateVersion (Important: not new Template) entry in the spanner table. Requires project_id and display_name (template). */
  def commit(request: Fields): Request[TemplateVersion] = js.native
  def commit(request: Key, body: CommitTemplateVersionRequest): Request[TemplateVersion] = js.native
  
  /** Deletes an existing Template. Do nothing if Template does not exist. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Get TemplateVersion using project_id and display_name with an optional version_id field. Get latest (has tag "latest") TemplateVersion if version_id not set. */
  def get(): Request[TemplateVersion] = js.native
  def get(request: Key): Request[TemplateVersion] = js.native
  
  def label(request: Key, body: ModifyTemplateVersionLabelRequest): Request[ModifyTemplateVersionLabelResponse] = js.native
  /** Updates the label of the TemplateVersion. Label can be duplicated in Template, so either add or remove the label in the TemplateVersion. */
  def label(request: Name): Request[ModifyTemplateVersionLabelResponse] = js.native
  
  def tag(request: Key, body: ModifyTemplateVersionTagRequest): Request[ModifyTemplateVersionTagResponse] = js.native
  /**
    * Updates the tag of the TemplateVersion, and tag is unique in Template. If tag exists in another TemplateVersion in the Template, updates the tag to this TemplateVersion will remove
    * it from the old TemplateVersion and add it to this TemplateVersion. If request is remove_only (remove_only = true), remove the tag from this TemplateVersion.
    */
  def tag(request: Oauthtoken): Request[ModifyTemplateVersionTagResponse] = js.native
  
  var templateVersions: TemplateVersionsResource = js.native
}
