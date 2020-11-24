package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logical element on the page.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1Block extends js.Object {
  
  /**
    * Detected block type (text, image etc) for this block.
    */
  var blockType: js.UndefOr[String] = js.native
  
  /**
    * The bounding box for the block. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:  * when the text is horizontal it might look
    * like:          0----1         |    |         3----2  * when it&#39;s
    * rotated 180 degrees around the top-left corner it becomes: 2----3 |    |
    * 1----0    and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /**
    * Confidence of the OCR results on the block. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * List of paragraphs in this block (if this blocks is of type text).
    */
  var paragraphs: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Paragraph]] = js.native
  
  /**
    * Additional information detected for the block.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1Block {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1Block]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BlockOps[Self <: SchemaGoogleCloudVisionV1p4beta1Block] (val x: Self) extends AnyVal {
    
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
    def setBlockType(value: String): Self = this.set("blockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockType: Self = this.set("blockType", js.undefined)
    
    @scala.inline
    def setBoundingBox(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: SchemaGoogleCloudVisionV1p4beta1Paragraph*): Self = this.set("paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[SchemaGoogleCloudVisionV1p4beta1Paragraph]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}
