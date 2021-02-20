package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBinaryauthorization.anon.Callback
import typings.maximMazurokGapiClientBinaryauthorization.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var attestors: AttestorsResource = js.native
  
  /**
    * A policy specifies the attestors that must attest to a container image, before the project is allowed to deploy that image. There is at most one policy per project. All image
    * admission requests are permitted if a project has no policy. Gets the policy for this project. Returns a default policy if the project does not have one.
    */
  def getPolicy(): Request[Policy] = js.native
  def getPolicy(request: Callback): Request[Policy] = js.native
  
  var policy: PolicyResource = js.native
  
  def updatePolicy(request: Callback, body: Policy): Request[Policy] = js.native
  /**
    * Creates or updates a project's policy, and returns a copy of the new policy. A policy is always updated as a whole, to avoid race conditions with concurrent policy enforcement (or
    * management!) requests. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed.
    */
  def updatePolicy(request: QuotaUser): Request[Policy] = js.native
}
