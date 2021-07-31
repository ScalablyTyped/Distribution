package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCivicinfo.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivisionsResource extends StObject {
  
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(): Request[DivisionSearchResponse] = js.native
  def search(request: Accesstoken): Request[DivisionSearchResponse] = js.native
}
