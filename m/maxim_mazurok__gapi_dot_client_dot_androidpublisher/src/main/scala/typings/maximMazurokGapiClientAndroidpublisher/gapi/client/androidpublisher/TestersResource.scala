package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.Key
import typings.maximMazurokGapiClientAndroidpublisher.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestersResource extends StObject {
  
  /** Gets testers. Note: Testers resource does not support email lists. */
  def get(): Request[Testers] = js.native
  def get(request: Key): Request[Testers] = js.native
  
  def patch(request: Key, body: Testers): Request[Testers] = js.native
  /** Patches testers. Note: Testers resource does not support email lists. */
  def patch(request: QuotaUser): Request[Testers] = js.native
  
  def update(request: Key, body: Testers): Request[Testers] = js.native
  /** Updates testers. Note: Testers resource does not support email lists. */
  def update(request: QuotaUser): Request[Testers] = js.native
}
