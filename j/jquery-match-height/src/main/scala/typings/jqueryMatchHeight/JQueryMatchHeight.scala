package typings.jqueryMatchHeight

import typings.jquery.JQueryEventObject
import typings.jqueryMatchHeight.JQueryMatchHeight.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMatchHeight extends StObject {
  
  /**
    * Set all selected elements to the height of the tallest.
    * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
    */
  def apply(): JQuery = js.native
  def apply(options: Options): JQuery = js.native
  
  def _afterUpdate(event: JQueryEventObject, groups: js.Array[js.Any]): js.Any = js.native
  
  def _apply(elements: js.Any, options: js.Any): Unit = js.native
  
  def _beforeUpdate(event: JQueryEventObject, groups: js.Array[js.Any]): js.Any = js.native
  
  var _groups: js.Array[js.Any] = js.native
  
  var _maintainScroll: Boolean = js.native
  
  def _rows($item: JQuery): js.Array[js.Any] = js.native
  
  var _throttle: Double = js.native
  
  def _update(): Unit = js.native
}
object JQueryMatchHeight {
  
  trait Options extends StObject {
    
    var byRow: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setByRow(value: Boolean): Self = StObject.set(x, "byRow", value.asInstanceOf[js.Any])
      
      inline def setByRowUndefined: Self = StObject.set(x, "byRow", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
