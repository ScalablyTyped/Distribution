package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgChartLegendMethods extends StObject {
  
  def destroy(): Unit
  
  def getLegend(): Unit
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String
}
object IgChartLegendMethods {
  
  inline def apply(destroy: () => Unit, getLegend: () => Unit, id: () => String): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getLegend = js.Any.fromFunction0(getLegend), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgChartLegendMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgChartLegendMethods] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetLegend(value: () => Unit): Self = StObject.set(x, "getLegend", js.Any.fromFunction0(value))
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
  }
}
