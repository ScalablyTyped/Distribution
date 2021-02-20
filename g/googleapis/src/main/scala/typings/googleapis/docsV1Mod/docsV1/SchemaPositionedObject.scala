package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that is tethered to a Paragraph and positioned relative to the
  * beginning of the paragraph. A PositionedObject contains an EmbeddedObject
  * such as an image.
  */
@js.native
trait SchemaPositionedObject extends StObject {
  
  /**
    * The ID of this positioned object.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The properties of this positioned object.
    */
  var positionedObjectProperties: js.UndefOr[SchemaPositionedObjectProperties] = js.native
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  /**
    * The suggested changes to the positioned object properties, keyed by
    * suggestion ID.
    */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedPositionedObjectProperties]] = js.native
}
object SchemaPositionedObject {
  
  @scala.inline
  def apply(): SchemaPositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObject]
  }
  
  @scala.inline
  implicit class SchemaPositionedObjectMutableBuilder[Self <: SchemaPositionedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPositionedObjectProperties(value: SchemaPositionedObjectProperties): Self = StObject.set(x, "positionedObjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionedObjectPropertiesUndefined: Self = StObject.set(x, "positionedObjectProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChanges(value: StringDictionary[SchemaSuggestedPositionedObjectProperties]): Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChangesUndefined: Self = StObject.set(x, "suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
}
