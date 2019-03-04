package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsCompression extends js.Object {
  var minBytes: scala.Double
}

object ServerOptionsCompression {
  @scala.inline
  def apply(minBytes: scala.Double): ServerOptionsCompression = {
    val __obj = js.Dynamic.literal(minBytes = minBytes)
  
    __obj.asInstanceOf[ServerOptionsCompression]
  }
}

