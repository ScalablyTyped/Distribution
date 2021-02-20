package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataflow.anon.Accesstoken
import typings.maximMazurokGapiClientDataflow.anon.Alt
import typings.maximMazurokGapiClientDataflow.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateVersionsResource extends StObject {
  
  /** Creates a new Template with TemplateVersion. Requires project_id(projects) and template display_name(catalogTemplates). The template display_name is set by the user. */
  def create(request: Accesstoken): Request[TemplateVersion] = js.native
  def create(request: Alt, body: CreateTemplateVersionRequest): Request[TemplateVersion] = js.native
  
  /**
    * List TemplateVersions using project_id and an optional display_name field. List all the TemplateVersions in the Template if display set. List all the TemplateVersions in the Project
    * if display_name not set.
    */
  def list(): Request[ListTemplateVersionsResponse] = js.native
  def list(request: Callback): Request[ListTemplateVersionsResponse] = js.native
}
