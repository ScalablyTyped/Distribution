package typings.harmonyReflect

import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("harmony-reflect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("apply")
  def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: ArrayLike[_], newTarget: js.Any): js.Any = js.native
  def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = js.native
  def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
  def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
  def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
  def getPrototypeOf(target: js.Any): js.Any = js.native
  def has(target: js.Any, propertyKey: String): Boolean = js.native
  def has(target: js.Any, propertyKey: js.Symbol): Boolean = js.native
  def isExtensible(target: js.Any): Boolean = js.native
  def ownKeys(target: js.Any): js.Array[PropertyKey] = js.native
  def preventExtensions(target: js.Any): Boolean = js.native
  def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
  def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
  def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  type PropertyKey = String | Double | js.Symbol
}

