package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an snapshot object.
  */
@js.native
trait SchemaSnapshot extends js.Object {
  
  /**
    * The cover image of this snapshot. May be absent if there is no image.
    */
  var coverImage: js.UndefOr[SchemaSnapshotImage] = js.native
  
  /**
    * The description of this snapshot.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only
    * present if the snapshot is a view on a Drive file and the file is owned
    * by the caller.
    */
  var driveId: js.UndefOr[String] = js.native
  
  /**
    * The duration associated with this snapshot, in millis.
    */
  var durationMillis: js.UndefOr[String] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshot.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The timestamp (in millis since Unix epoch) of the last modification to
    * this snapshot.
    */
  var lastModifiedMillis: js.UndefOr[String] = js.native
  
  /**
    * The progress value (64-bit integer set by developer) associated with this
    * snapshot.
    */
  var progressValue: js.UndefOr[String] = js.native
  
  /**
    * The title of this snapshot.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of this snapshot. Possible values are:   - &quot;SAVE_GAME&quot;
    * - A snapshot representing a save game.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The unique name provided when the snapshot was created.
    */
  var uniqueName: js.UndefOr[String] = js.native
}
object SchemaSnapshot {
  
  @scala.inline
  def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  @scala.inline
  implicit class SchemaSnapshotOps[Self <: SchemaSnapshot] (val x: Self) extends AnyVal {
    
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
    def setCoverImage(value: SchemaSnapshotImage): Self = this.set("coverImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverImage: Self = this.set("coverImage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: String): Self = this.set("durationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMillis: Self = this.set("durationMillis", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedMillis(value: String): Self = this.set("lastModifiedMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedMillis: Self = this.set("lastModifiedMillis", js.undefined)
    
    @scala.inline
    def setProgressValue(value: String): Self = this.set("progressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressValue: Self = this.set("progressValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}
