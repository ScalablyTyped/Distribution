package typings.jsfl.global

import typings.jsfl.FlashFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_Context")
@js.native
class Context ()
  extends typings.jsfl.Context
/* static members */
@JSGlobal("_Context")
@js.native
object Context extends js.Object {
  
  def create(): typings.jsfl.Context = js.native
  
  def from(frame: FlashFrame): typings.jsfl.Context = js.native
}
