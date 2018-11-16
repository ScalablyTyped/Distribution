package typings
package ibmDashMobilefirstLib.WLNs.EncryptedCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.EncryptedCache")
@js.native
object EncryptedCacheNsMembers extends js.Object {
  var ERROR_COULD_NOT_GENERATE_KEY: scala.Double = js.native
  var ERROR_CREDENTIALS_MISMATCH: scala.Double = js.native
  var ERROR_EOC_CLOSED: scala.Double = js.native
  var ERROR_EOC_DELETED: scala.Double = js.native
  var ERROR_EOC_TO_BE_DELETED: scala.Double = js.native
  var ERROR_INVALID_PARAMETER: scala.Double = js.native
  var ERROR_KEY_CREATION_IN_PROGRESS: scala.Double = js.native
  var ERROR_LOCAL_STORAGE_NOT_SUPPORTED: scala.Double = js.native
  var ERROR_MIGRATION: scala.Double = js.native
  var ERROR_NO_EOC: scala.Double = js.native
  var ERROR_NO_SUCH_KEY: scala.Double = js.native
  var ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE: scala.Double = js.native
  var ERROR_UNKNOWN: scala.Double = js.native
  var ERROR_UNSAFE_CREDENTIALS: scala.Double = js.native
  var OK: scala.Double = js.native
  def close(successHandler: StatusHandler, failureHandler: StatusHandler): scala.Unit = js.native
  def destroy(successHandler: StatusHandler, failureHandler: StatusHandler): scala.Unit = js.native
  def open(
    credentials: java.lang.String,
    createIfNone: scala.Boolean,
    successHandler: StatusHandler,
    failureHandler: StatusHandler
  ): scala.Unit = js.native
  def read(key: java.lang.String, successHandler: StatusHandler, failureHandler: StatusHandler): scala.Unit = js.native
  def remove(key: java.lang.String, successHandler: StatusHandler, failureHandler: StatusHandler): scala.Unit = js.native
  def write(
    key: java.lang.String,
    value: java.lang.String,
    successHandler: StatusHandler,
    failureHandler: StatusHandler
  ): scala.Unit = js.native
}

