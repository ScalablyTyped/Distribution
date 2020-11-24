package typings.hoganJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hogan.js", "scan")
@js.native
object scan extends js.Object {
  
  def apply(text: String): js.Array[Token] = js.native
  def apply(text: String, delimiters: String): js.Array[Token] = js.native
}
