package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidpublisher.anon.PackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestersResource extends js.Object {
  
  /** Gets testers. */
  def get(): Request[Testers] = js.native
  def get(request: Oauthtoken): Request[Testers] = js.native
  
  def patch(request: Oauthtoken, body: Testers): Request[Testers] = js.native
  /** Patches testers. */
  def patch(request: PackageName): Request[Testers] = js.native
  
  def update(request: Oauthtoken, body: Testers): Request[Testers] = js.native
  /** Updates testers. */
  def update(request: PackageName): Request[Testers] = js.native
}
