package typings.hippyReact.mod

import typings.hippyReact.anon.NavigatorBarHeight
import typings.hippyReact.hippyReactStrings.screen
import typings.hippyReact.hippyReactStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  def get(dim: window | screen): NavigatorBarHeight
}
object Dimensions {
  
  @JSImport("@hippy/react", "Dimensions")
  @js.native
  val ^ : Dimensions = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    inline def setGet(value: window | screen => NavigatorBarHeight): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
