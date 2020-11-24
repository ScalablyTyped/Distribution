package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Display Fields for Search Results
  */
@js.native
trait SchemaResultDisplayField extends js.Object {
  
  /**
    * The display label for the property.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The operator name of the property.
    */
  var operatorName: js.UndefOr[String] = js.native
  
  /**
    * The name value pair for the property.
    */
  var property: js.UndefOr[SchemaNamedProperty] = js.native
}
object SchemaResultDisplayField {
  
  @scala.inline
  def apply(): SchemaResultDisplayField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayField]
  }
  
  @scala.inline
  implicit class SchemaResultDisplayFieldOps[Self <: SchemaResultDisplayField] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaNamedProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}
