package typings
package jsforceLib.quickDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/quick-action", "QuickAction")
@js.native
class QuickAction () extends js.Object {
  /** Retrieve default field values in the action */
  def defaultValues(): stdLib.Promise[jsforceLib.recordMod.Record[_]] = js.native
  /** Retrieve default field values in the action */
  def defaultValues(callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[_]]): stdLib.Promise[jsforceLib.recordMod.Record[_]] = js.native
  /**
       * Retrieve default field values in the action for the given record
       * @param contextId Id of record
       * @param callback Callback function
       */
  def defaultValues(contextId: java.lang.String): stdLib.Promise[jsforceLib.recordMod.Record[_]] = js.native
  /**
       * Retrieve default field values in the action for the given record
       * @param contextId Id of record
       * @param callback Callback function
       */
  def defaultValues(
    contextId: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[_]]
  ): stdLib.Promise[jsforceLib.recordMod.Record[_]] = js.native
  /**
       * Describe the action's information (including layout, etc.)
       * @param callback Callback function
       */
  def describe(): stdLib.Promise[QuickActionDescribeInfo] = js.native
  /**
       * Describe the action's information (including layout, etc.)
       * @param callback Callback function
       */
  def describe(callback: jsforceLib.connectionMod.Callback[QuickActionDescribeInfo]): stdLib.Promise[QuickActionDescribeInfo] = js.native
  /**
       * Execute the action for given context id and record information
       * @param contextId Context record ID of the action
       * @param record Input record information for the action
       * @param callback Callback function
       */
  def execute[T](contextId: java.lang.String, record: jsforceLib.recordMod.Record[T]): stdLib.Promise[QuickActionResult] = js.native
  /**
       * Execute the action for given context id and record information
       * @param contextId Context record ID of the action
       * @param record Input record information for the action
       * @param callback Callback function
       */
  def execute[T](
    contextId: java.lang.String,
    record: jsforceLib.recordMod.Record[T],
    callback: jsforceLib.connectionMod.Callback[QuickActionResult]
  ): stdLib.Promise[QuickActionResult] = js.native
}

