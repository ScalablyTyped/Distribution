package typings.linqsharp.linqsharpMod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouping[TKey, T] extends js.Object {
  var Elements: js.Array[T]
  var Key: TKey
}

object IGrouping {
  @scala.inline
  def apply[TKey, T](Elements: js.Array[T], Key: TKey): IGrouping[TKey, T] = {
    val __obj = js.Dynamic.literal(Elements = Elements, Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGrouping[TKey, T]]
  }
}

