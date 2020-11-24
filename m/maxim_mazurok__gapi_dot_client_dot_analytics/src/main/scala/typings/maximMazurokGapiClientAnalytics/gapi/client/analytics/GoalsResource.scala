package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.FieldsGoalId
import typings.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typings.maximMazurokGapiClientAnalytics.anon.GoalId
import typings.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typings.maximMazurokGapiClientAnalytics.anon.OauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalsResource extends js.Object {
  
  /** Gets a goal to which the user has access. */
  def get(): Request[Goal] = js.native
  def get(request: GoalId): Request[Goal] = js.native
  
  def insert(request: FieldsKey, body: Goal): Request[Goal] = js.native
  /** Create a new goal. */
  def insert(request: OauthtokenPrettyPrint): Request[Goal] = js.native
  
  /** Lists goals to which the user has access. */
  def list(): Request[Goals] = js.native
  def list(request: KeyMaxresults): Request[Goals] = js.native
  
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: FieldsGoalId): Request[Goal] = js.native
  def patch(request: GoalId, body: Goal): Request[Goal] = js.native
  
  /** Updates an existing goal. */
  def update(request: FieldsGoalId): Request[Goal] = js.native
  def update(request: GoalId, body: Goal): Request[Goal] = js.native
}
