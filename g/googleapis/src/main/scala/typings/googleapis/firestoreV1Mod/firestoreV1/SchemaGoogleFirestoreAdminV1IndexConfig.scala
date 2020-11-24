package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The index configuration for this field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1IndexConfig extends js.Object {
  
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
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1Index]] = js.native
  
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
object SchemaGoogleFirestoreAdminV1IndexConfig {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1IndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1IndexConfigOps[Self <: SchemaGoogleFirestoreAdminV1IndexConfig] (val x: Self) extends AnyVal {
    
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
    def setAncestorField(value: String): Self = this.set("ancestorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestorField: Self = this.set("ancestorField", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1Index*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1Index]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setReverting(value: Boolean): Self = this.set("reverting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverting: Self = this.set("reverting", js.undefined)
    
    @scala.inline
    def setUsesAncestorConfig(value: Boolean): Self = this.set("usesAncestorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesAncestorConfig: Self = this.set("usesAncestorConfig", js.undefined)
  }
}
