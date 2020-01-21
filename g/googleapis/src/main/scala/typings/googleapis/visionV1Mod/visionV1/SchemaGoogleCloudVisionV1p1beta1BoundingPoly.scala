package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1BoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1NormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Vertex]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1BoundingPoly {
  @scala.inline
  def apply(
    normalizedVertices: js.Array[SchemaGoogleCloudVisionV1p1beta1NormalizedVertex] = null,
    vertices: js.Array[SchemaGoogleCloudVisionV1p1beta1Vertex] = null
  ): SchemaGoogleCloudVisionV1p1beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (normalizedVertices != null) __obj.updateDynamic("normalizedVertices")(normalizedVertices.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BoundingPoly]
  }
}

