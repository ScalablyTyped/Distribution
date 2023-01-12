package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheet extends StObject {
  
  def create(styleObj: StyleObj): StyleObj
}
object StyleSheet {
  
  @JSImport("@hippy/react", "StyleSheet")
  @js.native
  val ^ : StyleSheet = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: StyleObj => StyleObj): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
