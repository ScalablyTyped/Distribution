package typings.linqsharp.mod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEqualityComparer[T] extends js.Object {
  def Equals(x: T, y: T): Boolean = js.native
  def GetHashCode(obj: T): Double = js.native
}

object IEqualityComparer {
  @scala.inline
  def apply[T](Equals: (T, T) => Boolean, GetHashCode: T => Double): IEqualityComparer[T] = {
    val __obj = js.Dynamic.literal(Equals = js.Any.fromFunction2(Equals), GetHashCode = js.Any.fromFunction1(GetHashCode))
    __obj.asInstanceOf[IEqualityComparer[T]]
  }
  @scala.inline
  implicit class IEqualityComparerOps[Self <: IEqualityComparer[_], T] (val x: Self with IEqualityComparer[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquals(value: (T, T) => Boolean): Self = this.set("Equals", js.Any.fromFunction2(value))
    @scala.inline
    def setGetHashCode(value: T => Double): Self = this.set("GetHashCode", js.Any.fromFunction1(value))
  }
  
}

