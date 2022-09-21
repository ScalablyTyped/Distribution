package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUserResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  def search(request: AccesstokenAlt, body: SearchRequest): Request[SearchResponse] = js.native
  /** Retrieves merchant performance mertrics matching the search query and optionally segmented by selected dimensions. */
  def search(request: PrettyPrintQuotaUserResourceUploadType): Request[SearchResponse] = js.native
}
