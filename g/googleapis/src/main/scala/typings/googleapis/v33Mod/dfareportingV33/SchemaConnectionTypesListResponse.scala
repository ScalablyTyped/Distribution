package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connection Type List Response
  */
@js.native
trait SchemaConnectionTypesListResponse extends js.Object {
  
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaConnectionTypesListResponse {
  
  @scala.inline
  def apply(): SchemaConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionTypesListResponse]
  }
  
  @scala.inline
  implicit class SchemaConnectionTypesListResponseOps[Self <: SchemaConnectionTypesListResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectionTypesVarargs(value: SchemaConnectionType*): Self = this.set("connectionTypes", js.Array(value :_*))
    
    @scala.inline
    def setConnectionTypes(value: js.Array[SchemaConnectionType]): Self = this.set("connectionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTypes: Self = this.set("connectionTypes", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
