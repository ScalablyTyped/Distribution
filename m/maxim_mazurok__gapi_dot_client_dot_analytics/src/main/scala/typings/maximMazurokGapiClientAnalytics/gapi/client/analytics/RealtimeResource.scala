package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeResource extends StObject {
  
  /** Returns real time data for a view (profile). */
  def get(): Request[RealtimeData] = js.native
  def get(request: Fields): Request[RealtimeData] = js.native
}
