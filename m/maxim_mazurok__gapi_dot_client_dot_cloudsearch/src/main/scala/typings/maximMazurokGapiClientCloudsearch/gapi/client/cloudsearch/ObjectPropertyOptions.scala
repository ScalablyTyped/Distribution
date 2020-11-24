package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPropertyOptions extends js.Object {
  
  /**
    * The properties of the sub-object. These properties represent a nested object. For example, if this property represents a postal address, the subobjectProperties might be named
    * *street*, *city*, and *state*. The maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[PropertyDefinition]] = js.native
}
object ObjectPropertyOptions {
  
  @scala.inline
  def apply(): ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectPropertyOptions]
  }
  
  @scala.inline
  implicit class ObjectPropertyOptionsOps[Self <: ObjectPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setSubobjectPropertiesVarargs(value: PropertyDefinition*): Self = this.set("subobjectProperties", js.Array(value :_*))
    
    @scala.inline
    def setSubobjectProperties(value: js.Array[PropertyDefinition]): Self = this.set("subobjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubobjectProperties: Self = this.set("subobjectProperties", js.undefined)
  }
}
