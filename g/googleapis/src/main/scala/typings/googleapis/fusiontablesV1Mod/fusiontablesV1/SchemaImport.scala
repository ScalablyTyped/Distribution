package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an import request.
  */
@js.native
trait SchemaImport extends js.Object {
  
  /**
    * Type name: a template for an import request.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The number of rows received from the import request.
    */
  var numRowsReceived: js.UndefOr[String] = js.native
}
object SchemaImport {
  
  @scala.inline
  def apply(): SchemaImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImport]
  }
  
  @scala.inline
  implicit class SchemaImportOps[Self <: SchemaImport] (val x: Self) extends AnyVal {
    
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
    def setNumRowsReceived(value: String): Self = this.set("numRowsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRowsReceived: Self = this.set("numRowsReceived", js.undefined)
  }
}
