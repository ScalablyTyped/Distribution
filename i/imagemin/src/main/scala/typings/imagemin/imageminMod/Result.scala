package typings.imagemin.imageminMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var data: Buffer
  var path: String
}

object Result {
  @scala.inline
  def apply(data: Buffer, path: String): Result = {
    val __obj = js.Dynamic.literal(data = data, path = path)
  
    __obj.asInstanceOf[Result]
  }
}

