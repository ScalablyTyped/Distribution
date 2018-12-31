package typings
package linqsharpLib.linqsharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linqsharp", "LinqSharp")
@js.native
object LinqSharpNs extends js.Object {
  trait IEqualityComparer[T] extends js.Object {
    def Equals(x: T, y: T): scala.Boolean
    def GetHashCode(obj: T): scala.Double
  }
  
  trait IGrouping[TKey, T] extends js.Object {
    var Elements: js.Array[T]
    var Key: TKey
  }
  
  def GetHashCode(e: js.Any): js.Any = js.native
  def StringifyNonCircular(obj: js.Any): java.lang.String = js.native
}

