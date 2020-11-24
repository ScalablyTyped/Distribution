package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new protected range.
  */
@js.native
trait SchemaAddProtectedRangeRequest extends js.Object {
  
  /**
    * The protected range to be added. The protectedRangeId field is optional;
    * if one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}
object SchemaAddProtectedRangeRequest {
  
  @scala.inline
  def apply(): SchemaAddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaAddProtectedRangeRequestOps[Self <: SchemaAddProtectedRangeRequest] (val x: Self) extends AnyVal {
    
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
