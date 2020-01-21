package typings.ldapjsClient.mod

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
  override def add(dn: String, entry: js.Object): js.Promise[_] = js.native
  /**
    * Performs a simple authentication against the server.
    */
  /* CompleteClass */
  override def bind(dn: String, password: String): js.Promise[_] = js.native
  /**
    * Deletes an entry from the LDAP server.
    */
  /* CompleteClass */
  override def del(dn: String): js.Promise[_] = js.native
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
  override def modify(dn: String, change: Change): js.Promise[_] = js.native
  /**
    * Performs an LDAP modifyDN against the server.
    */
  /* CompleteClass */
  override def modifyDN(dn: String, newName: String): js.Promise[_] = js.native
  /**
    * Performs an LDAP search against the server.
    *
    * Note that the defaults for options are a 'base' search.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  /* CompleteClass */
  override def search(base: String, options: SearchOptions): js.Promise[js.Array[_]] = js.native
  /**
    * Unbinds this client from the LDAP server.
    *
    */
  /* CompleteClass */
  override def unbind(): js.Promise[_] = js.native
}

