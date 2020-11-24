package typings.interfaceDatastore.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("interface-datastore", "Errors")
@js.native
object Errors extends js.Object {
  
  def abortedError(error: Error): ErrCode = js.native
  
  def dbDeleteFailedError(error: Error): ErrCode = js.native
  
  def dbOpenFailedError(error: Error): ErrCode = js.native
  
  def dbWriteFailedError(error: Error): ErrCode = js.native
  
  def notFoundError(error: Error): ErrCode = js.native
}
