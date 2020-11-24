package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a ReopenMatterRequest.
  */
@js.native
trait SchemaReopenMatterResponse extends js.Object {
  
  /**
    * The updated matter, with state OPEN.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}
object SchemaReopenMatterResponse {
  
  @scala.inline
  def apply(): SchemaReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReopenMatterResponse]
  }
  
  @scala.inline
  implicit class SchemaReopenMatterResponseOps[Self <: SchemaReopenMatterResponse] (val x: Self) extends AnyVal {
    
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
    def setMatter(value: SchemaMatter): Self = this.set("matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatter: Self = this.set("matter", js.undefined)
  }
}
