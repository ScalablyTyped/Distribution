package typings
package jsplumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conn extends js.Object {
  def each(fn: js.Function1[/* conn */ jsplumbLib.jsplumbMod.jsPlumbNs.Connection, scala.Unit]): scala.Unit
}

object Anon_Conn {
  @scala.inline
  def apply(
    each: js.Function1[
      js.Function1[/* conn */ jsplumbLib.jsplumbMod.jsPlumbNs.Connection, scala.Unit], 
      scala.Unit
    ]
  ): Anon_Conn = {
    val __obj = js.Dynamic.literal(each = each)
  
    __obj.asInstanceOf[Anon_Conn]
  }
}

