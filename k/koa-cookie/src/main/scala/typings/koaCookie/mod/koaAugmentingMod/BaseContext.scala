package typings.koaCookie.mod.koaAugmentingMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseContext extends js.Object {
  var cookie: Record[String, _]
}

object BaseContext {
  @scala.inline
  def apply(cookie: Record[String, _]): BaseContext = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseContext]
  }
}

