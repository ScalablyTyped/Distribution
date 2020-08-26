package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

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
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
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
    def setAnnotationSource(value: SchemaAnnotationSource): Self = this.set("annotationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationSource: Self = this.set("annotationSource", js.undefined)
    @scala.inline
    def setImageAnnotation(value: SchemaImageAnnotation): Self = this.set("imageAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAnnotation: Self = this.set("imageAnnotation", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceAnnotation(value: SchemaResourceAnnotation): Self = this.set("resourceAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAnnotation: Self = this.set("resourceAnnotation", js.undefined)
    @scala.inline
    def setTextAnnotation(value: SchemaSensitiveTextAnnotation): Self = this.set("textAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnnotation: Self = this.set("textAnnotation", js.undefined)
  }
  
}

