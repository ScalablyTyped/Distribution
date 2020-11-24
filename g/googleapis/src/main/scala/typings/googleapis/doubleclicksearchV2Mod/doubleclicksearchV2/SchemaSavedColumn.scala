package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A saved column
  */
@js.native
trait SchemaSavedColumn extends js.Object {
  
  /**
    * Identifies this as a SavedColumn resource. Value: the fixed string
    * doubleclicksearch#savedColumn.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the saved column.
    */
  var savedColumnName: js.UndefOr[String] = js.native
  
  /**
    * The type of data this saved column will produce.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaSavedColumn {
  
  @scala.inline
  def apply(): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumn]
  }
  
  @scala.inline
  implicit class SchemaSavedColumnOps[Self <: SchemaSavedColumn] (val x: Self) extends AnyVal {
    
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
    def setSavedColumnName(value: String): Self = this.set("savedColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedColumnName: Self = this.set("savedColumnName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
