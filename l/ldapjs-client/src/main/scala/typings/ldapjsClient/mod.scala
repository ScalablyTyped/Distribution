package typings.ldapjsClient

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjsClient.ldapjsClientStrings.add
import typings.ldapjsClient.ldapjsClientStrings.delete
import typings.ldapjsClient.ldapjsClientStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldapjs-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends LdapClient {
    def this(options: ClientOptions) = this()
  }
  
  @js.native
  trait Change extends StObject {
    
    var modification: StringDictionary[js.Any] = js.native
    
    var operation: add | delete | replace = js.native
  }
  object Change {
    
    @scala.inline
    def apply(modification: StringDictionary[js.Any], operation: add | delete | replace): Change = {
      val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    @scala.inline
    implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModification(value: StringDictionary[js.Any]): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: add | delete | replace): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
    
    var tlsOptions: js.UndefOr[js.Object] = js.native
    
    var url: String = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(url: String): ClientOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTlsOptions(value: js.Object): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LdapClient extends StObject {
    
    /**
      * Adds an entry to the LDAP server.
      */
    def add(dn: String, entry: js.Object): js.Promise[_] = js.native
    
    /**
      * Performs a simple authentication against the server.
      */
    def bind(dn: String, password: String): js.Promise[_] = js.native
    
    /**
      * Deletes an entry from the LDAP server.
      */
    def del(dn: String): js.Promise[_] = js.native
    
    /**
      * Disconnect from the LDAP server and do not allow reconnection.
      *
      * If the client is instantiated with proper reconnection options, it's
      * possible to initiate new requests after a call to unbind since the client
      * will attempt to reconnect in order to fulfill the request.
      *
      * Calling destroy will prevent any further reconnection from occurring.
      */
    def destroy(): js.Promise[Unit] = js.native
    
    /**
      * Performs an LDAP modify against the server.
      *
      * @param dn the DN of the entry to modify.
      * @param change update to perform (can be [Change]).
      */
    def modify(dn: String, change: Change): js.Promise[_] = js.native
    
    /**
      * Performs an LDAP modifyDN against the server.
      */
    def modifyDN(dn: String, newName: String): js.Promise[_] = js.native
    
    /**
      * Performs an LDAP search against the server.
      *
      * Note that the defaults for options are a 'base' search.
      */
    def search(base: String, options: SearchOptions): js.Promise[js.Array[_]] = js.native
    
    /**
      * Unbinds this client from the LDAP server.
      *
      */
    def unbind(): js.Promise[_] = js.native
  }
  object LdapClient {
    
    @scala.inline
    def apply(
      add: (String, js.Object) => js.Promise[_],
      bind: (String, String) => js.Promise[_],
      del: String => js.Promise[_],
      destroy: () => js.Promise[Unit],
      modify: (String, Change) => js.Promise[_],
      modifyDN: (String, String) => js.Promise[_],
      search: (String, SearchOptions) => js.Promise[js.Array[_]],
      unbind: () => js.Promise[_]
    ): LdapClient = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bind = js.Any.fromFunction2(bind), del = js.Any.fromFunction1(del), destroy = js.Any.fromFunction0(destroy), modify = js.Any.fromFunction2(modify), modifyDN = js.Any.fromFunction2(modifyDN), search = js.Any.fromFunction2(search), unbind = js.Any.fromFunction0(unbind))
      __obj.asInstanceOf[LdapClient]
    }
    
    @scala.inline
    implicit class LdapClientMutableBuilder[Self <: LdapClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, js.Object) => js.Promise[_]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBind(value: (String, String) => js.Promise[_]): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDel(value: String => js.Promise[_]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => js.Promise[Unit]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModify(value: (String, Change) => js.Promise[_]): Self = StObject.set(x, "modify", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModifyDN(value: (String, String) => js.Promise[_]): Self = StObject.set(x, "modifyDN", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearch(value: (String, SearchOptions) => js.Promise[js.Array[_]]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnbind(value: () => js.Promise[_]): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SearchOptions extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var sizeLimit: js.UndefOr[Double] = js.native
    
    var timeLimit: js.UndefOr[Double] = js.native
    
    var typesOnly: js.UndefOr[Boolean] = js.native
  }
  object SearchOptions {
    
    @scala.inline
    def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
      
      @scala.inline
      def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      @scala.inline
      def setTypesOnly(value: Boolean): Self = StObject.set(x, "typesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesOnlyUndefined: Self = StObject.set(x, "typesOnly", js.undefined)
    }
  }
}
