package typings.jsforce.bulkMod

import typings.jsforce.jsforceStrings.Parallel
import typings.jsforce.jsforceStrings.Serial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkOptions extends js.Object {
  
  var concurrencyMode: js.UndefOr[Serial | Parallel] = js.native
  
  var extIdField: String = js.native
}
object BulkOptions {
  
  @scala.inline
  def apply(extIdField: String): BulkOptions = {
    val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkOptions]
  }
  
  @scala.inline
  implicit class BulkOptionsOps[Self <: BulkOptions] (val x: Self) extends AnyVal {
    
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
    def setExtIdField(value: String): Self = this.set("extIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyMode(value: Serial | Parallel): Self = this.set("concurrencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrencyMode: Self = this.set("concurrencyMode", js.undefined)
  }
}
