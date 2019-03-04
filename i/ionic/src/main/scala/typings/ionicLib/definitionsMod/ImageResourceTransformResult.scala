package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResourceTransformResult extends js.Object {
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var resource: ImageResource
  var tmpDest: java.lang.String
}

object ImageResourceTransformResult {
  @scala.inline
  def apply(resource: ImageResource, tmpDest: java.lang.String, error: nodeLib.Error = null): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource, tmpDest = tmpDest)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
}

