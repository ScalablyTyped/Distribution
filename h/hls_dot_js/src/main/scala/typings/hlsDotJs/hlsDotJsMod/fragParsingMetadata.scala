package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingMetadata extends js.Object {
  var frag: Fragment
  var id: String
  var samples: js.Array[_]
}

object fragParsingMetadata {
  @scala.inline
  def apply(frag: Fragment, id: String, samples: js.Array[_]): fragParsingMetadata = {
    val __obj = js.Dynamic.literal(frag = frag, id = id, samples = samples)
  
    __obj.asInstanceOf[fragParsingMetadata]
  }
}

