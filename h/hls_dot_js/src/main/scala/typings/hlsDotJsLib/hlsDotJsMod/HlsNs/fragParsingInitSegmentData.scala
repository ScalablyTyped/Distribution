package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingInitSegmentData extends js.Object {
  var codecs: js.Any
  var frag: Fragment
  var id: java.lang.String
  var moov: js.Any
}

object fragParsingInitSegmentData {
  @scala.inline
  def apply(codecs: js.Any, frag: Fragment, id: java.lang.String, moov: js.Any): fragParsingInitSegmentData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codecs")(codecs)
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("moov")(moov)
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
}

