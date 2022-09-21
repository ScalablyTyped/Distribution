package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSource extends StObject {
  
  /**
    * Output only. The create time timestamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-provided description of the source.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides details on the state of the Source in case of an error.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The labels of the source.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The Source name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The update time timestamp.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Vmware type source details.
    */
  var vmware: js.UndefOr[SchemaVmwareSourceDetails] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVmware(value: SchemaVmwareSourceDetails): Self = StObject.set(x, "vmware", value.asInstanceOf[js.Any])
    
    inline def setVmwareUndefined: Self = StObject.set(x, "vmware", js.undefined)
  }
}
