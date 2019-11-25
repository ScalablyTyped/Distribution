package typings.jsonquery.jsonqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonquery.jsonqueryMod.OrQueryCondition[T]
  - typings.jsonquery.jsonqueryMod.AndQueryCondition[T]
*/
trait BinaryQueryCondition[T] extends js.Object

object BinaryQueryCondition {
  @scala.inline
  def OrQueryCondition[T]($or: js.Array[Query[T]]): BinaryQueryCondition[T] = {
    val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryQueryCondition[T]]
  }
  @scala.inline
  def AndQueryCondition[T]($and: js.Array[Query[T]]): BinaryQueryCondition[T] = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryQueryCondition[T]]
  }
}

