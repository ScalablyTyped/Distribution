package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingMetadata extends js.Object {
  var frag: Fragment
  var id: java.lang.String
  var samples: js.Array[_]
}

object fragParsingMetadata {
  @scala.inline
  def apply(frag: Fragment, id: java.lang.String, samples: js.Array[_]): fragParsingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("samples")(samples)
    __obj.asInstanceOf[fragParsingMetadata]
  }
}

