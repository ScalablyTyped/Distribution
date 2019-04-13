package typings
package lilDashUriLib.lilDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to URI component values and parser/builder functions.
  */
@js.native
trait URI extends js.Object {
  /**
    * Gets the auth value
    */
  def auth(): Credentials = js.native
  /**
    * Sets the auth
    * @param auth the auth
    * @return this object
    */
  def auth(auth: java.lang.String): URI = js.native
  /**
    * Builds URI components into a URI string
    */
  def build(): java.lang.String = js.native
  /**
    * Gets the hash value
    */
  def hash(): java.lang.String = js.native
  /**
    * Sets the hash
    * @param hash the hash
    * @return this object
    */
  def hash(hash: java.lang.String): URI = js.native
  /**
    * Gets the host value
    */
  def host(): java.lang.String = js.native
  /**
    * Sets the host
    * @param host the host
    * @return this object
    */
  def host(host: java.lang.String): URI = js.native
  /**
    * Gets the hostname value
    */
  def hostname(): java.lang.String = js.native
  /**
    * Sets the hostname
    * @param hostname the hostname
    * @return this object
    */
  def hostname(hostname: java.lang.String): URI = js.native
  /**
    * Parses the given URI string
    * @param uri the URI to parse
    */
  def parse(uri: java.lang.String): URIParts = js.native
  /**
    * Gets the password value
    */
  def password(): java.lang.String = js.native
  /**
    * Sets the password
    * @param password the password
    * @return this object
    */
  def password(password: java.lang.String): URI = js.native
  /**
    * Gets the path value
    */
  def path(): java.lang.String = js.native
  /**
    * Sets the path
    * @param path the path
    * @return this object
    */
  def path(path: java.lang.String): URI = js.native
  /**
    * Gets the port value
    */
  def port(): scala.Double = js.native
  /**
    * Sets the port
    * @param port the port
    * @return this object
    */
  def port(port: java.lang.String): URI = js.native
  /**
    * Gets the protocol value
    */
  def protocol(): java.lang.String = js.native
  /**
    * Sets the protocol
    * @param protocol the protocol
    * @return this object
    */
  def protocol(protocol: java.lang.String): URI = js.native
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
  def search(): java.lang.String = js.native
  /**
    * Sets the search
    * @param search the search
    * @return this object
    */
  def search(search: java.lang.String): URI = js.native
  /**
    * Gets the user value
    */
  def user(): java.lang.String = js.native
  /**
    * Sets the user
    * @param user the user
    * @return this object
    */
  def user(user: java.lang.String): URI = js.native
}

