package typings
package knockoutDotEs5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutEs5 extends js.Object {
  def getAllObservablesForObject[T](obj: T): T = js.native
  def getAllObservablesForObject[T](obj: T, createIfNotDefined: scala.Boolean): T = js.native
  def isTracked[T](obj: T, propertyName: java.lang.String): scala.Boolean = js.native
  def notifyWhenPresentOrFutureArrayValuesMutate[T](ko: KnockoutStatic, observable: knockoutLib.KnockoutObservable[T]): scala.Unit = js.native
}

