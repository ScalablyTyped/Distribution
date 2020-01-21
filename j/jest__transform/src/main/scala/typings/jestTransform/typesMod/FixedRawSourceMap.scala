package typings.jestTransform.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof source-map.source-map.RawSourceMap, 'version'> ]: source-map.source-map.RawSourceMap[P]} */ trait FixedRawSourceMap extends js.Object {
  var version: Double
}

object FixedRawSourceMap {
  @scala.inline
  def apply(version: Double): FixedRawSourceMap = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FixedRawSourceMap]
  }
}

