package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleFragProcessedData extends js.Object {
  var frag: Fragment
  var success: scala.Boolean
}

object subtitleFragProcessedData {
  @scala.inline
  def apply(frag: Fragment, success: scala.Boolean): subtitleFragProcessedData = {
    val __obj = js.Dynamic.literal(frag = frag, success = success)
  
    __obj.asInstanceOf[subtitleFragProcessedData]
  }
}

