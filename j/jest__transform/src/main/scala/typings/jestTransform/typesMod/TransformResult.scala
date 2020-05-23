package typings.jestTransform.typesMod

import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformResult extends js.Object {
  var mapCoverage: Boolean
  var script: Script
  var sourceMapPath: String | Null
}

object TransformResult {
  @scala.inline
  def apply(mapCoverage: Boolean, script: Script, sourceMapPath: String = null): TransformResult = {
    val __obj = js.Dynamic.literal(mapCoverage = mapCoverage.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResult]
  }
}

