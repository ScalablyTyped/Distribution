package typings.jotai.anon

import typings.jotai.jotaiStrings.loading
import typings.jotai.vanillaUtilsLoadableMod.Loadable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State
  extends StObject
     with Loadable_[Any] {
  
  var state: loading
}
object State {
  
  inline def apply(): State = {
    val __obj = js.Dynamic.literal(state = "loading")
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
