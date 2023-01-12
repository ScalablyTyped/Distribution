package typings.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToJSON extends StObject {
  
  def toJSON(): Any
}
object ToJSON {
  
  inline def apply(toJSON: () => Any): ToJSON = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ToJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToJSON] (val x: Self) extends AnyVal {
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
