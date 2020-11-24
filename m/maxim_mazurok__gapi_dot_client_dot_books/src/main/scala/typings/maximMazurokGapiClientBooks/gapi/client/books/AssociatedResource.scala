package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.Association
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedResource extends js.Object {
  
  /** Return a list of associated books. */
  def list(): Request[Volumes] = js.native
  def list(request: Association): Request[Volumes] = js.native
}
