package typings
package imageminLib.imageminMod.imageminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var data: nodeLib.Buffer
  var path: java.lang.String
}

object Result {
  @scala.inline
  def apply(data: nodeLib.Buffer, path: java.lang.String): Result = {
    val __obj = js.Dynamic.literal(data = data, path = path)
  
    __obj.asInstanceOf[Result]
  }
}

