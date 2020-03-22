package typings.jsplumb

import typings.jsplumb.mod.ContinuousAnchorFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFaces extends js.Object {
  var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.undefined
}

object AnonFaces {
  @scala.inline
  def apply(faces: js.Array[ContinuousAnchorFace] = null): AnonFaces = {
    val __obj = js.Dynamic.literal()
    if (faces != null) __obj.updateDynamic("faces")(faces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFaces]
  }
}

