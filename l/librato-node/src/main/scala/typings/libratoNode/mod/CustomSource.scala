package typings.libratoNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomSource extends js.Object {
  var source: String
}

object CustomSource {
  @scala.inline
  def apply(source: String): CustomSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomSource]
  }
}

