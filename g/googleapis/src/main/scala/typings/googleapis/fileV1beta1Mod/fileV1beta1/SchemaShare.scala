package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShare extends StObject {
  
  /**
    * File share capacity in gigabytes (GB). Filestore defines 1 GB as 1024^3 bytes. Must be greater than 0.
    */
  var capacityGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the share was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the share with 2048 characters or less. Requests with longer descriptions will be rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The mount name of the share. Must be 63 characters or less and consist of uppercase or lowercase letters, numbers, and underscores.
    */
  var mountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the share, in the format `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}/shares/{share_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Nfs Export Options. There is a limit of 10 export options per file share.
    */
  var nfsExportOptions: js.UndefOr[js.Array[SchemaNfsExportOptions]] = js.undefined
  
  /**
    * Output only. The share state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaShare {
  
  inline def apply(): SchemaShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShare]
  }
  
  extension [Self <: SchemaShare](x: Self) {
    
    inline def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    inline def setCapacityGbNull: Self = StObject.set(x, "capacityGb", null)
    
    inline def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMountName(value: String): Self = StObject.set(x, "mountName", value.asInstanceOf[js.Any])
    
    inline def setMountNameNull: Self = StObject.set(x, "mountName", null)
    
    inline def setMountNameUndefined: Self = StObject.set(x, "mountName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNfsExportOptions(value: js.Array[SchemaNfsExportOptions]): Self = StObject.set(x, "nfsExportOptions", value.asInstanceOf[js.Any])
    
    inline def setNfsExportOptionsUndefined: Self = StObject.set(x, "nfsExportOptions", js.undefined)
    
    inline def setNfsExportOptionsVarargs(value: SchemaNfsExportOptions*): Self = StObject.set(x, "nfsExportOptions", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
