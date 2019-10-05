package typings.ibmDashMobilefirst.WL

import typings.ibmDashMobilefirst.WL.EncryptedCache.StatusHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.EncryptedCache")
@js.native
object EncryptedCache extends js.Object {
  var ERROR_COULD_NOT_GENERATE_KEY: Double = js.native
  var ERROR_CREDENTIALS_MISMATCH: Double = js.native
  var ERROR_EOC_CLOSED: Double = js.native
  var ERROR_EOC_DELETED: Double = js.native
  var ERROR_EOC_TO_BE_DELETED: Double = js.native
  var ERROR_INVALID_PARAMETER: Double = js.native
  var ERROR_KEY_CREATION_IN_PROGRESS: Double = js.native
  var ERROR_LOCAL_STORAGE_NOT_SUPPORTED: Double = js.native
  var ERROR_MIGRATION: Double = js.native
  var ERROR_NO_EOC: Double = js.native
  var ERROR_NO_SUCH_KEY: Double = js.native
  var ERROR_SECURE_RANDOM_GENERATOR_UNAVAILABLE: Double = js.native
  var ERROR_UNKNOWN: Double = js.native
  var ERROR_UNSAFE_CREDENTIALS: Double = js.native
  var OK: Double = js.native
  def close(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
  def destroy(successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
  def open(
    credentials: String,
    createIfNone: Boolean,
    successHandler: StatusHandler,
    failureHandler: StatusHandler
  ): Unit = js.native
  def read(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
  def remove(key: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
  def write(key: String, value: String, successHandler: StatusHandler, failureHandler: StatusHandler): Unit = js.native
  /**
    * See above statuses for possible values
    */
  type StatusHandler = js.Function1[/* status */ Double, Unit]
}

