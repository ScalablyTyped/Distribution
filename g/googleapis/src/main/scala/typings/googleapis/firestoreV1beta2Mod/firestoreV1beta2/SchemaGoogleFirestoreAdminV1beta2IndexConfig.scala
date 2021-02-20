package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The index configuration for this field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2IndexConfig extends StObject {
  
  /**
    * Output only. Specifies the resource name of the `Field` from which this
    * field&#39;s index configuration is set (when `uses_ancestor_config` is
    * true), or from which it *would* be set if this field had no index
    * configuration (when `uses_ancestor_config` is false).
    */
  var ancestorField: js.UndefOr[String] = js.native
  
  /**
    * The indexes supported for this field.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Index]] = js.native
  
  /**
    * Output only When true, the `Field`&#39;s index configuration is in the
    * process of being reverted. Once complete, the index config will
    * transition to the same state as the field specified by `ancestor_field`,
    * at which point `uses_ancestor_config` will be `true` and `reverting` will
    * be `false`.
    */
  var reverting: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. When true, the `Field`&#39;s index configuration is set from
    * the configuration specified by the `ancestor_field`. When false, the
    * `Field`&#39;s index configuration is defined explicitly.
    */
  var usesAncestorConfig: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleFirestoreAdminV1beta2IndexConfig {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2IndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2IndexConfigMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2IndexConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorField(value: String): Self = StObject.set(x, "ancestorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorFieldUndefined: Self = StObject.set(x, "ancestorField", js.undefined)
    
    @scala.inline
    def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1beta2Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1beta2Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setReverting(value: Boolean): Self = StObject.set(x, "reverting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertingUndefined: Self = StObject.set(x, "reverting", js.undefined)
    
    @scala.inline
    def setUsesAncestorConfig(value: Boolean): Self = StObject.set(x, "usesAncestorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesAncestorConfigUndefined: Self = StObject.set(x, "usesAncestorConfig", js.undefined)
  }
}
