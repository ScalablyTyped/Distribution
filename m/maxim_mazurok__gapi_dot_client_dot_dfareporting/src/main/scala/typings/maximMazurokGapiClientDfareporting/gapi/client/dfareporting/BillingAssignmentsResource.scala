package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AltBillingProfileId
import typings.maximMazurokGapiClientDfareporting.anon.BillingProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAssignmentsResource extends StObject {
  
  def insert(request: AltBillingProfileId, body: BillingAssignment): Request[BillingAssignment] = js.native
  /**
    * Inserts a new billing assignment and returns the new assignment. Only one of advertiser_id or campaign_id is support per request. If the new assignment has no effect (assigning a
    * campaign to the parent advertiser billing profile or assigning an advertiser to the account billing profile), no assignment will be returned.
    */
  def insert(request: BillingProfileId): Request[BillingAssignment] = js.native
  
  /** Retrieves a list of billing assignments. */
  def list(): Request[BillingAssignmentsListResponse] = js.native
  def list(request: AltBillingProfileId): Request[BillingAssignmentsListResponse] = js.native
}
