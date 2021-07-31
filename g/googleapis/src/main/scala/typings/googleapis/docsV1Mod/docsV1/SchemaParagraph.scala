package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement representing a paragraph. A paragraph is a range of
  * content that is terminated with a newline character.
  */
trait SchemaParagraph extends StObject {
  
  /**
    * The bullet for this paragraph. If not present, the paragraph does not
    * belong to a list.
    */
  var bullet: js.UndefOr[SchemaBullet] = js.undefined
  
  /**
    * The content of the paragraph broken down into its component parts.
    */
  var elements: js.UndefOr[js.Array[SchemaParagraphElement]] = js.undefined
  
  /**
    * The style of this paragraph.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.undefined
  
  /**
    * The IDs of the positioned objects tethered to this paragraph.
    */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested changes to this paragraph&#39;s bullet.
    */
  var suggestedBulletChanges: js.UndefOr[StringDictionary[SchemaSuggestedBullet]] = js.undefined
  
  /**
    * The suggested paragraph style changes to this paragraph, keyed by
    * suggestion ID.
    */
  var suggestedParagraphStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedParagraphStyle]] = js.undefined
  
  /**
    * The IDs of the positioned objects that are suggested to be attached to
    * this paragraph, keyed by suggestion ID.
    */
  var suggestedPositionedObjectIds: js.UndefOr[StringDictionary[SchemaObjectReferences]] = js.undefined
}
object SchemaParagraph {
  
  @scala.inline
  def apply(): SchemaParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParagraph]
  }
  
  @scala.inline
  implicit class SchemaParagraphMutableBuilder[Self <: SchemaParagraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBullet(value: SchemaBullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    @scala.inline
    def setElements(value: js.Array[SchemaParagraphElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: SchemaParagraphElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setParagraphStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setPositionedObjectIds(value: js.Array[String]): Self = StObject.set(x, "positionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionedObjectIdsUndefined: Self = StObject.set(x, "positionedObjectIds", js.undefined)
    
    @scala.inline
    def setPositionedObjectIdsVarargs(value: String*): Self = StObject.set(x, "positionedObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedBulletChanges(value: StringDictionary[SchemaSuggestedBullet]): Self = StObject.set(x, "suggestedBulletChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedBulletChangesUndefined: Self = StObject.set(x, "suggestedBulletChanges", js.undefined)
    
    @scala.inline
    def setSuggestedParagraphStyleChanges(value: StringDictionary[SchemaSuggestedParagraphStyle]): Self = StObject.set(x, "suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedParagraphStyleChangesUndefined: Self = StObject.set(x, "suggestedParagraphStyleChanges", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectIds(value: StringDictionary[SchemaObjectReferences]): Self = StObject.set(x, "suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedPositionedObjectIdsUndefined: Self = StObject.set(x, "suggestedPositionedObjectIds", js.undefined)
  }
}
