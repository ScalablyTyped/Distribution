package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an snapshot object.
  */
trait SchemaSnapshot extends StObject {
  
  /**
    * The cover image of this snapshot. May be absent if there is no image.
    */
  var coverImage: js.UndefOr[SchemaSnapshotImage] = js.undefined
  
  /**
    * The description of this snapshot.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only
    * present if the snapshot is a view on a Drive file and the file is owned
    * by the caller.
    */
  var driveId: js.UndefOr[String] = js.undefined
  
  /**
    * The duration associated with this snapshot, in millis.
    */
  var durationMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshot.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp (in millis since Unix epoch) of the last modification to
    * this snapshot.
    */
  var lastModifiedMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The progress value (64-bit integer set by developer) associated with this
    * snapshot.
    */
  var progressValue: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this snapshot.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of this snapshot. Possible values are:   - &quot;SAVE_GAME&quot;
    * - A snapshot representing a save game.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The unique name provided when the snapshot was created.
    */
  var uniqueName: js.UndefOr[String] = js.undefined
}
object SchemaSnapshot {
  
  @scala.inline
  def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  @scala.inline
  implicit class SchemaSnapshotMutableBuilder[Self <: SchemaSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverImage(value: SchemaSnapshotImage): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImageUndefined: Self = StObject.set(x, "coverImage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedMillis(value: String): Self = StObject.set(x, "lastModifiedMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedMillisUndefined: Self = StObject.set(x, "lastModifiedMillis", js.undefined)
    
    @scala.inline
    def setProgressValue(value: String): Self = StObject.set(x, "progressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressValueUndefined: Self = StObject.set(x, "progressValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
