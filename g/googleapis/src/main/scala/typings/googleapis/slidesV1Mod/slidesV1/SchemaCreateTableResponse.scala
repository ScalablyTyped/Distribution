package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a table.
  */
@js.native
trait SchemaCreateTableResponse extends js.Object {
  
  /**
    * The object ID of the created table.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaCreateTableResponse {
  
  @scala.inline
  def apply(): SchemaCreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTableResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateTableResponseOps[Self <: SchemaCreateTableResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
