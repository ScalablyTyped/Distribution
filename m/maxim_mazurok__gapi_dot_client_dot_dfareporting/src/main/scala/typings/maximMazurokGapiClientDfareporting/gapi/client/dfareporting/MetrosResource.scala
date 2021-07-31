package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetrosResource extends StObject {
  
  /** Retrieves a list of metros. */
  def list(): Request[MetrosListResponse] = js.native
  def list(request: Callback): Request[MetrosListResponse] = js.native
}
