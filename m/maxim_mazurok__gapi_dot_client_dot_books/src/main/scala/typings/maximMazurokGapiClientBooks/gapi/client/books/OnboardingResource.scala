package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBooks.anon.CallbackFields
import typings.maximMazurokGapiClientBooks.anon.CategoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnboardingResource extends js.Object {
  
  /** List categories for onboarding experience. */
  def listCategories(): Request[Category] = js.native
  def listCategories(request: CallbackFields): Request[Category] = js.native
  
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(): Request[Volume2] = js.native
  def listCategoryVolumes(request: CategoryId): Request[Volume2] = js.native
}
