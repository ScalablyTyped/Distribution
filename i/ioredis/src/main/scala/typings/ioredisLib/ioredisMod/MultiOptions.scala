package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiOptions extends js.Object {
  var pipeline: scala.Boolean
}

object MultiOptions {
  @scala.inline
  def apply(pipeline: scala.Boolean): MultiOptions = {
    val __obj = js.Dynamic.literal(pipeline = pipeline)
  
    __obj.asInstanceOf[MultiOptions]
  }
}

