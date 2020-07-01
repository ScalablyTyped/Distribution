package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of detected entity features.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1EntityAnnotation extends js.Object {
  /**
    * Image region to which this entity belongs. Not produced for
    * `LABEL_DETECTION` features.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.native
  /**
    * **Deprecated. Use `score` instead.** The accuracy of the entity detection
    * in an image. For example, for an image in which the &quot;Eiffel
    * Tower&quot; entity is detected, this field represents the confidence that
    * there is a tower in the query image. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Entity textual description, expressed in its `locale` language.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The language code for the locale in which the entity textual
    * `description` is expressed.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The location information for the detected entity. Multiple `LocationInfo`
    * elements can be present because one location may indicate the location of
    * the scene in the image, and another location may indicate the location of
    * the place where the image was taken. Location information is usually
    * present for landmarks.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1LocationInfo]] = js.native
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph
    * Search API](https://developers.google.com/knowledge-graph/).
    */
  var mid: js.UndefOr[String] = js.native
  /**
    * Some entities may have optional user-supplied `Property` (name/value)
    * fields, such a score or string that qualifies the entity.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Property]] = js.native
  /**
    * Overall score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The relevancy of the ICA (Image Content Annotation) label to the image.
    * For example, the relevancy of &quot;tower&quot; is likely higher to an
    * image containing the detected &quot;Eiffel Tower&quot; than to an image
    * containing a detected distant towering building, even though the
    * confidence that there is a tower in each image may be the same. Range [0,
    * 1].
    */
  var topicality: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1EntityAnnotation {
  @scala.inline
  def apply(
    boundingPoly: SchemaGoogleCloudVisionV1p1beta1BoundingPoly = null,
    confidence: js.UndefOr[Double] = js.undefined,
    description: String = null,
    locale: String = null,
    locations: js.Array[SchemaGoogleCloudVisionV1p1beta1LocationInfo] = null,
    mid: String = null,
    properties: js.Array[SchemaGoogleCloudVisionV1p1beta1Property] = null,
    score: js.UndefOr[Double] = js.undefined,
    topicality: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p1beta1EntityAnnotation = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topicality)) __obj.updateDynamic("topicality")(topicality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1EntityAnnotation]
  }
}

