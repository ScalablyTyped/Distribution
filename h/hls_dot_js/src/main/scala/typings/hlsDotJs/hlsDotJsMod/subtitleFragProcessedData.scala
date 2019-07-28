package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleFragProcessedData extends js.Object {
  var frag: Fragment
  var success: Boolean
}

object subtitleFragProcessedData {
  @scala.inline
  def apply(frag: Fragment, success: Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag, success = success)
  
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
}

