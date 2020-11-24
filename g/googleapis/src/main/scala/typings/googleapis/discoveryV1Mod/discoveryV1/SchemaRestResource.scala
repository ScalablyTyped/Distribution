package typings.googleapis.discoveryV1Mod.discoveryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRestResource extends js.Object {
  
  /**
    * Methods on this resource.
    */
  var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.native
  
  /**
    * Sub-resources on this resource.
    */
  var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.native
}
object SchemaRestResource {
  
  @scala.inline
  def apply(): SchemaRestResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestResource]
  }
  
  @scala.inline
  implicit class SchemaRestResourceOps[Self <: SchemaRestResource] (val x: Self) extends AnyVal {
    
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
    def setMethods(value: StringDictionary[SchemaRestMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setResources(value: StringDictionary[SchemaRestResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
