package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for UpdateInstance.
  */
trait SchemaUpdateInstanceRequest extends StObject {
  
  /**
    * Required. A mask specifying which fields in
    * [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance]
    * should be updated. The field mask must always be specified; this prevents
    * any future fields in [][google.spanner.admin.instance.v1.Instance] from
    * being erased accidentally by clients that do not know about them.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The instance to update, which must always include the instance
    * name.  Otherwise, only fields mentioned in
    * [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask]
    * need be included.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
}
object SchemaUpdateInstanceRequest {
  
  inline def apply(): SchemaUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceRequest]
  }
  
  extension [Self <: SchemaUpdateInstanceRequest](x: Self) {
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
