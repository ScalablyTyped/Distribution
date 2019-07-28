package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsedData extends js.Object {
  var frag: Fragment
  var id: String
}

object fragParsedData {
  @scala.inline
  def apply(frag: Fragment, id: String): fragParsedData = {
    val __obj = js.Dynamic.literal(frag = frag, id = id)
  
    __obj.asInstanceOf[fragParsedData]
  }
}

