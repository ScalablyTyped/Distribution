package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Help extends StObject {
  
  def toJSON(): String
}
object Help {
  
  inline def apply(toJSON: () => String): Help = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Help]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Help] (val x: Self) extends AnyVal {
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
