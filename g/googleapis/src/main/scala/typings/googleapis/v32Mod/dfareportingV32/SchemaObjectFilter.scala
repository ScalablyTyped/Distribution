package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object Filter.
  */
@js.native
trait SchemaObjectFilter extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#objectFilter&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Applicable when status is ASSIGNED. The user has access to objects with
    * these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Status of the filter. NONE means the user has access to none of the
    * objects. ALL means the user has access to all objects. ASSIGNED means the
    * user has access to the objects with IDs in the objectIds list.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaObjectFilter {
  
  @scala.inline
  def apply(): SchemaObjectFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectFilter]
  }
  
  @scala.inline
  implicit class SchemaObjectFilterOps[Self <: SchemaObjectFilter] (val x: Self) extends AnyVal {
    
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
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
