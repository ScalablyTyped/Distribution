package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structured data object consisting of named properties.
  */
@js.native
trait SchemaStructuredDataObject extends js.Object {
  
  /**
    * The properties for the object. The maximum number of elements is 1000.
    */
  var properties: js.UndefOr[js.Array[SchemaNamedProperty]] = js.native
}
object SchemaStructuredDataObject {
  
  @scala.inline
  def apply(): SchemaStructuredDataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredDataObject]
  }
  
  @scala.inline
  implicit class SchemaStructuredDataObjectOps[Self <: SchemaStructuredDataObject] (val x: Self) extends AnyVal {
    
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
    def setPropertiesVarargs(value: SchemaNamedProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[SchemaNamedProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
