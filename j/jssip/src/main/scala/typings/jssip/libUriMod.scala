package typings.jssip

import typings.jssip.jssipStrings.sip
import typings.jssip.libGrammarMod.Grammar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUriMod {
  
  @JSImport("jssip/lib/URI", "URI")
  @js.native
  open class URI protected () extends StObject {
    def this(scheme: URIScheme, user: String, host: String) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double, parameters: Parameters) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Unit, parameters: Parameters) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double, parameters: Unit, headers: Headers) = this()
    def this(
      scheme: URIScheme,
      user: String,
      host: String,
      port: Double,
      parameters: Parameters,
      headers: Headers
    ) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Unit, parameters: Unit, headers: Headers) = this()
    def this(
      scheme: URIScheme,
      user: String,
      host: String,
      port: Unit,
      parameters: Parameters,
      headers: Headers
    ) = this()
    
    def clearHeaders(): Unit = js.native
    
    def clearParams(): Unit = js.native
    
    def deleteHeader(key: String): Unit = js.native
    
    def deleteParam(key: String): Unit = js.native
    
    def getHeader(key: String): js.Array[String] = js.native
    
    def getParam[T](key: String): T = js.native
    
    def hasHeader(key: String): Boolean = js.native
    
    def hasParam(key: String): Boolean = js.native
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var scheme: URIScheme = js.native
    
    def setHeader(key: String, value: String): Unit = js.native
    def setHeader(key: String, value: js.Array[String]): Unit = js.native
    
    def setParam(key: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    
    def toAor(): String = js.native
    
    var user: String = js.native
  }
  /* static members */
  object URI {
    
    @JSImport("jssip/lib/URI", "URI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(uri: String): js.UndefOr[Grammar] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Grammar]]
  }
  
  type Headers = Record[String, String | js.Array[String]]
  
  type Parameters = Record[String, String | Null]
  
  type URIScheme = sip | String
}
