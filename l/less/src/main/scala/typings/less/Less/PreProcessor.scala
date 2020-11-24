package typings.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreProcessor extends js.Object {
  
  def process(src: String, extra: PreProcessorExtraInfo): String = js.native
}
object PreProcessor {
  
  @scala.inline
  def apply(process: (String, PreProcessorExtraInfo) => String): PreProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[PreProcessor]
  }
  
  @scala.inline
  implicit class PreProcessorOps[Self <: PreProcessor] (val x: Self) extends AnyVal {
    
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
    def setProcess(value: (String, PreProcessorExtraInfo) => String): Self = this.set("process", js.Any.fromFunction2(value))
  }
}
