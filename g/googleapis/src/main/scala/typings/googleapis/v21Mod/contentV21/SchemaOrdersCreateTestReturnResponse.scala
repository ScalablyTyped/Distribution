package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCreateTestReturnResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCreateTestReturnResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The ID of the newly created test order return.
    */
  var returnId: js.UndefOr[String] = js.native
}
object SchemaOrdersCreateTestReturnResponse {
  
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnResponse]
  }
  
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnResponseOps[Self <: SchemaOrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    
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
    def setReturnId(value: String): Self = this.set("returnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnId: Self = this.set("returnId", js.undefined)
  }
}
