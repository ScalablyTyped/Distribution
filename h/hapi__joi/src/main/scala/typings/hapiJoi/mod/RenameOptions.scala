package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameOptions extends js.Object {
  
  /**
    * if true, does not delete the old key name, keeping both the new and old keys in place.
    *
    * @default false
    */
  var alias: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, skip renaming of a key if it's undefined.
    *
    * @default false
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, allows renaming multiple keys to the same destination where the last rename wins.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, allows renaming a key over an existing key.
    *
    * @default false
    */
  var `override`: js.UndefOr[Boolean] = js.native
}
object RenameOptions {
  
  @scala.inline
  def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  
  @scala.inline
  implicit class RenameOptionsOps[Self <: RenameOptions] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: Boolean): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
}
