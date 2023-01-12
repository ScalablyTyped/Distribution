package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomBar extends StObject {
  
  /**
    * write task output to the bottom bar instead of the gap under the task title itself.
    * useful for a stream of data.
    * @default false
    *
    * `true` only keep 1 line of the latest data outputted by the task.
    * `false` only keep 1 line of the latest data outputted by the task.
    * `number` will keep designated data of the latest data outputted by the task.
    */
  var bottomBar: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * keep output after task finishes
    * @default false
    *
    * works both for the bottom bar and the default behavior
    */
  var persistentOutput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * show the task time if it was successful
    */
  var showTimer: js.UndefOr[Boolean] = js.undefined
}
object BottomBar {
  
  inline def apply(): BottomBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomBar] (val x: Self) extends AnyVal {
    
    inline def setBottomBar(value: Boolean | Double): Self = StObject.set(x, "bottomBar", value.asInstanceOf[js.Any])
    
    inline def setBottomBarUndefined: Self = StObject.set(x, "bottomBar", js.undefined)
    
    inline def setPersistentOutput(value: Boolean): Self = StObject.set(x, "persistentOutput", value.asInstanceOf[js.Any])
    
    inline def setPersistentOutputUndefined: Self = StObject.set(x, "persistentOutput", js.undefined)
    
    inline def setShowTimer(value: Boolean): Self = StObject.set(x, "showTimer", value.asInstanceOf[js.Any])
    
    inline def setShowTimerUndefined: Self = StObject.set(x, "showTimer", js.undefined)
  }
}
