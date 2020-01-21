package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingData extends js.Object {
  var endDTS: Double
  var endPTS: Double
  var frag: Fragment
  var id: String
  var mdat: js.Any
  var moof: js.Any
  var nb: Double
  var startDTS: Double
  var startPTS: Double
  var `type`: String
}

object fragParsingData {
  @scala.inline
  def apply(
    endDTS: Double,
    endPTS: Double,
    frag: Fragment,
    id: String,
    mdat: js.Any,
    moof: js.Any,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mdat = mdat.asInstanceOf[js.Any], moof = moof.asInstanceOf[js.Any], nb = nb.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingData]
  }
}

