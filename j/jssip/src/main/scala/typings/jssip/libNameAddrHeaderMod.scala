package typings.jssip

import typings.jssip.libGrammarMod.Grammar
import typings.jssip.libUriMod.Parameters
import typings.jssip.libUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNameAddrHeaderMod {
  
  @JSImport("jssip/lib/NameAddrHeader", "NameAddrHeader")
  @js.native
  open class NameAddrHeader protected () extends StObject {
    def this(uri: URI) = this()
    def this(uri: URI, display_name: String) = this()
    def this(uri: URI, display_name: String, parameters: Parameters) = this()
    def this(uri: URI, display_name: Unit, parameters: Parameters) = this()
    
    def clearParams(): Unit = js.native
    
    def deleteParam(key: String): Unit = js.native
    
    def display_name: String = js.native
    def display_name_=(value: String): Unit = js.native
    
    def getParam[T](key: String): T = js.native
    
    def hasParam(key: String): Boolean = js.native
    
    def setParam(key: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    
    def uri: URI = js.native
  }
  /* static members */
  object NameAddrHeader {
    
    @JSImport("jssip/lib/NameAddrHeader", "NameAddrHeader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(uri: String): js.UndefOr[Grammar] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Grammar]]
  }
}
