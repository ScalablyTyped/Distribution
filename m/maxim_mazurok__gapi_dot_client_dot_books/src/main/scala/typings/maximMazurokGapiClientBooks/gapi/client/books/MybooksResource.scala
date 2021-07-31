package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.AcquireMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MybooksResource extends StObject {
  
  /** Return a list of books in My Library. */
  def list(): Request[Volumes] = js.native
  def list(request: AcquireMethod): Request[Volumes] = js.native
}
