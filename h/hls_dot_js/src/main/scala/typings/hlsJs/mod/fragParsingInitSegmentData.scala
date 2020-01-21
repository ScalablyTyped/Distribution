package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingInitSegmentData extends js.Object {
  var codecs: js.Any
  var frag: Fragment
  var id: String
  var moov: js.Any
}

object fragParsingInitSegmentData {
  @scala.inline
  def apply(codecs: js.Any, frag: Fragment, id: String, moov: js.Any): fragParsingInitSegmentData = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moov = moov.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
}

