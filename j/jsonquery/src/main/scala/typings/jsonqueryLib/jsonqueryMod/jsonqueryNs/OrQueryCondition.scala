package typings
package jsonqueryLib.jsonqueryMod.jsonqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$or")
  var $or: js.Array[Query[T]]
}

object OrQueryCondition {
  @scala.inline
  def apply[T]($or: js.Array[Query[T]]): OrQueryCondition[T] = {
    val __obj = js.Dynamic.literal($or = $or)
  
    __obj.asInstanceOf[OrQueryCondition[T]]
  }
}

