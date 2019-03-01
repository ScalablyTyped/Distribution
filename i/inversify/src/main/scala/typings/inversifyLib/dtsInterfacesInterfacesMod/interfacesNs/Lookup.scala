package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[T] extends Clonable[Lookup[T]] {
  def add(serviceIdentifier: ServiceIdentifier[_], value: T): scala.Unit
  def get(serviceIdentifier: ServiceIdentifier[_]): js.Array[T]
  def getMap(): stdLib.Map[ServiceIdentifier[_], js.Array[T]]
  def hasKey(serviceIdentifier: ServiceIdentifier[_]): scala.Boolean
  def remove(serviceIdentifier: ServiceIdentifier[_]): scala.Unit
  def removeByCondition(condition: js.Function1[/* item */ T, scala.Boolean]): scala.Unit
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], scala.Unit]): scala.Unit
}

object Lookup {
  @scala.inline
  def apply[T](
    add: js.Function2[ServiceIdentifier[_], T, scala.Unit],
    clone: js.Function0[Lookup[T]],
    get: js.Function1[ServiceIdentifier[_], js.Array[T]],
    getMap: js.Function0[stdLib.Map[ServiceIdentifier[_], js.Array[T]]],
    hasKey: js.Function1[ServiceIdentifier[_], scala.Boolean],
    remove: js.Function1[ServiceIdentifier[_], scala.Unit],
    removeByCondition: js.Function1[js.Function1[/* item */ T, scala.Boolean], scala.Unit],
    traverse: js.Function1[
      js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], scala.Unit], 
      scala.Unit
    ]
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getMap")(getMap)
    __obj.updateDynamic("hasKey")(hasKey)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeByCondition")(removeByCondition)
    __obj.updateDynamic("traverse")(traverse)
    __obj.asInstanceOf[Lookup[T]]
  }
}

