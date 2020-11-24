package typings.jestResolve.moduleNotFoundErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-resolve/build/ModuleNotFoundError", JSImport.Default)
@js.native
class default protected () extends ModuleNotFoundError {
  def this(message: String) = this()
  def this(message: String, moduleName: String) = this()
}
/* static members */
@JSImport("jest-resolve/build/ModuleNotFoundError", JSImport.Default)
@js.native
object default extends js.Object {
  
  def duckType(error: ModuleNotFoundError): ModuleNotFoundError = js.native
}
