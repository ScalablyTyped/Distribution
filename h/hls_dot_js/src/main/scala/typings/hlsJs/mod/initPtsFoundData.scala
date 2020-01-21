package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait initPtsFoundData extends js.Object {
  var d: String
  var frag: Fragment
  var initPTS: Double
}

object initPtsFoundData {
  @scala.inline
  def apply(d: String, frag: Fragment, initPTS: Double): initPtsFoundData = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[initPtsFoundData]
  }
}

