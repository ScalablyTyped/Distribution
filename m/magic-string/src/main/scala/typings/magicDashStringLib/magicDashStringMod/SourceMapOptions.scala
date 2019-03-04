package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOptions extends js.Object {
  var file: java.lang.String
  var hires: scala.Boolean
  var includeContent: scala.Boolean
  var source: java.lang.String
}

object SourceMapOptions {
  @scala.inline
  def apply(
    file: java.lang.String,
    hires: scala.Boolean,
    includeContent: scala.Boolean,
    source: java.lang.String
  ): SourceMapOptions = {
    val __obj = js.Dynamic.literal(file = file, hires = hires, includeContent = includeContent, source = source)
  
    __obj.asInstanceOf[SourceMapOptions]
  }
}

