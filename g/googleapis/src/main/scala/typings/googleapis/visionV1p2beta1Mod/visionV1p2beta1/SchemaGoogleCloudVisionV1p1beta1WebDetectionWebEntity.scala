package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity deduced from similar images on the Internet.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity extends js.Object {
  /**
    * Canonical description of the entity, in English.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Opaque entity ID.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Overall relevancy score for the entity. Not normalized and not comparable
    * across different image queries.
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity {
  @scala.inline
  def apply(description: String = null, entityId: String = null, score: js.UndefOr[Double] = js.undefined): SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity]
  }
}

