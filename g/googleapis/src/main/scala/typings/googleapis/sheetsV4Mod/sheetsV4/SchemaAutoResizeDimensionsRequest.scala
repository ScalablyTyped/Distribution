package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Automatically resizes one or more dimensions based on the contents of the
  * cells in that dimension.
  */
@js.native
trait SchemaAutoResizeDimensionsRequest extends js.Object {
  
  /**
    * The dimensions to automatically resize.
    */
  var dimensions: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaAutoResizeDimensionsRequest {
  
  @scala.inline
  def apply(): SchemaAutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoResizeDimensionsRequest]
  }
  
  @scala.inline
  implicit class SchemaAutoResizeDimensionsRequestOps[Self <: SchemaAutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDimensions(value: SchemaDimensionRange): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
  }
}
