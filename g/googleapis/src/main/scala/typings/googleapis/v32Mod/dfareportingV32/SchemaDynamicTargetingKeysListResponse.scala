package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Targeting Key List Response
  */
@js.native
trait SchemaDynamicTargetingKeysListResponse extends js.Object {
  
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDynamicTargetingKeysListResponse {
  
  @scala.inline
  def apply(): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
  
  @scala.inline
  implicit class SchemaDynamicTargetingKeysListResponseOps[Self <: SchemaDynamicTargetingKeysListResponse] (val x: Self) extends AnyVal {
    
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
    def setDynamicTargetingKeysVarargs(value: SchemaDynamicTargetingKey*): Self = this.set("dynamicTargetingKeys", js.Array(value :_*))
    
    @scala.inline
    def setDynamicTargetingKeys(value: js.Array[SchemaDynamicTargetingKey]): Self = this.set("dynamicTargetingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicTargetingKeys: Self = this.set("dynamicTargetingKeys", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
