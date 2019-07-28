package typings.magicDashString.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapOptions extends js.Object {
  var file: String
  var hires: Boolean
  var includeContent: Boolean
  var source: String
}

object SourceMapOptions {
  @scala.inline
  def apply(file: String, hires: Boolean, includeContent: Boolean, source: String): SourceMapOptions = {
    val __obj = js.Dynamic.literal(file = file, hires = hires, includeContent = includeContent, source = source)
  
    __obj.asInstanceOf[SourceMapOptions]
  }
}

