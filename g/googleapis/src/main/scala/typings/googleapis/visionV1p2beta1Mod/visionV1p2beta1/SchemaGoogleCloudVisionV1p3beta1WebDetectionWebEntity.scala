package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity deduced from similar images on the Internet.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntity extends js.Object {
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

object SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntity {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntity]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntityOps[Self <: SchemaGoogleCloudVisionV1p3beta1WebDetectionWebEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

