package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptionsObject extends StObject {
  
  /**
    * Matches by the index.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Matches by `option.label`.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Matches by `option.value`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SelectOptionsObject {
  
  inline def apply(): SelectOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
