package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgZoombarDefaultZoomWindow
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The left component of the zoom window in percentages.
    *
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * The width of the zoom window in percentages.
    *
    */
  var width: js.UndefOr[String] = js.native
}
object IgZoombarDefaultZoomWindow {
  
  @scala.inline
  def apply(): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
  
  @scala.inline
  implicit class IgZoombarDefaultZoomWindowMutableBuilder[Self <: IgZoombarDefaultZoomWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
