package typings.linqsharp.mod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEqualityComparer[T] extends js.Object {
  def Equals(x: T, y: T): Boolean
  def GetHashCode(obj: T): Double
}

object IEqualityComparer {
  @scala.inline
  def apply[T](Equals: (T, T) => Boolean, GetHashCode: T => Double): IEqualityComparer[T] = {
    val __obj = js.Dynamic.literal(Equals = js.Any.fromFunction2(Equals), GetHashCode = js.Any.fromFunction1(GetHashCode))
    __obj.asInstanceOf[IEqualityComparer[T]]
  }
}

