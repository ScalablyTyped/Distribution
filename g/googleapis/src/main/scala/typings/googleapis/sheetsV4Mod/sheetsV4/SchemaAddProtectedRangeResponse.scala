package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a new protected range.
  */
@js.native
trait SchemaAddProtectedRangeResponse extends js.Object {
  
  /**
    * The newly added protected range.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}
object SchemaAddProtectedRangeResponse {
  
  @scala.inline
  def apply(): SchemaAddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProtectedRangeResponse]
  }
  
  @scala.inline
  implicit class SchemaAddProtectedRangeResponseOps[Self <: SchemaAddProtectedRangeResponse] (val x: Self) extends AnyVal {
    
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
    def setProtectedRange(value: SchemaProtectedRange): Self = this.set("protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedRange: Self = this.set("protectedRange", js.undefined)
  }
}
