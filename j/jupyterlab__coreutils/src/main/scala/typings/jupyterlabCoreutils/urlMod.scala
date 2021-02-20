package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  object URLExt {
    
    /**
      * Encode the components of a multi-segment url.
      *
      * @param url - The url to encode.
      *
      * @returns the encoded url.
      *
      * #### Notes
      * Preserves the `'/'` separators.
      * Should not include the base url, since all parts are escaped.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.encodeParts")
    @js.native
    def encodeParts(url: String): String = js.native
    
    /**
      * Test whether the url is a local url.
      *
      * #### Notes
      * This function returns `false` for any fully qualified url, including
      * `data:`, `file:`, and `//` protocol URLs.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.isLocal")
    @js.native
    def isLocal(url: String): Boolean = js.native
    
    /**
      * Join a sequence of url components and normalizes as in node `path.join`.
      *
      * @param parts - The url components.
      *
      * @returns the joined url.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.join")
    @js.native
    def join(parts: String*): String = js.native
    
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.normalize")
    @js.native
    def normalize(): js.UndefOr[String] = js.native
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.normalize")
    @js.native
    def normalize(url: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    /**
      * Normalize a url.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.normalize")
    @js.native
    def normalize(url: String): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.normalize")
    @js.native
    def normalize_Union(url: String): js.UndefOr[String] = js.native
    
    /**
      * Return a serialized object string suitable for a query.
      *
      * @param object - The source object.
      *
      * @returns an encoded url query.
      *
      * #### Notes
      * Modified version of [stackoverflow](http://stackoverflow.com/a/30707423).
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.objectToQueryString")
    @js.native
    def objectToQueryString(value: PartialJSONObject): String = js.native
    
    /**
      * Parse a url into a URL object.
      *
      * @param urlString - The URL string to parse.
      *
      * @returns A URL object.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.parse")
    @js.native
    def parse(url: String): IUrl = js.native
    
    /**
      * Return a parsed object that represents the values in a query string.
      */
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt.queryStringToObject")
    @js.native
    def queryStringToObject(value: String): StringDictionary[js.UndefOr[String]] = js.native
    
    /**
      * The interface for a URL object
      */
    @js.native
    trait IUrl extends StObject {
      
      /**
        * The "fragment" portion of the URL including the leading ASCII hash
        * `(#)` character
        */
      var hash: String = js.native
      
      /**
        * The full lower-cased host portion of the URL, including the port if
        * specified.
        */
      var host: String = js.native
      
      /**
        * The lower-cased host name portion of the host component without the
        * port included.
        */
      var hostname: String = js.native
      
      /**
        * The full URL string that was parsed with both the protocol and host
        * components converted to lower-case.
        */
      var href: String = js.native
      
      /**
        * The entire path section of the URL.
        */
      var pathname: String = js.native
      
      /**
        * The numeric port portion of the host component.
        */
      var port: String = js.native
      
      /**
        * Identifies the URL's lower-cased protocol scheme.
        */
      var protocol: String = js.native
      
      /**
        * The search element, including leading question mark (`'?'`), if any,
        * of the URL.
        */
      var search: js.UndefOr[String] = js.native
    }
    object IUrl {
      
      @scala.inline
      def apply(
        hash: String,
        host: String,
        hostname: String,
        href: String,
        pathname: String,
        port: String,
        protocol: String
      ): IUrl = {
        val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
        __obj.asInstanceOf[IUrl]
      }
      
      @scala.inline
      implicit class IUrlMutableBuilder[Self <: IUrl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      }
    }
  }
}
