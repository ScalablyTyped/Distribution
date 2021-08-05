package typings.lilUri

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parses the given URI string
    *
    * @param the URI string to parse.
    */
  inline def apply(): URI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[URI]
  inline def apply(uri: String): URI = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[URI]
  
  @JSImport("lil-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Credentials map
    */
  trait Credentials extends StObject {
    
    var password: String
    
    var user: String
  }
  object Credentials {
    
    inline def apply(password: String, user: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Map of query string keys and values
    */
  type QueryString = StringDictionary[String | js.Array[String]]
  
  /**
    * Provides access to URI component values and parser/builder functions.
    */
  @js.native
  trait URI extends StObject {
    
    /**
      * Gets the auth value
      */
    def auth(): Credentials = js.native
    /**
      * Sets the auth
      * @param auth the auth
      * @return this object
      */
    def auth(auth: String): URI = js.native
    
    /**
      * Builds URI components into a URI string
      */
    def build(): String = js.native
    
    /**
      * Gets the hash value
      */
    def hash(): String = js.native
    /**
      * Sets the hash
      * @param hash the hash
      * @return this object
      */
    def hash(hash: String): URI = js.native
    
    /**
      * Gets the host value
      */
    def host(): String = js.native
    /**
      * Sets the host
      * @param host the host
      * @return this object
      */
    def host(host: String): URI = js.native
    
    /**
      * Gets the hostname value
      */
    def hostname(): String = js.native
    /**
      * Sets the hostname
      * @param hostname the hostname
      * @return this object
      */
    def hostname(hostname: String): URI = js.native
    
    /**
      * Parses the given URI string
      * @param uri the URI to parse
      */
    def parse(uri: String): URIParts = js.native
    
    /**
      * Gets the password value
      */
    def password(): String = js.native
    /**
      * Sets the password
      * @param password the password
      * @return this object
      */
    def password(password: String): URI = js.native
    
    /**
      * Gets the path value
      */
    def path(): String = js.native
    /**
      * Sets the path
      * @param path the path
      * @return this object
      */
    def path(path: String): URI = js.native
    
    /**
      * Gets the port value
      */
    def port(): Double = js.native
    /**
      * Sets the port
      * @param port the port
      * @return this object
      */
    def port(port: String): URI = js.native
    
    /**
      * Gets the protocol value
      */
    def protocol(): String = js.native
    /**
      * Sets the protocol
      * @param protocol the protocol
      * @return this object
      */
    def protocol(protocol: String): URI = js.native
    
    /**
      * Gets the query value
      */
    def query(): QueryString = js.native
    /**
      * Sets the query
      * @param query the query
      * @return this object
      */
    def query(query: QueryString): URI = js.native
    
    /**
      * Gets the search value
      */
    def search(): String = js.native
    /**
      * Sets the search
      * @param search the search
      * @return this object
      */
    def search(search: String): URI = js.native
    
    /**
      * Gets the user value
      */
    def user(): String = js.native
    /**
      * Sets the user
      * @param user the user
      * @return this object
      */
    def user(user: String): URI = js.native
  }
  
  /**
    * URI parts
    */
  trait URIParts extends StObject {
    
    var auth: String
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var password: String
    
    var path: String
    
    var port: String
    
    var protocol: String
    
    var query: QueryString
    
    var search: String
    
    var uri: String
    
    var user: String
  }
  object URIParts {
    
    inline def apply(
      auth: String,
      hash: String,
      host: String,
      hostname: String,
      password: String,
      path: String,
      port: String,
      protocol: String,
      query: QueryString,
      search: String,
      uri: String,
      user: String
    ): URIParts = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[URIParts]
    }
    
    extension [Self <: URIParts](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
