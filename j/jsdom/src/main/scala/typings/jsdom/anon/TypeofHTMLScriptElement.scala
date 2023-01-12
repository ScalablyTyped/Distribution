package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHTMLScriptElement extends StObject {
  
  /* standard dom */
  def supports(`type`: String): Boolean
}
object TypeofHTMLScriptElement {
  
  inline def apply(supports: String => Boolean): TypeofHTMLScriptElement = {
    val __obj = js.Dynamic.literal(supports = js.Any.fromFunction1(supports))
    __obj.asInstanceOf[TypeofHTMLScriptElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofHTMLScriptElement] (val x: Self) extends AnyVal {
    
    inline def setSupports(value: String => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
  }
}
