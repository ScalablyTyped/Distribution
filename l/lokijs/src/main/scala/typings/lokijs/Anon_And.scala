package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_And extends js.Object {
  @JSName("$and")
  var $and: js.Any
  @JSName("$or")
  var $or: js.Any
}

object Anon_And {
  @scala.inline
  def apply($and: js.Any, $or: js.Any): Anon_And = {
    val __obj = js.Dynamic.literal($and = $and, $or = $or)
  
    __obj.asInstanceOf[Anon_And]
  }
}

