package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayedProperty extends js.Object {
  
  /**
    * The name of the top-level property as defined in a property definition for the object. If the name is not a defined property in the schema, an error is given when attempting to
    * update the schema.
    */
  var propertyName: js.UndefOr[String] = js.native
}
object DisplayedProperty {
  
  @scala.inline
  def apply(): DisplayedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayedProperty]
  }
  
  @scala.inline
  implicit class DisplayedPropertyOps[Self <: DisplayedProperty] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
  }
}
