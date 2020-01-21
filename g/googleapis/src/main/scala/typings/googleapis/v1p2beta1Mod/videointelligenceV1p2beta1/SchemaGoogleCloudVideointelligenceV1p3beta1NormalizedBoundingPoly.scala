package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized bounding polygon for text (that might not be aligned with axis).
  * Contains list of the corner points in clockwise order starting from
  * top-left corner. For example, for a rectangular bounding box: When the text
  * is horizontal it might look like:         0----1         |    | 3----2 When
  * it&#39;s clockwise rotated 180 degrees around the top-left corner it
  * becomes:         2----3         |    |         1----0  and the vertex order
  * will still be (0, 1, 2, 3). Note that values can be less than 0, or greater
  * than 1 due to trignometric calculations for location of the box.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly extends js.Object {
  /**
    * Normalized vertices of the bounding polygon.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedVertex]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly {
  @scala.inline
  def apply(vertices: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedVertex] = null): SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly]
  }
}

