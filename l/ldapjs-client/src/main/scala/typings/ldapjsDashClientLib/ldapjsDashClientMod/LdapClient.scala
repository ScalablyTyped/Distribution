package typings
package ldapjsDashClientLib.ldapjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LdapClient extends js.Object {
  /**
    * Adds an entry to the LDAP server.
    */
  def add(dn: java.lang.String, entry: js.Object): js.Promise[_]
  /**
    * Performs a simple authentication against the server.
    */
  def bind(dn: java.lang.String, password: java.lang.String): js.Promise[_]
  /**
    * Deletes an entry from the LDAP server.
    */
  def del(dn: java.lang.String): js.Promise[_]
  /**
    * Disconnect from the LDAP server and do not allow reconnection.
    *
    * If the client is instantiated with proper reconnection options, it's
    * possible to initiate new requests after a call to unbind since the client
    * will attempt to reconnect in order to fulfill the request.
    *
    * Calling destroy will prevent any further reconnection from occurring.
    */
  def destroy(): js.Promise[scala.Unit]
  /**
    * Performs an LDAP modify against the server.
    *
    * @param dn the DN of the entry to modify.
    * @param change update to perform (can be [Change]).
    */
  def modify(dn: java.lang.String, change: Change): js.Promise[_]
  /**
    * Performs an LDAP modifyDN against the server.
    */
  def modifyDN(dn: java.lang.String, newName: java.lang.String): js.Promise[_]
  /**
    * Performs an LDAP search against the server.
    *
    * Note that the defaults for options are a 'base' search.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def search(base: java.lang.String, options: SearchOptions): js.Promise[js.Array[_]]
  /**
    * Unbinds this client from the LDAP server.
    *
    */
  def unbind(): js.Promise[_]
}

object LdapClient {
  @scala.inline
  def apply(
    add: (java.lang.String, js.Object) => js.Promise[_],
    bind: (java.lang.String, java.lang.String) => js.Promise[_],
    del: java.lang.String => js.Promise[_],
    destroy: () => js.Promise[scala.Unit],
    modify: (java.lang.String, Change) => js.Promise[_],
    modifyDN: (java.lang.String, java.lang.String) => js.Promise[_],
    search: (java.lang.String, SearchOptions) => js.Promise[js.Array[_]],
    unbind: () => js.Promise[_]
  ): LdapClient = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bind = js.Any.fromFunction2(bind), del = js.Any.fromFunction1(del), destroy = js.Any.fromFunction0(destroy), modify = js.Any.fromFunction2(modify), modifyDN = js.Any.fromFunction2(modifyDN), search = js.Any.fromFunction2(search), unbind = js.Any.fromFunction0(unbind))
  
    __obj.asInstanceOf[LdapClient]
  }
}

