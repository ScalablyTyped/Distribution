package typings.jsonminify.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSON extends js.Object {
  
  /**
    * minifies blocks of JSON-like content into valid JSON by removing all whitespace and comments.
    */
  def minify(json: String): String = js.native
}
object JSON {
  
  @scala.inline
  def apply(minify: String => String): JSON = {
    val __obj = js.Dynamic.literal(minify = js.Any.fromFunction1(minify))
    __obj.asInstanceOf[JSON]
  }
  
  @scala.inline
  implicit class JSONOps[Self <: JSON] (val x: Self) extends AnyVal {
    
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
    def setMinify(value: String => String): Self = this.set("minify", js.Any.fromFunction1(value))
  }
}
