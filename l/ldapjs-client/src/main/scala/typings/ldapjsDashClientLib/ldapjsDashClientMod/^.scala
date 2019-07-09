package typings
package ldapjsDashClientLib.ldapjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs-client", JSImport.Namespace)
@js.native
class ^ protected () extends LdapClient {
  def this(options: ClientOptions) = this()
  /**
    * Adds an entry to the LDAP server.
    */
  /* CompleteClass */
  override def add(dn: java.lang.String, entry: js.Object): js.Promise[_] = js.native
  /**
    * Performs a simple authentication against the server.
    */
  /* CompleteClass */
  override def bind(dn: java.lang.String, password: java.lang.String): js.Promise[_] = js.native
  /**
    * Deletes an entry from the LDAP server.
    */
  /* CompleteClass */
  override def del(dn: java.lang.String): js.Promise[_] = js.native
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
  override def destroy(): js.Promise[scala.Unit] = js.native
  /**
    * Performs an LDAP modify against the server.
    *
    * @param dn the DN of the entry to modify.
    * @param change update to perform (can be [Change]).
    */
  /* CompleteClass */
  override def modify(dn: java.lang.String, change: Change): js.Promise[_] = js.native
  /**
    * Performs an LDAP modifyDN against the server.
    */
  /* CompleteClass */
  override def modifyDN(dn: java.lang.String, newName: java.lang.String): js.Promise[_] = js.native
  /**
    * Performs an LDAP search against the server.
    *
    * Note that the defaults for options are a 'base' search.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  /* CompleteClass */
  override def search(base: java.lang.String, options: SearchOptions): js.Promise[js.Array[_]] = js.native
  /**
    * Unbinds this client from the LDAP server.
    *
    */
  /* CompleteClass */
  override def unbind(): js.Promise[_] = js.native
}

