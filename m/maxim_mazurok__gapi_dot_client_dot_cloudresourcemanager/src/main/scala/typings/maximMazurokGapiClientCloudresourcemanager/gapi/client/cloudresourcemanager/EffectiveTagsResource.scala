package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudresourcemanager.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectiveTagsResource extends StObject {
  
  /** Return a list of effective tags for the given cloud resource, as specified in `parent`. */
  def list(): Request[ListEffectiveTagsResponse] = js.native
  def list(request: Accesstoken): Request[ListEffectiveTagsResponse] = js.native
}
