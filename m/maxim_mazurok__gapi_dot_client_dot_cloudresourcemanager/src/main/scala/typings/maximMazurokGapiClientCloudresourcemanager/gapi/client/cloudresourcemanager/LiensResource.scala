package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Callback
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Fields
import typings.maximMazurokGapiClientCloudresourcemanager.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiensResource extends StObject {
  
  def create(request: Callback, body: Lien): Request[Lien] = js.native
  /**
    * Create a Lien which applies to the resource denoted by the `parent` field. Callers of this method will require permission on the `parent` resource. For example, applying to
    * `projects/1234` requires permission `resourcemanager.projects.updateLiens`. NOTE: Some resources may limit the number of Liens which may be applied.
    */
  def create(request: UploadType): Request[Lien] = js.native
  
  /**
    * Delete a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /**
    * Retrieve a Lien by `name`. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`
    */
  def get(): Request[Lien] = js.native
  def get(request: Fields): Request[Lien] = js.native
  
  /**
    * List all Liens applied to the `parent` resource. Callers of this method will require permission on the `parent` resource. For example, a Lien with a `parent` of `projects/1234`
    * requires permission `resourcemanager.projects.get`.
    */
  def list(): Request[ListLiensResponse] = js.native
  def list(request: Accesstoken): Request[ListLiensResponse] = js.native
}
