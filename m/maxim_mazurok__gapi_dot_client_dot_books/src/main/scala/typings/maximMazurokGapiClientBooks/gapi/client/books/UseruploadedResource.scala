package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseruploadedResource extends js.Object {
  
  /** Return a list of books uploaded by the current user. */
  def list(): Request[Volumes] = js.native
  def list(request: StartIndex): Request[Volumes] = js.native
}
