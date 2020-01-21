package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaNormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}

object SchemaBoundingPoly {
  @scala.inline
  def apply(
    normalizedVertices: js.Array[SchemaNormalizedVertex] = null,
    vertices: js.Array[SchemaVertex] = null
  ): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (normalizedVertices != null) __obj.updateDynamic("normalizedVertices")(normalizedVertices.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
}

