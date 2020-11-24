package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceInsertOptions extends js.Object {
  
  var deepInsert: js.UndefOr[Boolean] = js.native
  
  var onConflictIgnore: js.UndefOr[Boolean] = js.native
}
object PersistenceInsertOptions {
  
  @scala.inline
  def apply(): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
  
  @scala.inline
  implicit class PersistenceInsertOptionsOps[Self <: PersistenceInsertOptions] (val x: Self) extends AnyVal {
    
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
    def setDeepInsert(value: Boolean): Self = this.set("deepInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepInsert: Self = this.set("deepInsert", js.undefined)
    
    @scala.inline
    def setOnConflictIgnore(value: Boolean): Self = this.set("onConflictIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnConflictIgnore: Self = this.set("onConflictIgnore", js.undefined)
  }
}
