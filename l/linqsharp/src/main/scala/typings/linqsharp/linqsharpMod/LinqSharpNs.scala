package typings.linqsharp.linqsharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linqsharp", "LinqSharp")
@js.native
object LinqSharpNs extends js.Object {
  trait IEqualityComparer[T] extends js.Object {
    def Equals(x: T, y: T): Boolean
    def GetHashCode(obj: T): Double
  }
  
  trait IGrouping[TKey, T] extends js.Object {
    var Elements: js.Array[T]
    var Key: TKey
  }
  
  def GetHashCode(e: js.Any): js.Any = js.native
  def StringifyNonCircular(obj: js.Any): String = js.native
}

