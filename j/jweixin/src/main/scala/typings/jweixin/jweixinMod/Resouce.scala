package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resouce extends js.Object {
  var localId: String
}

object Resouce {
  @scala.inline
  def apply(localId: String): Resouce = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resouce]
  }
}

