package typings.httpProxy

import typings.node.querystringMod.ParsedUrlQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<node.url.Url> */
  trait PartialUrl extends StObject {
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var hash: js.UndefOr[String | Null] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var pathname: js.UndefOr[String | Null] = js.undefined
    
    var port: js.UndefOr[String | Null] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQuery] = js.undefined
    
    var search: js.UndefOr[String | Null] = js.undefined
    
    var slashes: js.UndefOr[Boolean | Null] = js.undefined
  }
  object PartialUrl {
    
    @scala.inline
    def apply(): PartialUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUrl]
    }
    
    @scala.inline
    implicit class PartialUrlMutableBuilder[Self <: PartialUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
      
      @scala.inline
      def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
}
