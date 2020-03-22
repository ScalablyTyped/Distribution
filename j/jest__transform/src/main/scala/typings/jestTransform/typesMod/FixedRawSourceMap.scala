package typings.jestTransform.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @jest/transform.@jest/transform/build/types.Omit<source-map.source-map.RawSourceMap, 'version'> */
trait FixedRawSourceMap extends js.Object {
  var file: String
  var mappings: String
  var names: js.Array[String]
  var sourceRoot: js.UndefOr[String] = js.undefined
  var sources: js.Array[String]
  var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
  var version: Double
}

object FixedRawSourceMap {
  @scala.inline
  def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    version: Double,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): FixedRawSourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedRawSourceMap]
  }
}

