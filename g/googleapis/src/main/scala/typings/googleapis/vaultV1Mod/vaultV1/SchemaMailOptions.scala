package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mail search advanced options
  */
@js.native
trait SchemaMailOptions extends js.Object {
  
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}
object SchemaMailOptions {
  
  @scala.inline
  def apply(): SchemaMailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailOptions]
  }
  
  @scala.inline
  implicit class SchemaMailOptionsOps[Self <: SchemaMailOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeDrafts(value: Boolean): Self = this.set("excludeDrafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDrafts: Self = this.set("excludeDrafts", js.undefined)
  }
}
