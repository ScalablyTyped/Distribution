package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaChange extends js.Object {
  
  var additions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  
  var deletions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isServing: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#change&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object SchemaChange {
  
  @scala.inline
  def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  @scala.inline
  implicit class SchemaChangeOps[Self <: SchemaChange] (val x: Self) extends AnyVal {
    
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
    def setAdditionsVarargs(value: SchemaResourceRecordSet*): Self = this.set("additions", js.Array(value :_*))
    
    @scala.inline
    def setAdditions(value: js.Array[SchemaResourceRecordSet]): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditions: Self = this.set("additions", js.undefined)
    
    @scala.inline
    def setDeletionsVarargs(value: SchemaResourceRecordSet*): Self = this.set("deletions", js.Array(value :_*))
    
    @scala.inline
    def setDeletions(value: js.Array[SchemaResourceRecordSet]): Self = this.set("deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletions: Self = this.set("deletions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsServing(value: Boolean): Self = this.set("isServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServing: Self = this.set("isServing", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
