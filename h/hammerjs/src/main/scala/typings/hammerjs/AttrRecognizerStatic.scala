package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrRecognizerStatic extends js.Object {
  
  def attrTest(input: HammerInput): Boolean = js.native
  
  def process(input: HammerInput): js.Any = js.native
}
object AttrRecognizerStatic {
  
  @scala.inline
  def apply(attrTest: HammerInput => Boolean, process: HammerInput => js.Any): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal(attrTest = js.Any.fromFunction1(attrTest), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
  
  @scala.inline
  implicit class AttrRecognizerStaticOps[Self <: AttrRecognizerStatic] (val x: Self) extends AnyVal {
    
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
    def setAttrTest(value: HammerInput => Boolean): Self = this.set("attrTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcess(value: HammerInput => js.Any): Self = this.set("process", js.Any.fromFunction1(value))
  }
}
