package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.Pagesize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipResource extends StObject {
  
  /** Returns Series membership data given the series id. */
  def get(): Request[Seriesmembership] = js.native
  def get(request: Pagesize): Request[Seriesmembership] = js.native
}
