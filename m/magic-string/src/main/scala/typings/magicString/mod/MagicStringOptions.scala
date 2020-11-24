package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MagicStringOptions extends js.Object {
  
  var filename: String = js.native
  
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
}
object MagicStringOptions {
  
  @scala.inline
  def apply(filename: String, indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]): MagicStringOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], indentExclusionRanges = indentExclusionRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagicStringOptions]
  }
  
  @scala.inline
  implicit class MagicStringOptionsOps[Self <: MagicStringOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentExclusionRangesVarargs(value: ExclusionRange*): Self = this.set("indentExclusionRanges", js.Array(value :_*))
    
    @scala.inline
    def setIndentExclusionRanges(value: ExclusionRange | js.Array[ExclusionRange]): Self = this.set("indentExclusionRanges", value.asInstanceOf[js.Any])
  }
}
