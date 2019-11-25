package typings.hexo.hexoMod.Router

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String | Buffer | Callback
  var modified: Boolean
}

object Data {
  @scala.inline
  def apply(data: String | Buffer | Callback, modified: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

