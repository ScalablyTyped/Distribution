package typings.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxError")
@js.native
class KdbxError protected () extends js.Object {
  def this(code: KdbxErrorCode, message: String) = this()
  
  var code: KdbxErrorCode = js.native
  
  var message: String = js.native
  
  var name: typings.kdbxweb.kdbxwebStrings.KdbxError = js.native
}
