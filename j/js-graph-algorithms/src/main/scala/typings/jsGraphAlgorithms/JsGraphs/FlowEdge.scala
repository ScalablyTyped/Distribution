package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowEdge extends StObject {
  
  def addResidualFlowTo(x: Double, deltaFlow: Double): Unit
  
  /* private */ var capacity: js.Any
  
  /* private */ var flow: js.Any
  
  def from(): Double
  
  var label: js.UndefOr[String] = js.undefined
  
  def other(x: Double): Double
  
  def residualCapacityTo(x: Double): Double
  
  def to(): Double
  
  /* private */ var v: js.Any
  
  /* private */ var w: js.Any
}
object FlowEdge {
  
  inline def apply(
    addResidualFlowTo: (Double, Double) => Unit,
    capacity: js.Any,
    flow: js.Any,
    from: () => Double,
    other: Double => Double,
    residualCapacityTo: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any
  ): FlowEdge = {
    val __obj = js.Dynamic.literal(addResidualFlowTo = js.Any.fromFunction2(addResidualFlowTo), capacity = capacity.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), residualCapacityTo = js.Any.fromFunction1(residualCapacityTo), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEdge]
  }
  
  extension [Self <: FlowEdge](x: Self) {
    
    inline def setAddResidualFlowTo(value: (Double, Double) => Unit): Self = StObject.set(x, "addResidualFlowTo", js.Any.fromFunction2(value))
    
    inline def setCapacity(value: js.Any): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: js.Any): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: () => Double): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOther(value: Double => Double): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
    
    inline def setResidualCapacityTo(value: Double => Double): Self = StObject.set(x, "residualCapacityTo", js.Any.fromFunction1(value))
    
    inline def setTo(value: () => Double): Self = StObject.set(x, "to", js.Any.fromFunction0(value))
    
    inline def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setW(value: js.Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
