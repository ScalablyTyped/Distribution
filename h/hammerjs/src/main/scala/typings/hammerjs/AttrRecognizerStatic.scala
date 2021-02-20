package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrRecognizerStatic extends StObject {
  
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
  implicit class AttrRecognizerStaticMutableBuilder[Self <: AttrRecognizerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrTest(value: HammerInput => Boolean): Self = StObject.set(x, "attrTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcess(value: HammerInput => js.Any): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
