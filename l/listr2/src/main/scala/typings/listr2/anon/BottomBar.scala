package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomBar extends StObject {
  
  var bottomBar: js.UndefOr[Boolean] = js.undefined
  
  var prompt: js.UndefOr[Boolean] = js.undefined
  
  var tasks: js.UndefOr[Boolean] = js.undefined
}
object BottomBar {
  
  inline def apply(): BottomBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomBar] (val x: Self) extends AnyVal {
    
    inline def setBottomBar(value: Boolean): Self = StObject.set(x, "bottomBar", value.asInstanceOf[js.Any])
    
    inline def setBottomBarUndefined: Self = StObject.set(x, "bottomBar", js.undefined)
    
    inline def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setTasks(value: Boolean): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
  }
}
