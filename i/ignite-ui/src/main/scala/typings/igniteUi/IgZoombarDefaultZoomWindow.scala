package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgZoombarDefaultZoomWindow
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * The left component of the zoom window in percentages.
    *
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the zoom window in percentages.
    *
    */
  var width: js.UndefOr[String] = js.undefined
}
object IgZoombarDefaultZoomWindow {
  
  inline def apply(): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgZoombarDefaultZoomWindow] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
