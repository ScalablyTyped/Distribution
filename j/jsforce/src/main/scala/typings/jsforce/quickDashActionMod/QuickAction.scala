package typings.jsforce.quickDashActionMod

import typings.jsforce.connectionMod.Callback
import typings.jsforce.recordMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/quick-action", "QuickAction")
@js.native
class QuickAction () extends js.Object {
  /** Retrieve default field values in the action */
  def defaultValues(): js.Promise[Record[_]] = js.native
  def defaultValues(callback: Callback[Record[_]]): js.Promise[Record[_]] = js.native
  /**
    * Retrieve default field values in the action for the given record
    * @param contextId Id of record
    * @param callback Callback function
    */
  def defaultValues(contextId: String): js.Promise[Record[_]] = js.native
  def defaultValues(contextId: String, callback: Callback[Record[_]]): js.Promise[Record[_]] = js.native
  /**
    * Describe the action's information (including layout, etc.)
    * @param callback Callback function
    */
  def describe(): js.Promise[QuickActionDescribeInfo] = js.native
  def describe(callback: Callback[QuickActionDescribeInfo]): js.Promise[QuickActionDescribeInfo] = js.native
  /**
    * Execute the action for given context id and record information
    * @param contextId Context record ID of the action
    * @param record Input record information for the action
    * @param callback Callback function
    */
  def execute[T](contextId: String, record: Record[T]): js.Promise[QuickActionResult] = js.native
  def execute[T](contextId: String, record: Record[T], callback: Callback[QuickActionResult]): js.Promise[QuickActionResult] = js.native
}

