package typings.libp2p

import typings.libp2pInterfaceMetrics.mod.MovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricsMovingAverageMod {
  
  @JSImport("libp2p/dist/src/metrics/moving-average", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/metrics/moving-average", "DefaultMovingAverage")
  @js.native
  open class DefaultMovingAverage protected () extends StObject {
    def this(timespan: Double) = this()
    
    def alpha(t: Double, pt: Double): Double = js.native
    
    var deviation: Double = js.native
    
    var forecast: Double = js.native
    
    var movingAverage: Double = js.native
    
    /* private */ var previousTime: Any = js.native
    
    def push(time: Double, value: Double): Unit = js.native
    
    /* private */ val timespan: Any = js.native
    
    var variance: Double = js.native
  }
  
  inline def createMovingAverage(timespan: Double): MovingAverage = ^.asInstanceOf[js.Dynamic].applyDynamic("createMovingAverage")(timespan.asInstanceOf[js.Any]).asInstanceOf[MovingAverage]
}
