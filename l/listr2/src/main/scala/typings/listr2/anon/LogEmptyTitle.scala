package typings.listr2.anon

import org.scalablytyped.runtime.Instantiable1
import typings.listr2.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEmptyTitle extends StObject {
  
  /**
    * log tasks with empty titles
    * @default true
    */
  var logEmptyTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * log title changes
    * @default true
    */
  var logTitleChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * inject a custom logger
    */
  var logger: js.UndefOr[Instantiable1[/* args */ Any, Logger]] = js.undefined
  
  /**
    * inject options to custom logger
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * show duration for all tasks
    */
  var showTimer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * useIcons instead of text for log level
    * @default false
    */
  var useIcons: js.UndefOr[Boolean] = js.undefined
}
object LogEmptyTitle {
  
  inline def apply(): LogEmptyTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEmptyTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogEmptyTitle] (val x: Self) extends AnyVal {
    
    inline def setLogEmptyTitle(value: Boolean): Self = StObject.set(x, "logEmptyTitle", value.asInstanceOf[js.Any])
    
    inline def setLogEmptyTitleUndefined: Self = StObject.set(x, "logEmptyTitle", js.undefined)
    
    inline def setLogTitleChange(value: Boolean): Self = StObject.set(x, "logTitleChange", value.asInstanceOf[js.Any])
    
    inline def setLogTitleChangeUndefined: Self = StObject.set(x, "logTitleChange", js.undefined)
    
    inline def setLogger(value: Instantiable1[/* args */ Any, Logger]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setShowTimer(value: Boolean): Self = StObject.set(x, "showTimer", value.asInstanceOf[js.Any])
    
    inline def setShowTimerUndefined: Self = StObject.set(x, "showTimer", js.undefined)
    
    inline def setUseIcons(value: Boolean): Self = StObject.set(x, "useIcons", value.asInstanceOf[js.Any])
    
    inline def setUseIconsUndefined: Self = StObject.set(x, "useIcons", js.undefined)
  }
}
