package typings.graphite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphite", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GraphiteClient {
    def this(properties: GraphiteClientProperties) = this()
  }
  @JSImport("graphite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def appendTags(flatMetrics: Any, tags: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTags")(flatMetrics.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def createClient(dsn: String): GraphiteClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(dsn.asInstanceOf[js.Any]).asInstanceOf[GraphiteClient]
  
  /* static member */
  inline def flatten(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def flatten(`object`: Any, flat: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(`object`.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def flatten(`object`: Any, flat: Any, prefix: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(`object`.asInstanceOf[js.Any], flat.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def flatten(`object`: Any, flat: Unit, prefix: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(`object`.asInstanceOf[js.Any], flat.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Callback = js.Function1[/* err */ Any, Unit]
  
  @js.native
  trait GraphiteClient extends StObject {
    
    def end(): Unit = js.native
    
    def write(metrics: Any): Unit = js.native
    def write(metrics: Any, callback: Callback): Unit = js.native
    def write(metrics: Any, timestamp: Double): Unit = js.native
    def write(metrics: Any, timestamp: Double, callback: Callback): Unit = js.native
    def write(metrics: Any, timestamp: Unit, callback: Callback): Unit = js.native
    
    def writeTagged(metrics: Any, tags: Any): Unit = js.native
    def writeTagged(metrics: Any, tags: Any, callback: Callback): Unit = js.native
    def writeTagged(metrics: Any, tags: Any, timestamp: Double): Unit = js.native
    def writeTagged(metrics: Any, tags: Any, timestamp: Double, callback: Callback): Unit = js.native
    def writeTagged(metrics: Any, tags: Any, timestamp: Unit, callback: Callback): Unit = js.native
  }
  
  trait GraphiteClientProperties extends StObject {
    
    var carbon: Any
  }
  object GraphiteClientProperties {
    
    inline def apply(carbon: Any): GraphiteClientProperties = {
      val __obj = js.Dynamic.literal(carbon = carbon.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphiteClientProperties]
    }
    
    extension [Self <: GraphiteClientProperties](x: Self) {
      
      inline def setCarbon(value: Any): Self = StObject.set(x, "carbon", value.asInstanceOf[js.Any])
    }
  }
}
