package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that handles html sanitization.
  */
@js.native
trait ISanitizer extends js.Object {
  
  /**
    * Sanitize an HTML string.
    */
  def sanitize(dirty: String): String = js.native
}
object ISanitizer {
  
  @scala.inline
  def apply(sanitize: String => String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[ISanitizer]
  }
  
  @scala.inline
  implicit class ISanitizerOps[Self <: ISanitizer] (val x: Self) extends AnyVal {
    
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
    def setSanitize(value: String => String): Self = this.set("sanitize", js.Any.fromFunction1(value))
  }
}
