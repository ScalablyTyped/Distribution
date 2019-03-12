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
    add: (ServiceIdentifier[_], T) => scala.Unit,
    clone: () => Lookup[T],
    get: ServiceIdentifier[_] => js.Array[T],
    getMap: () => stdLib.Map[ServiceIdentifier[_], js.Array[T]],
    hasKey: ServiceIdentifier[_] => scala.Boolean,
    remove: ServiceIdentifier[_] => scala.Unit,
    removeByCondition: js.Function1[/* item */ T, scala.Boolean] => scala.Unit,
    traverse: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], scala.Unit] => scala.Unit
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clone = js.Any.fromFunction0(clone), get = js.Any.fromFunction1(get), getMap = js.Any.fromFunction0(getMap), hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1(remove), removeByCondition = js.Any.fromFunction1(removeByCondition), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[Lookup[T]]
  }
}

