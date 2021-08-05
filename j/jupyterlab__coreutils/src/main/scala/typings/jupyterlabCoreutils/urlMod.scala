package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  object URLExt {
    
    @JSImport("@jupyterlab/coreutils/lib/url", "URLExt")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def encodeParts(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParts")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Test whether the url is a local url.
      *
      * #### Notes
      * This function returns `false` for any fully qualified url, including
      * `data:`, `file:`, and `//` protocol URLs.
      */
    inline def isLocal(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocal")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Join a sequence of url components and normalizes as in node `path.join`.
      *
      * @param parts - The url components.
      *
      * @returns the joined url.
      */
    inline def join(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalize(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[js.UndefOr[String]]
    /**
      * Normalize a url.
      */
    inline def normalize(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def normalize(url: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def normalize_Union(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
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
    inline def objectToQueryString(value: PartialJSONObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToQueryString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Parse a url into a URL object.
      *
      * @param urlString - The URL string to parse.
      *
      * @returns A URL object.
      */
    inline def parse(url: String): IUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[IUrl]
    
    /**
      * Return a parsed object that represents the values in a query string.
      */
    inline def queryStringToObject(value: String): StringDictionary[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryStringToObject")(value.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String]]]
    
    /**
      * The interface for a URL object
      */
    trait IUrl extends StObject {
      
      /**
        * The "fragment" portion of the URL including the leading ASCII hash
        * `(#)` character
        */
      var hash: String
      
      /**
        * The full lower-cased host portion of the URL, including the port if
        * specified.
        */
      var host: String
      
      /**
        * The lower-cased host name portion of the host component without the
        * port included.
        */
      var hostname: String
      
      /**
        * The full URL string that was parsed with both the protocol and host
        * components converted to lower-case.
        */
      var href: String
      
      /**
        * The entire path section of the URL.
        */
      var pathname: String
      
      /**
        * The numeric port portion of the host component.
        */
      var port: String
      
      /**
        * Identifies the URL's lower-cased protocol scheme.
        */
      var protocol: String
      
      /**
        * The search element, including leading question mark (`'?'`), if any,
        * of the URL.
        */
      var search: js.UndefOr[String] = js.undefined
    }
    object IUrl {
      
      inline def apply(
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
      
      extension [Self <: IUrl](x: Self) {
        
        inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
        
        inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
        
        inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      }
    }
  }
}
