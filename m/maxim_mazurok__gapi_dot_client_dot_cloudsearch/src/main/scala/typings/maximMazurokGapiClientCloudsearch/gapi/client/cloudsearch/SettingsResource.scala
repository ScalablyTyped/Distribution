package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudsearch.anon.AltCallback
import typings.maximMazurokGapiClientCloudsearch.anon.QuotaUserUpdateMask
import typings.maximMazurokGapiClientCloudsearch.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsResource extends StObject {
  
  var datasources: DatasourcesResource = js.native
  
  /** Get customer settings. **Note:** This API requires an admin account to execute. */
  def getCustomer(): Request[CustomerSettings] = js.native
  def getCustomer(request: AltCallback): Request[CustomerSettings] = js.native
  
  var searchapplications: SearchapplicationsResource = js.native
  
  def updateCustomer(request: QuotaUserUpdateMask, body: CustomerSettings): Request[Operation] = js.native
  /** Update customer settings. **Note:** This API requires an admin account to execute. */
  def updateCustomer(request: UpdateMask): Request[Operation] = js.native
}
