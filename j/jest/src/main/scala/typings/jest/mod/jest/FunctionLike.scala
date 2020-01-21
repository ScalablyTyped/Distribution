package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionLike extends js.Object {
  val name: String
}

object FunctionLike {
  @scala.inline
  def apply(name: String): FunctionLike = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionLike]
  }
}

