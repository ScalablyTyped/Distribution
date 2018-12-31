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

