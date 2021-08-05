package typings.graylog2

import typings.graylog2.mod.GraylogDeflate
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(message: String): Unit = js.native
    def apply(message: String, _underscore: Unit, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(message: String, _underscore: Unit, additionalFields: Record[String, js.Any], timestamp: Double): Unit = js.native
    def apply(message: String, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def apply(message: String, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(message: String, additionalFields: Record[String, js.Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def apply(message: String, fullMessage: String): Unit = js.native
    def apply(message: String, fullMessage: String, additionalFields: Unit, timestamp: Double): Unit = js.native
    def apply(message: String, fullMessage: String, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(message: String, fullMessage: String, additionalFields: Record[String, js.Any], timestamp: Double): Unit = js.native
    def apply(message: Error): Unit = js.native
    def apply(message: Error, _underscore: Unit, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(message: Error, _underscore: Unit, additionalFields: Record[String, js.Any], timestamp: Double): Unit = js.native
    def apply(message: Error, additionalFields: Unit, _underscore: Unit, timestamp: Double): Unit = js.native
    def apply(message: Error, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(message: Error, additionalFields: Record[String, js.Any], _underscore: Unit, timestamp: Double): Unit = js.native
    def apply(message: Record[String, js.Any]): Unit = js.native
    def apply(message: Record[String, js.Any], _underscore: Unit, additionalFields: Unit, timestamp: Double): Unit = js.native
    def apply(message: Record[String, js.Any], _underscore: Unit, additionalFields: Record[String, js.Any]): Unit = js.native
    def apply(
      message: Record[String, js.Any],
      _underscore: Unit,
      additionalFields: Record[String, js.Any],
      timestamp: Double
    ): Unit = js.native
  }
  
  /* Inlined std.Readonly<graylog2.graylog2.GraylogConfig> */
  trait ReadonlyGraylogConfig extends StObject {
    
    val bufferSize: js.UndefOr[Double] = js.undefined
    
    val deflate: js.UndefOr[GraylogDeflate] = js.undefined
    
    val facility: js.UndefOr[String] = js.undefined
    
    val hostname: js.UndefOr[String] = js.undefined
    
    val servers: js.Array[Readonlyhoststringportnum]
  }
  object ReadonlyGraylogConfig {
    
    inline def apply(servers: js.Array[Readonlyhoststringportnum]): ReadonlyGraylogConfig = {
      val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyGraylogConfig]
    }
    
    extension [Self <: ReadonlyGraylogConfig](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setDeflate(value: GraylogDeflate): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
      
      inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setServers(value: js.Array[Readonlyhoststringportnum]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersVarargs(value: Readonlyhoststringportnum*): Self = StObject.set(x, "servers", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<{  host :string,   port :number}> */
  trait Readonlyhoststringportnum extends StObject {
    
    val host: String
    
    val port: Double
  }
  object Readonlyhoststringportnum {
    
    inline def apply(host: String, port: Double): Readonlyhoststringportnum = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlyhoststringportnum]
    }
    
    extension [Self <: Readonlyhoststringportnum](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
