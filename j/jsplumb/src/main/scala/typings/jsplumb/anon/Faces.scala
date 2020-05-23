package typings.jsplumb.anon

import typings.jsplumb.mod.ContinuousAnchorFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Faces extends js.Object {
  var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.undefined
}

object Faces {
  @scala.inline
  def apply(faces: js.Array[ContinuousAnchorFace] = null): Faces = {
    val __obj = js.Dynamic.literal()
    if (faces != null) __obj.updateDynamic("faces")(faces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Faces]
  }
}

