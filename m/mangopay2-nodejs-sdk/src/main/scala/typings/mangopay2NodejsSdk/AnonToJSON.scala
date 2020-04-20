package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToJSON extends js.Object {
  def toJSON(): js.Any
}

object AnonToJSON {
  @scala.inline
  def apply(toJSON: () => js.Any): AnonToJSON = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AnonToJSON]
  }
}

