package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.MaxAllowedMaturityRating
import typings.maximMazurokGapiClientBooks.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendedResource extends js.Object {
  
  /** Return a list of recommended books for the current user. */
  def list(): Request[Volumes] = js.native
  def list(request: MaxAllowedMaturityRating): Request[Volumes] = js.native
  
  /** Rate a recommended book for the current user. */
  def rate(): Request[BooksVolumesRecommendedRateResponse] = js.native
  def rate(request: Rating): Request[BooksVolumesRecommendedRateResponse] = js.native
}
