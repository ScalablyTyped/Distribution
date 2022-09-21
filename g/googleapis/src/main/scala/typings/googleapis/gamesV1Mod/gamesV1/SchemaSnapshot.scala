package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshot extends StObject {
  
  /**
    * The cover image of this snapshot. May be absent if there is no image.
    */
  var coverImage: js.UndefOr[SchemaSnapshotImage] = js.undefined
  
  /**
    * The description of this snapshot.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only present if the snapshot is a view on a Drive file and the file is owned by the caller.
    */
  var driveId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The duration associated with this snapshot, in millis.
    */
  var durationMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#snapshot`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp (in millis since Unix epoch) of the last modification to this snapshot.
    */
  var lastModifiedMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress value (64-bit integer set by developer) associated with this snapshot.
    */
  var progressValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of this snapshot.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this snapshot.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique name provided when the snapshot was created.
    */
  var uniqueName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshot {
  
  inline def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  extension [Self <: SchemaSnapshot](x: Self) {
    
    inline def setCoverImage(value: SchemaSnapshotImage): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
    
    inline def setCoverImageUndefined: Self = StObject.set(x, "coverImage", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdNull: Self = StObject.set(x, "driveId", null)
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisNull: Self = StObject.set(x, "durationMillis", null)
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedMillis(value: String): Self = StObject.set(x, "lastModifiedMillis", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedMillisNull: Self = StObject.set(x, "lastModifiedMillis", null)
    
    inline def setLastModifiedMillisUndefined: Self = StObject.set(x, "lastModifiedMillis", js.undefined)
    
    inline def setProgressValue(value: String): Self = StObject.set(x, "progressValue", value.asInstanceOf[js.Any])
    
    inline def setProgressValueNull: Self = StObject.set(x, "progressValue", null)
    
    inline def setProgressValueUndefined: Self = StObject.set(x, "progressValue", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameNull: Self = StObject.set(x, "uniqueName", null)
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
