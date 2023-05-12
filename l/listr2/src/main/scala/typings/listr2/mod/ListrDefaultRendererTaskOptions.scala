package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrDefaultRendererTaskOptions
  extends StObject
     with RendererPresetTimer {
  
  /**
    * Write task output to the bottom bar instead of the gap under the task title itself.
    * This can be useful for stream of data coming in and is the default mode for tasks without a title.
    *
    * - `true` only keep 1 line of the latest data outputted by the task.
    * - `number` will keep the defined amount of data as the last lines.
    * - `false` will not use bottom bar if task has a title.
    *
    * @defaultValue `false`
    */
  var bottomBar: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * Keep output of the task after task finishes.
    *
    * - This can be enabled for both normal task output under the title and bottom bar.
    *
    * @defaultValue false
    */
  var persistentOutput: js.UndefOr[Boolean] = js.undefined
}
object ListrDefaultRendererTaskOptions {
  
  inline def apply(): ListrDefaultRendererTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrDefaultRendererTaskOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrDefaultRendererTaskOptions] (val x: Self) extends AnyVal {
    
    inline def setBottomBar(value: Boolean | Double): Self = StObject.set(x, "bottomBar", value.asInstanceOf[js.Any])
    
    inline def setBottomBarUndefined: Self = StObject.set(x, "bottomBar", js.undefined)
    
    inline def setPersistentOutput(value: Boolean): Self = StObject.set(x, "persistentOutput", value.asInstanceOf[js.Any])
    
    inline def setPersistentOutputUndefined: Self = StObject.set(x, "persistentOutput", js.undefined)
  }
}
