package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a paragraph. A paragraph is a range of
  * content that is terminated with a newline character.
  */
@js.native
trait SchemaParagraph extends js.Object {
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.native
  /**
    * The content of the paragraph broken down into its component parts.
    */
  var elements: js.UndefOr[js.Array[SchemaParagraphElement]] = js.native
  /**
    * The style of this paragraph.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The IDs of the positioned objects tethered to this paragraph.
    */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested changes to this paragraph&#39;s bullet.
    */
  var suggestedBulletChanges: js.UndefOr[StringDictionary[SchemaSuggestedBullet]] = js.native
  /**
    * The suggested paragraph style changes to this paragraph, keyed by
    * suggestion ID.
    */
  var suggestedParagraphStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedParagraphStyle]] = js.native
  /**
    * The IDs of the positioned objects that are suggested to be attached to
    * this paragraph, keyed by suggestion ID.
    */
  var suggestedPositionedObjectIds: js.UndefOr[StringDictionary[SchemaObjectReferences]] = js.native
}

object SchemaParagraph {
  @scala.inline
  def apply(): SchemaParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraph]
  }
  @scala.inline
  implicit class SchemaParagraphOps[Self <: SchemaParagraph] (val x: Self) extends AnyVal {
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
    def setBullet(value: SchemaBullet): Self = this.set("bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    @scala.inline
    def setElementsVarargs(value: SchemaParagraphElement*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[SchemaParagraphElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setParagraphStyle(value: SchemaParagraphStyle): Self = this.set("paragraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphStyle: Self = this.set("paragraphStyle", js.undefined)
    @scala.inline
    def setPositionedObjectIdsVarargs(value: String*): Self = this.set("positionedObjectIds", js.Array(value :_*))
    @scala.inline
    def setPositionedObjectIds(value: js.Array[String]): Self = this.set("positionedObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionedObjectIds: Self = this.set("positionedObjectIds", js.undefined)
    @scala.inline
    def setSuggestedBulletChanges(value: StringDictionary[SchemaSuggestedBullet]): Self = this.set("suggestedBulletChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedBulletChanges: Self = this.set("suggestedBulletChanges", js.undefined)
    @scala.inline
    def setSuggestedParagraphStyleChanges(value: StringDictionary[SchemaSuggestedParagraphStyle]): Self = this.set("suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedParagraphStyleChanges: Self = this.set("suggestedParagraphStyleChanges", js.undefined)
    @scala.inline
    def setSuggestedPositionedObjectIds(value: StringDictionary[SchemaObjectReferences]): Self = this.set("suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedPositionedObjectIds: Self = this.set("suggestedPositionedObjectIds", js.undefined)
  }
  
}

