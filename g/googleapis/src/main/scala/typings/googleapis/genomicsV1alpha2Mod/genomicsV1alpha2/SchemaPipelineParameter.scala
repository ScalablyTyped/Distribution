package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipelineParameter extends StObject {
  
  /**
    * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
    */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
    */
  var localCopy: js.UndefOr[SchemaLocalCopy] = js.undefined
  
  /**
    * Required. Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPipelineParameter {
  
  inline def apply(): SchemaPipelineParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineParameter]
  }
  
  extension [Self <: SchemaPipelineParameter](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocalCopy(value: SchemaLocalCopy): Self = StObject.set(x, "localCopy", value.asInstanceOf[js.Any])
    
    inline def setLocalCopyUndefined: Self = StObject.set(x, "localCopy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
