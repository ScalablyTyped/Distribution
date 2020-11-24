package typings.itGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsExt extends js.Object {
  
  /**
    * - If true produces absolute paths
    */
  var absolute: js.UndefOr[Boolean] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * - Glob patterns to ignore
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * - If true yields file paths and skip directories
    */
  var nodir: js.UndefOr[Boolean] = js.native
}
object OptionsExt {
  
  @scala.inline
  def apply(): OptionsExt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsExt]
  }
  
  @scala.inline
  implicit class OptionsExtOps[Self <: OptionsExt] (val x: Self) extends AnyVal {
    
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setNodir(value: Boolean): Self = this.set("nodir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodir: Self = this.set("nodir", js.undefined)
  }
}
