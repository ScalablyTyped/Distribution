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
    val __obj = js.Dynamic.literal(codecs = codecs, frag = frag, id = id, moov = moov)
  
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
}

