package typings.graphite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphite", JSImport.Namespace)
  @js.native
  class ^ protected () extends GraphiteClient {
    def this(properties: GraphiteClientProperties) = this()
  }
  
  /* static member */
  @JSImport("graphite", "appendTags")
  @js.native
  def appendTags(flatMetrics: js.Any, tags: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("graphite", "createClient")
  @js.native
  def createClient(dsn: String): GraphiteClient = js.native
  
  /* static member */
  @JSImport("graphite", "flatten")
  @js.native
  def flatten(`object`: js.Any): js.Any = js.native
  @JSImport("graphite", "flatten")
  @js.native
  def flatten(`object`: js.Any, flat: js.UndefOr[scala.Nothing], prefix: String): js.Any = js.native
  @JSImport("graphite", "flatten")
  @js.native
  def flatten(`object`: js.Any, flat: js.Any): js.Any = js.native
  @JSImport("graphite", "flatten")
  @js.native
  def flatten(`object`: js.Any, flat: js.Any, prefix: String): js.Any = js.native
  
  type Callback = js.Function1[/* err */ js.Any, Unit]
  
  @js.native
  trait GraphiteClient extends StObject {
    
    def end(): Unit = js.native
    
    def write(metrics: js.Any): Unit = js.native
    def write(metrics: js.Any, callback: Callback): Unit = js.native
    def write(metrics: js.Any, timestamp: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
    def write(metrics: js.Any, timestamp: Double): Unit = js.native
    def write(metrics: js.Any, timestamp: Double, callback: Callback): Unit = js.native
    
    def writeTagged(metrics: js.Any, tags: js.Any): Unit = js.native
    def writeTagged(metrics: js.Any, tags: js.Any, callback: Callback): Unit = js.native
    def writeTagged(metrics: js.Any, tags: js.Any, timestamp: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
    def writeTagged(metrics: js.Any, tags: js.Any, timestamp: Double): Unit = js.native
    def writeTagged(metrics: js.Any, tags: js.Any, timestamp: Double, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait GraphiteClientProperties extends StObject {
    
    var carbon: js.Any = js.native
  }
  object GraphiteClientProperties {
    
    @scala.inline
    def apply(carbon: js.Any): GraphiteClientProperties = {
      val __obj = js.Dynamic.literal(carbon = carbon.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphiteClientProperties]
    }
    
    @scala.inline
    implicit class GraphiteClientPropertiesMutableBuilder[Self <: GraphiteClientProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarbon(value: js.Any): Self = StObject.set(x, "carbon", value.asInstanceOf[js.Any])
    }
  }
}
