package typings.ldapjsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LdapClient extends js.Object {
  
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
  implicit class LdapClientOps[Self <: LdapClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (String, js.Object) => js.Promise[_]): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBind(value: (String, String) => js.Promise[_]): Self = this.set("bind", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDel(value: String => js.Promise[_]): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => js.Promise[Unit]): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModify(value: (String, Change) => js.Promise[_]): Self = this.set("modify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModifyDN(value: (String, String) => js.Promise[_]): Self = this.set("modifyDN", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearch(value: (String, SearchOptions) => js.Promise[js.Array[_]]): Self = this.set("search", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbind(value: () => js.Promise[_]): Self = this.set("unbind", js.Any.fromFunction0(value))
  }
}
