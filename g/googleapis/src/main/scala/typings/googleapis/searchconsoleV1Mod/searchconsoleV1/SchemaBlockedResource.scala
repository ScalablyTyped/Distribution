package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blocked resource.
  */
@js.native
trait SchemaBlockedResource extends js.Object {
  
  /**
    * URL of the blocked resource.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaBlockedResource {
  
  @scala.inline
  def apply(): SchemaBlockedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlockedResource]
  }
  
  @scala.inline
  implicit class SchemaBlockedResourceOps[Self <: SchemaBlockedResource] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
