package typings.imagemin.imageminMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var data: Buffer
  var destinationPath: String
  var sourcePath: String
}

object Result {
  @scala.inline
  def apply(data: Buffer, destinationPath: String, sourcePath: String): Result = {
    val __obj = js.Dynamic.literal(data = data, destinationPath = destinationPath, sourcePath = sourcePath)
  
    __obj.asInstanceOf[Result]
  }
}

