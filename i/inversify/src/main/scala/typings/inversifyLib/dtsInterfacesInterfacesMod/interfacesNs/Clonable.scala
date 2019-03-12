package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clonable[T] extends js.Object

object Clonable {
  @scala.inline
  def apply[T](clone: () => T): Clonable[T] = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone))
  
    __obj.asInstanceOf[Clonable[T]]
  }
}

