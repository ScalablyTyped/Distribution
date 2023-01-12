package typings.ldapjsClient

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjsClient.ldapjsClientStrings.add
import typings.ldapjsClient.ldapjsClientStrings.delete
import typings.ldapjsClient.ldapjsClientStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldapjs-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LdapClient {
    def this(options: ClientOptions) = this()
    
    /**
      * Adds an entry to the LDAP server.
      */
    /* CompleteClass */
    override def add(dn: String, entry: js.Object): js.Promise[Any] = js.native
    
    /**
      * Performs a simple authentication against the server.
      */
    /* CompleteClass */
    override def bind(dn: String, password: String): js.Promise[Any] = js.native
    
    /**
      * Deletes an entry from the LDAP server.
      */
    /* CompleteClass */
    override def del(dn: String): js.Promise[Any] = js.native
    
    /**
      * Disconnect from the LDAP server and do not allow reconnection.
      *
      * If the client is instantiated with proper reconnection options, it's
      * possible to initiate new requests after a call to unbind since the client
      * will attempt to reconnect in order to fulfill the request.
      *
      * Calling destroy will prevent any further reconnection from occurring.
      */
    /* CompleteClass */
    override def destroy(): js.Promise[Unit] = js.native
    
    /**
      * Performs an LDAP modify against the server.
      *
      * @param dn the DN of the entry to modify.
      * @param change update to perform (can be [Change]).
      */
    /* CompleteClass */
    override def modify(dn: String, change: Change): js.Promise[Any] = js.native
    
    /**
      * Performs an LDAP modifyDN against the server.
      */
    /* CompleteClass */
    override def modifyDN(dn: String, newName: String): js.Promise[Any] = js.native
    
    /**
      * Performs an LDAP search against the server.
      *
      * Note that the defaults for options are a 'base' search.
      */
    /* CompleteClass */
    override def search(base: String, options: SearchOptions): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Unbinds this client from the LDAP server.
      *
      */
    /* CompleteClass */
    override def unbind(): js.Promise[Any] = js.native
  }
  
  trait Change extends StObject {
    
    var modification: StringDictionary[Any]
    
    var operation: add | delete | replace
  }
  object Change {
    
    inline def apply(modification: StringDictionary[Any], operation: add | delete | replace): Change = {
      val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
      
      inline def setModification(value: StringDictionary[Any]): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: add | delete | replace): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tlsOptions: js.UndefOr[js.Object] = js.undefined
    
    var url: String
  }
  object ClientOptions {
    
    inline def apply(url: String): ClientOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTlsOptions(value: js.Object): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait LdapClient extends StObject {
    
    /**
      * Adds an entry to the LDAP server.
      */
    def add(dn: String, entry: js.Object): js.Promise[Any]
    
    /**
      * Performs a simple authentication against the server.
      */
    def bind(dn: String, password: String): js.Promise[Any]
    
    /**
      * Deletes an entry from the LDAP server.
      */
    def del(dn: String): js.Promise[Any]
    
    /**
      * Disconnect from the LDAP server and do not allow reconnection.
      *
      * If the client is instantiated with proper reconnection options, it's
      * possible to initiate new requests after a call to unbind since the client
      * will attempt to reconnect in order to fulfill the request.
      *
      * Calling destroy will prevent any further reconnection from occurring.
      */
    def destroy(): js.Promise[Unit]
    
    /**
      * Performs an LDAP modify against the server.
      *
      * @param dn the DN of the entry to modify.
      * @param change update to perform (can be [Change]).
      */
    def modify(dn: String, change: Change): js.Promise[Any]
    
    /**
      * Performs an LDAP modifyDN against the server.
      */
    def modifyDN(dn: String, newName: String): js.Promise[Any]
    
    /**
      * Performs an LDAP search against the server.
      *
      * Note that the defaults for options are a 'base' search.
      */
    def search(base: String, options: SearchOptions): js.Promise[js.Array[Any]]
    
    /**
      * Unbinds this client from the LDAP server.
      *
      */
    def unbind(): js.Promise[Any]
  }
  object LdapClient {
    
    inline def apply(
      add: (String, js.Object) => js.Promise[Any],
      bind: (String, String) => js.Promise[Any],
      del: String => js.Promise[Any],
      destroy: () => js.Promise[Unit],
      modify: (String, Change) => js.Promise[Any],
      modifyDN: (String, String) => js.Promise[Any],
      search: (String, SearchOptions) => js.Promise[js.Array[Any]],
      unbind: () => js.Promise[Any]
    ): LdapClient = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bind = js.Any.fromFunction2(bind), del = js.Any.fromFunction1(del), destroy = js.Any.fromFunction0(destroy), modify = js.Any.fromFunction2(modify), modifyDN = js.Any.fromFunction2(modifyDN), search = js.Any.fromFunction2(search), unbind = js.Any.fromFunction0(unbind))
      __obj.asInstanceOf[LdapClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LdapClient] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (String, js.Object) => js.Promise[Any]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setBind(value: (String, String) => js.Promise[Any]): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      inline def setDel(value: String => js.Promise[Any]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setModify(value: (String, Change) => js.Promise[Any]): Self = StObject.set(x, "modify", js.Any.fromFunction2(value))
      
      inline def setModifyDN(value: (String, String) => js.Promise[Any]): Self = StObject.set(x, "modifyDN", js.Any.fromFunction2(value))
      
      inline def setSearch(value: (String, SearchOptions) => js.Promise[js.Array[Any]]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      inline def setUnbind(value: () => js.Promise[Any]): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    }
  }
  
  trait SearchOptions extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var sizeLimit: js.UndefOr[Double] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    var typesOnly: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setTypesOnly(value: Boolean): Self = StObject.set(x, "typesOnly", value.asInstanceOf[js.Any])
      
      inline def setTypesOnlyUndefined: Self = StObject.set(x, "typesOnly", js.undefined)
    }
  }
}
