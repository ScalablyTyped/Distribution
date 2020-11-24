package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metaline is a list of properties that are displayed along with the search
  * result to provide context.
  */
@js.native
trait SchemaMetaline extends js.Object {
  
  /**
    * The list of displayed properties for the metaline.
    */
  var properties: js.UndefOr[js.Array[SchemaDisplayedProperty]] = js.native
}
object SchemaMetaline {
  
  @scala.inline
  def apply(): SchemaMetaline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetaline]
  }
  
  @scala.inline
  implicit class SchemaMetalineOps[Self <: SchemaMetaline] (val x: Self) extends AnyVal {
    
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
    def setPropertiesVarargs(value: SchemaDisplayedProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[SchemaDisplayedProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
