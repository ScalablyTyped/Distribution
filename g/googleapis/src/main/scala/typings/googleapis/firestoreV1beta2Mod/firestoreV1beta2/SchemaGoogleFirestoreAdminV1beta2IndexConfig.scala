package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1beta2IndexConfig extends StObject {
  
  /**
    * Output only. Specifies the resource name of the `Field` from which this field's index configuration is set (when `uses_ancestor_config` is true), or from which it *would* be set if this field had no index configuration (when `uses_ancestor_config` is false).
    */
  var ancestorField: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The indexes supported for this field.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Index]] = js.undefined
  
  /**
    * Output only When true, the `Field`'s index configuration is in the process of being reverted. Once complete, the index config will transition to the same state as the field specified by `ancestor_field`, at which point `uses_ancestor_config` will be `true` and `reverting` will be `false`.
    */
  var reverting: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. When true, the `Field`'s index configuration is set from the configuration specified by the `ancestor_field`. When false, the `Field`'s index configuration is defined explicitly.
    */
  var usesAncestorConfig: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2IndexConfig {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2IndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfig]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2IndexConfig](x: Self) {
    
    inline def setAncestorField(value: String): Self = StObject.set(x, "ancestorField", value.asInstanceOf[js.Any])
    
    inline def setAncestorFieldNull: Self = StObject.set(x, "ancestorField", null)
    
    inline def setAncestorFieldUndefined: Self = StObject.set(x, "ancestorField", js.undefined)
    
    inline def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1beta2Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1beta2Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setReverting(value: Boolean): Self = StObject.set(x, "reverting", value.asInstanceOf[js.Any])
    
    inline def setRevertingNull: Self = StObject.set(x, "reverting", null)
    
    inline def setRevertingUndefined: Self = StObject.set(x, "reverting", js.undefined)
    
    inline def setUsesAncestorConfig(value: Boolean): Self = StObject.set(x, "usesAncestorConfig", value.asInstanceOf[js.Any])
    
    inline def setUsesAncestorConfigNull: Self = StObject.set(x, "usesAncestorConfig", null)
    
    inline def setUsesAncestorConfigUndefined: Self = StObject.set(x, "usesAncestorConfig", js.undefined)
  }
}
