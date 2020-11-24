package typings.jsend.jsend

import typings.jsend.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsendCore extends js.Object {
  
  def error(message: String): JSendObject = js.native
  def error(message: Code): JSendObject = js.native
  
  def fail(data: js.Object): JSendObject = js.native
  
  def success(data: js.Object): JSendObject = js.native
}
