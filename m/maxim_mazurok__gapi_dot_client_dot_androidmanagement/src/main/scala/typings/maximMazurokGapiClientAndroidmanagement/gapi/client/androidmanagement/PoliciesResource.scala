package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typings.maximMazurokGapiClientAndroidmanagement.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends StObject {
  
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a policy. */
  def get(): Request[Policy] = js.native
  def get(request: Alt): Request[Policy] = js.native
  
  /** Lists policies for a given enterprise. */
  def list(): Request[ListPoliciesResponse] = js.native
  def list(request: Oauthtoken): Request[ListPoliciesResponse] = js.native
  
  def patch(request: PrettyPrint, body: Policy): Request[Policy] = js.native
  /** Updates or creates a policy. */
  def patch(request: Resource): Request[Policy] = js.native
}
