package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshot extends StObject {
  
  /**
    * Output only. The time when the snapshot was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The amount of bytes needed to allocate a full copy of the snapshot content
    */
  var filesystemUsedBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name of the snapshot, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}/snapshots/{snapshot_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The snapshot state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshot {
  
  inline def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  extension [Self <: SchemaSnapshot](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilesystemUsedBytes(value: String): Self = StObject.set(x, "filesystemUsedBytes", value.asInstanceOf[js.Any])
    
    inline def setFilesystemUsedBytesNull: Self = StObject.set(x, "filesystemUsedBytes", null)
    
    inline def setFilesystemUsedBytesUndefined: Self = StObject.set(x, "filesystemUsedBytes", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
