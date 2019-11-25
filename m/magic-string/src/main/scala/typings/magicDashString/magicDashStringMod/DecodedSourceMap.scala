package typings.magicDashString.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedSourceMap extends js.Object {
  var file: String
  var mappings: js.Array[js.Array[js.Array[Double]]]
  var names: js.Array[String]
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
}

object DecodedSourceMap {
  @scala.inline
  def apply(
    file: String,
    mappings: js.Array[js.Array[js.Array[Double]]],
    names: js.Array[String],
    sources: js.Array[String],
    sourcesContent: js.Array[String]
  ): DecodedSourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecodedSourceMap]
  }
}

