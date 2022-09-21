package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudfunctions.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimesResource extends StObject {
  
  /** Returns a list of runtimes that are supported for the requested project. */
  def list(): Request[ListRuntimesResponse] = js.native
  def list(request: Parent): Request[ListRuntimesResponse] = js.native
}
