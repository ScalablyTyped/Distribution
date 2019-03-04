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
    val __obj = js.Dynamic.literal(add = add, clone = clone, get = get, getMap = getMap, hasKey = hasKey, remove = remove, removeByCondition = removeByCondition, traverse = traverse)
  
    __obj.asInstanceOf[Lookup[T]]
  }
}

