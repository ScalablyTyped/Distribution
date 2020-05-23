package typings.mangopay2NodejsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJSON extends js.Object {
  def toJSON(): js.Any
}

object ToJSON {
  @scala.inline
  def apply(toJSON: () => js.Any): ToJSON = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ToJSON]
  }
}

