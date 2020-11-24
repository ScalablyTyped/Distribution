package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatastoreConfig extends js.Object {
  
  var Spec: js.UndefOr[DatastoreSpec] = js.native
}
object DatastoreConfig {
  
  @scala.inline
  def apply(): DatastoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreConfig]
  }
  
  @scala.inline
  implicit class DatastoreConfigOps[Self <: DatastoreConfig] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: DatastoreSpec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("Spec", js.undefined)
  }
}
