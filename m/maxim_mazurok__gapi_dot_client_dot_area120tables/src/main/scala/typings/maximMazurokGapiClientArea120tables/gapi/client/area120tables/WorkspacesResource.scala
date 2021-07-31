package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientArea120tables.anon.Name
import typings.maximMazurokGapiClientArea120tables.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesResource extends StObject {
  
  /** Gets a workspace. Returns NOT_FOUND if the workspace does not exist. */
  def get(): Request[Workspace] = js.native
  def get(request: Name): Request[Workspace] = js.native
  
  /** Lists workspaces for the user. */
  def list(): Request[ListWorkspacesResponse] = js.native
  def list(request: PageToken): Request[ListWorkspacesResponse] = js.native
}
