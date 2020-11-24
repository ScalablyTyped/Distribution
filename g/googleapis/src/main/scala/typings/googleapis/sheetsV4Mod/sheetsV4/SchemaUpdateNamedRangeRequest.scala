package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of the named range with the specified namedRangeId.
  */
@js.native
trait SchemaUpdateNamedRangeRequest extends js.Object {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `namedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The named range to update with the new properties.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}
object SchemaUpdateNamedRangeRequest {
  
  @scala.inline
  def apply(): SchemaUpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateNamedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateNamedRangeRequestOps[Self <: SchemaUpdateNamedRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setNamedRange(value: SchemaNamedRange): Self = this.set("namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRange: Self = this.set("namedRange", js.undefined)
  }
}
