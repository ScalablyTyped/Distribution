package typings.knockoutEs5

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutEs5 extends js.Object {
  def getAllObservablesForObject[T](obj: T): T = js.native
  def getAllObservablesForObject[T](obj: T, createIfNotDefined: Boolean): T = js.native
  def isTracked[T](obj: T, propertyName: String): Boolean = js.native
  def notifyWhenPresentOrFutureArrayValuesMutate[T](ko: KnockoutStatic, observable: KnockoutObservable[T]): Unit = js.native
}

