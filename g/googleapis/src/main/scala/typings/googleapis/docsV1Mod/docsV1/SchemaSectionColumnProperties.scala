package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties that apply to a section&#39;s column.
  */
@js.native
trait SchemaSectionColumnProperties extends js.Object {
  
  /**
    * The padding at the end of the column.
    */
  var paddingEnd: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The width of the column.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}
object SchemaSectionColumnProperties {
  
  @scala.inline
  def apply(): SchemaSectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionColumnProperties]
  }
  
  @scala.inline
  implicit class SchemaSectionColumnPropertiesOps[Self <: SchemaSectionColumnProperties] (val x: Self) extends AnyVal {
    
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
    def setPaddingEnd(value: SchemaDimension): Self = this.set("paddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingEnd: Self = this.set("paddingEnd", js.undefined)
    
    @scala.inline
    def setWidth(value: SchemaDimension): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
