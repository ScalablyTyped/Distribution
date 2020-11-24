package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentOptions extends js.Object {
  
  var exclude: ExclusionRange | js.Array[ExclusionRange] = js.native
  
  var indentStart: Boolean = js.native
}
object IndentOptions {
  
  @scala.inline
  def apply(exclude: ExclusionRange | js.Array[ExclusionRange], indentStart: Boolean): IndentOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], indentStart = indentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentOptions]
  }
  
  @scala.inline
  implicit class IndentOptionsOps[Self <: IndentOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: ExclusionRange*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: ExclusionRange | js.Array[ExclusionRange]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentStart(value: Boolean): Self = this.set("indentStart", value.asInstanceOf[js.Any])
  }
}
