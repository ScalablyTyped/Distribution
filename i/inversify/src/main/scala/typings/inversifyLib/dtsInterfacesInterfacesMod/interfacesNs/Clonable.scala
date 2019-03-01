package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clonable[T] extends js.Object

object Clonable {
  @scala.inline
  def apply[T](clone: js.Function0[T]): Clonable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.asInstanceOf[Clonable[T]]
  }
}

