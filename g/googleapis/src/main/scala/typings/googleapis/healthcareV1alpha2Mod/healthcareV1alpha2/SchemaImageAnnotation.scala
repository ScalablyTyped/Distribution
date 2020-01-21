package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image annotation.
  */
@js.native
trait SchemaImageAnnotation extends js.Object {
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.native
}

object SchemaImageAnnotation {
  @scala.inline
  def apply(boundingPolys: js.Array[SchemaBoundingPoly] = null): SchemaImageAnnotation = {
    val __obj = js.Dynamic.literal()
    if (boundingPolys != null) __obj.updateDynamic("boundingPolys")(boundingPolys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageAnnotation]
  }
}

