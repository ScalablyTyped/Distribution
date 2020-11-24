package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileOptions extends js.Object {
  
  /**
    * If true and the provided schema is (or contains parts) using an older version of joi, will return a compiled schema that is compatible with the older version.
    * If false, the schema is always compiled using the current version and if older schema components are found, an error is thrown.
    */
  var legacy: Boolean = js.native
}
object CompileOptions {
  
  @scala.inline
  def apply(legacy: Boolean): CompileOptions = {
    val __obj = js.Dynamic.literal(legacy = legacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOptions]
  }
  
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
    
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
    def setLegacy(value: Boolean): Self = this.set("legacy", value.asInstanceOf[js.Any])
  }
}
