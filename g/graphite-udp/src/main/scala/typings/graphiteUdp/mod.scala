package typings.graphiteUdp

import typings.graphiteUdp.graphiteUdpStrings.udp4
import typings.graphiteUdp.graphiteUdpStrings.udp6
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphite-udp", "Client")
  @js.native
  class Client () extends StObject {
    def this(clientOptions: ClientOptions) = this()
    
    /**
      * During the interval time option, if 2 or more metrics with the same name are sent, metrics will be added (summed)
      */
    def add(name: String, value: Double): Unit = js.native
    
    /**
      * Close the underlying UDP client socket
      *
      * @return void
      */
    def close(): Unit = js.native
    
    /**
      * During the interval time option, if 2 or more metrics with the same name are sent, the last one will be used
      */
    def put(name: String, value: Double): Unit = js.native
  }
  
  @JSImport("graphite-udp", "createClient")
  @js.native
  def createClient(): Client = js.native
  @JSImport("graphite-udp", "createClient")
  @js.native
  def createClient(clientOptions: ClientOptions): Client = js.native
  
  @js.native
  trait ClientOptions extends StObject {
    
    /**
      * called when metrics are sent
      * Defaults to null
      */
    var callback: js.UndefOr[js.Function2[/* error */ Error, /* metrics */ js.Any, Unit]] = js.native
    
    /**
      * graphite server host or ip
      * Defaults to 127.0.0.1
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * Interval to group metrics by in milliseconds
      * Defaults to 5000 (5s)
      */
    var interval: js.UndefOr[Double] = js.native
    
    /**
      * split into smaller UDP packets
      * Defaults to 4096
      */
    var maxPacketSize: js.UndefOr[Double] = js.native
    
    /**
      * graphite server udp port
      * Defaults to 2003
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * Prefix for each metric name
      * Defaults to ''
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Suffix for each metrtic name
      * Defaults to ''
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * udp type (udp4 or udp6)
      * Defaults to udp4
      */
    var `type`: js.UndefOr[udp4 | udp6] = js.native
    
    /**
      * log messages to console
      * Defaults to false
      */
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* error */ Error, /* metrics */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPacketSizeUndefined: Self = StObject.set(x, "maxPacketSize", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
