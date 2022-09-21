package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestIdResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstancesResource extends StObject {
  
  def bulkInsert(request: Oauthtoken, body: BulkInsertInstanceResource): Request[Operation] = js.native
  /** Creates multiple instances in a given region. Count specifies the number of instances to create. */
  def bulkInsert(request: QuotaUserRegionRequestIdResourceUploadType): Request[Operation] = js.native
}
