package typings.hapiSntp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/sntp", "now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("@hapi/sntp", "offset")
  @js.native
  def offset(): js.Promise[Double] = js.native
  
  @JSImport("@hapi/sntp", "start")
  @js.native
  def start(): js.Promise[Unit] = js.native
  @JSImport("@hapi/sntp", "start")
  @js.native
  def start(options: Options): js.Promise[Unit] = js.native
  
  @JSImport("@hapi/sntp", "stop")
  @js.native
  def stop(): Unit = js.native
  
  @JSImport("@hapi/sntp", "time")
  @js.native
  def time(): js.Promise[TimeOptions] = js.native
  @JSImport("@hapi/sntp", "time")
  @js.native
  def time(options: Options): js.Promise[TimeOptions] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var resolveReference: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setResolveReference(value: Boolean): Self = StObject.set(x, "resolveReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveReferenceUndefined: Self = StObject.set(x, "resolveReference", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait TimeOptions extends StObject {
    
    var d: Double = js.native
    
    var isValid: Boolean = js.native
    
    var leapIndicator: String = js.native
    
    var mode: String = js.native
    
    var originateTimestamp: Double = js.native
    
    var pollInterval: Double = js.native
    
    var precision: Double = js.native
    
    var receiveTimestamp: Double = js.native
    
    var receivedLocally: Double = js.native
    
    var referenceId: String = js.native
    
    var referenceTimestamp: Double = js.native
    
    var rootDelay: Double = js.native
    
    var rootDispersion: Double = js.native
    
    var stratum: String = js.native
    
    var t: Double = js.native
    
    var transmitTimestamp: Double = js.native
    
    var version: Double = js.native
  }
  object TimeOptions {
    
    @scala.inline
    def apply(
      d: Double,
      isValid: Boolean,
      leapIndicator: String,
      mode: String,
      originateTimestamp: Double,
      pollInterval: Double,
      precision: Double,
      receiveTimestamp: Double,
      receivedLocally: Double,
      referenceId: String,
      referenceTimestamp: Double,
      rootDelay: Double,
      rootDispersion: Double,
      stratum: String,
      t: Double,
      transmitTimestamp: Double,
      version: Double
    ): TimeOptions = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], leapIndicator = leapIndicator.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originateTimestamp = originateTimestamp.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], receiveTimestamp = receiveTimestamp.asInstanceOf[js.Any], receivedLocally = receivedLocally.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], referenceTimestamp = referenceTimestamp.asInstanceOf[js.Any], rootDelay = rootDelay.asInstanceOf[js.Any], rootDispersion = rootDispersion.asInstanceOf[js.Any], stratum = stratum.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], transmitTimestamp = transmitTimestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeOptions]
    }
    
    @scala.inline
    implicit class TimeOptionsMutableBuilder[Self <: TimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeapIndicator(value: String): Self = StObject.set(x, "leapIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginateTimestamp(value: Double): Self = StObject.set(x, "originateTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveTimestamp(value: Double): Self = StObject.set(x, "receiveTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedLocally(value: Double): Self = StObject.set(x, "receivedLocally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceTimestamp(value: Double): Self = StObject.set(x, "referenceTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDelay(value: Double): Self = StObject.set(x, "rootDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDispersion(value: Double): Self = StObject.set(x, "rootDispersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStratum(value: String): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransmitTimestamp(value: Double): Self = StObject.set(x, "transmitTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
