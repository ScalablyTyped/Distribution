package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Platform Type List Response
  */
@js.native
trait SchemaPlatformTypesListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Platform type collection.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.native
}
object SchemaPlatformTypesListResponse {
  
  @scala.inline
  def apply(): SchemaPlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformTypesListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlatformTypesListResponseOps[Self <: SchemaPlatformTypesListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: SchemaPlatformType*): Self = this.set("platformTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: js.Array[SchemaPlatformType]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
  }
}
