package typings.interfaceDashDatastore.interfaceDashDatastoreMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("interface-datastore", "Errors")
@js.native
object Errors extends js.Object {
  def dbDeleteFailedError(error: Error): ErrCode = js.native
  def dbOpenFailedError(error: Error): ErrCode = js.native
  def dbWriteFailedError(error: Error): ErrCode = js.native
  def notFoundError(error: Error): ErrCode = js.native
}

