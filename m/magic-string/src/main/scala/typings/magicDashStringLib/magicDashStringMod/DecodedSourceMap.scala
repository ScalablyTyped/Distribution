package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedSourceMap extends js.Object {
  var file: java.lang.String
  var mappings: js.Array[js.Array[js.Array[scala.Double]]]
  var names: js.Array[java.lang.String]
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.Array[java.lang.String]
}

object DecodedSourceMap {
  @scala.inline
  def apply(
    file: java.lang.String,
    mappings: js.Array[js.Array[js.Array[scala.Double]]],
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    sourcesContent: js.Array[java.lang.String]
  ): DecodedSourceMap = {
    val __obj = js.Dynamic.literal(file = file, mappings = mappings, names = names, sources = sources, sourcesContent = sourcesContent)
  
    __obj.asInstanceOf[DecodedSourceMap]
  }
}

