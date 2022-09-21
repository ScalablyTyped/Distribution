package typings.isoUrl

import typings.node.urlMod.UrlObject
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlBrowserMod {
  
  @JSImport("iso-url/dist/src/url-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("iso-url/dist/src/url-browser", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends StObject
       with typings.std.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: Record[String, String]) = this()
    def this(init: typings.std.URLSearchParams) = this()
  }
  object URLSearchParams {
    
    @JSImport("iso-url/dist/src/url-browser", "URLSearchParams")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  }
  
  @JSImport("iso-url/dist/src/url-browser", "URLWithLegacySupport")
  @js.native
  open class URLWithLegacySupport () extends StObject {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: Unit, base: String) = this()
    
    var auth: String | Null = js.native
    
    def format(): String = js.native
    
    def hash: String = js.native
    def hash_=(arg: String): Unit = js.native
    
    def host: String = js.native
    def host_=(arg: String): Unit = js.native
    
    def hostname: String = js.native
    def hostname_=(arg: String): Unit = js.native
    
    def href: String = js.native
    def href_=(arg: String): Unit = js.native
    
    def origin: String = js.native
    
    def password: String = js.native
    def password_=(arg: String): Unit = js.native
    
    var path: String = js.native
    
    def pathname: String = js.native
    def pathname_=(arg: String): Unit = js.native
    
    def port: String = js.native
    def port_=(arg: String): Unit = js.native
    
    def protocol: String = js.native
    def protocol_=(arg: String): Unit = js.native
    
    var query: String | Null = js.native
    
    def search: String = js.native
    
    def searchParams: typings.std.URLSearchParams = js.native
    
    def search_=(arg: String): Unit = js.native
    
    var `super`: URL = js.native
    
    def toJSON(): String = js.native
    
    def username: String = js.native
    def username_=(arg: String): Unit = js.native
  }
  /* static members */
  object URLWithLegacySupport {
    
    @JSImport("iso-url/dist/src/url-browser", "URLWithLegacySupport")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {any} o
      */
    inline def createObjectURL(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(o.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * @param {string} o
      */
    inline def revokeObjectURL(o: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("iso-url/dist/src/url-browser", "defaultBase")
  @js.native
  val defaultBase: String = js.native
  
  inline def format(obj: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def format(obj: UrlObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
