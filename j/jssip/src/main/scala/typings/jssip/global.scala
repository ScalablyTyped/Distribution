package typings.jssip

import org.scalablytyped.runtime.StringDictionary
import typings.jssip.mod.UserAgentConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsSIP {
    
    @JSGlobal("JsSIP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("JsSIP.Message")
    @js.native
    class Message ()
      extends typings.jssip.mod.Message
    
    @JSGlobal("JsSIP.NameAddrHeader")
    @js.native
    class NameAddrHeader protected ()
      extends typings.jssip.mod.NameAddrHeader {
      def this(uri: typings.jssip.mod.URI) = this()
      def this(uri: typings.jssip.mod.URI, display_name: String) = this()
      def this(uri: typings.jssip.mod.URI, display_name: String, parameters: StringDictionary[String]) = this()
      def this(uri: typings.jssip.mod.URI, display_name: Unit, parameters: StringDictionary[String]) = this()
    }
    object NameAddrHeader {
      
      @JSGlobal("JsSIP.NameAddrHeader")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parse(nameAddrHeader: String): typings.jssip.mod.NameAddrHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(nameAddrHeader.asInstanceOf[js.Any]).asInstanceOf[typings.jssip.mod.NameAddrHeader]
    }
    
    @JSGlobal("JsSIP.RTCSession")
    @js.native
    class RTCSession ()
      extends typings.jssip.mod.RTCSession
    object RTCSession {
      
      @JSGlobal("JsSIP.RTCSession.DTMF")
      @js.native
      class DTMF ()
        extends typings.jssip.mod.RTCSession.DTMF
      
      @JSGlobal("JsSIP.RTCSession.Info")
      @js.native
      class Info ()
        extends typings.jssip.mod.RTCSession.Info
    }
    
    @JSGlobal("JsSIP.Registrator")
    @js.native
    class Registrator ()
      extends typings.jssip.mod.Registrator
    
    @JSGlobal("JsSIP.UA")
    @js.native
    class UA protected ()
      extends typings.jssip.mod.UA {
      def this(configuration: UserAgentConfiguration) = this()
    }
    
    @JSGlobal("JsSIP.URI")
    @js.native
    class URI protected ()
      extends typings.jssip.mod.URI {
      def this(scheme: String, user: String, host: String) = this()
      def this(scheme: String, user: Null, host: String) = this()
      def this(scheme: Null, user: String, host: String) = this()
      def this(scheme: Null, user: Null, host: String) = this()
      def this(scheme: String, user: String, host: String, port: Double) = this()
      def this(scheme: String, user: Null, host: String, port: Double) = this()
      def this(scheme: Null, user: String, host: String, port: Double) = this()
      def this(scheme: Null, user: Null, host: String, port: Double) = this()
      def this(scheme: String, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
      def this(scheme: String, user: String, host: String, port: Unit, parameters: StringDictionary[String]) = this()
      def this(scheme: String, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
      def this(scheme: String, user: Null, host: String, port: Unit, parameters: StringDictionary[String]) = this()
      def this(scheme: Null, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
      def this(scheme: Null, user: String, host: String, port: Unit, parameters: StringDictionary[String]) = this()
      def this(scheme: Null, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
      def this(scheme: Null, user: Null, host: String, port: Unit, parameters: StringDictionary[String]) = this()
      def this(
        scheme: String,
        user: String,
        host: String,
        port: Double,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: String,
        host: String,
        port: Double,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: String,
        host: String,
        port: Unit,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: String,
        host: String,
        port: Unit,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: Null,
        host: String,
        port: Double,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: Null,
        host: String,
        port: Double,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: Null,
        host: String,
        port: Unit,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: String,
        user: Null,
        host: String,
        port: Unit,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: String,
        host: String,
        port: Double,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: String,
        host: String,
        port: Double,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: String,
        host: String,
        port: Unit,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: String,
        host: String,
        port: Unit,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: Null,
        host: String,
        port: Double,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: Null,
        host: String,
        port: Double,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: Null,
        host: String,
        port: Unit,
        parameters: StringDictionary[String],
        headers: StringDictionary[String]
      ) = this()
      def this(
        scheme: Null,
        user: Null,
        host: String,
        port: Unit,
        parameters: Unit,
        headers: StringDictionary[String]
      ) = this()
    }
    object URI {
      
      @JSGlobal("JsSIP.URI")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parse(uri: String): typings.jssip.mod.URI = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.jssip.mod.URI]
    }
    
    @JSGlobal("JsSIP.WebSocketInterface")
    @js.native
    class WebSocketInterface protected ()
      extends typings.jssip.mod.WebSocketInterface {
      def this(url: String) = this()
    }
    
    inline def debug(namespace: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("JsSIP.name")
    @js.native
    val name: String = js.native
    
    @JSGlobal("JsSIP.version")
    @js.native
    val version: String = js.native
  }
}
