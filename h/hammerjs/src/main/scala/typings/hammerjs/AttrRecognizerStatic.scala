package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrRecognizerStatic extends StObject {
  
  def attrTest(input: HammerInput): Boolean
  
  def process(input: HammerInput): js.Any
}
object AttrRecognizerStatic {
  
  inline def apply(attrTest: HammerInput => Boolean, process: HammerInput => js.Any): AttrRecognizerStatic = {
    val __obj = js.Dynamic.literal(attrTest = js.Any.fromFunction1(attrTest), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[AttrRecognizerStatic]
  }
  
  extension [Self <: AttrRecognizerStatic](x: Self) {
    
    inline def setAttrTest(value: HammerInput => Boolean): Self = StObject.set(x, "attrTest", js.Any.fromFunction1(value))
    
    inline def setProcess(value: HammerInput => js.Any): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
