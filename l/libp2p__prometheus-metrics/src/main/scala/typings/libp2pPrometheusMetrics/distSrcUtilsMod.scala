package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculateMetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/utils", "ONE_MINUTE")
  @js.native
  val ONE_MINUTE: Double = js.native
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/utils", "ONE_SECOND")
  @js.native
  val ONE_SECOND: /* 1000 */ Double = js.native
  
  inline def normaliseString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CalculatedMetric[T] extends StObject {
    
    def addCalculator(calculator: CalculateMetric[T]): Unit
  }
  object CalculatedMetric {
    
    inline def apply[T](addCalculator: CalculateMetric[T] => Unit): CalculatedMetric[T] = {
      val __obj = js.Dynamic.literal(addCalculator = js.Any.fromFunction1(addCalculator))
      __obj.asInstanceOf[CalculatedMetric[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedMetric[?], T] (val x: Self & CalculatedMetric[T]) extends AnyVal {
      
      inline def setAddCalculator(value: CalculateMetric[T] => Unit): Self = StObject.set(x, "addCalculator", js.Any.fromFunction1(value))
    }
  }
}
