package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An annotation record.
  */
@js.native
trait SchemaAnnotation extends js.Object {
  /**
    * Details of the source.
    */
  var annotationSource: js.UndefOr[SchemaAnnotationSource] = js.native
  /**
    * Annnotations for images, e.g., bounding polygons.
    */
  var imageAnnotation: js.UndefOr[SchemaImageAnnotation] = js.native
  /**
    * Output only. Resource name of the Annotation, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Annotations for resource, e.g., classification tags.
    */
  var resourceAnnotation: js.UndefOr[SchemaResourceAnnotation] = js.native
  /**
    * Annotations for sentitive texts, e.g., range of such texts.
    */
  var textAnnotation: js.UndefOr[SchemaSensitiveTextAnnotation] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(
    annotationSource: SchemaAnnotationSource = null,
    imageAnnotation: SchemaImageAnnotation = null,
    name: String = null,
    resourceAnnotation: SchemaResourceAnnotation = null,
    textAnnotation: SchemaSensitiveTextAnnotation = null
  ): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    if (annotationSource != null) __obj.updateDynamic("annotationSource")(annotationSource.asInstanceOf[js.Any])
    if (imageAnnotation != null) __obj.updateDynamic("imageAnnotation")(imageAnnotation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceAnnotation != null) __obj.updateDynamic("resourceAnnotation")(resourceAnnotation.asInstanceOf[js.Any])
    if (textAnnotation != null) __obj.updateDynamic("textAnnotation")(textAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotation]
  }
}

