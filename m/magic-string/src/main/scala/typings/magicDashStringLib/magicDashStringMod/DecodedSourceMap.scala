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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("mappings")(mappings)
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("sources")(sources)
    __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[DecodedSourceMap]
  }
}

