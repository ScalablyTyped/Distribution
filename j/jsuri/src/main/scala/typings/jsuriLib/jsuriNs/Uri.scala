package typings
package jsuriLib.jsuriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsuri.Uri")
@js.native
/**
  * Creates a new Uri object
  * @constructor
  * @param {string} str
  */
class Uri () extends js.Object {
  def this(str: java.lang.String) = this()
  /**
    * adds a query parameter
    * @param  {string}  key        add values for key
    * @param  {string}  val        value to add
    * @param  {integer} [index]    specific index to add the value at
    * @return {Uri}                returns self for fluent chaining
    */
  def addQueryParam(key: java.lang.String, `val`: Primitive): Uri = js.native
  def addQueryParam(key: java.lang.String, `val`: Primitive, index: scala.Double): Uri = js.native
  /**
    * Adds a trailing slash to the path
    */
  def addTrailingSlash(): Uri = js.native
  def anchor(): java.lang.String = js.native
  def anchor(`val`: java.lang.String): java.lang.String = js.native
  /**
    * removes query parameters
    * @param  {string} key     remove values for key
    * @param  {val}    [val]   remove a specific value, otherwise removes all
    * @return {Uri}            returns self for fluent chaining
    */
  def deleteQueryParam(key: java.lang.String): Uri = js.native
  def deleteQueryParam(key: java.lang.String, `val`: java.lang.String): Uri = js.native
  /**
    * returns the first query param value found for the key
    * @param  {string} key query key
    * @return {string}     first value found for key
    */
  def getQueryParamValue(key: java.lang.String): java.lang.String = js.native
  /**
    * returns an array of query param values for the key
    * @param  {string} key query key
    * @return {array}      array of values
    */
  def getQueryParamValues(key: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * if there is no protocol, the leading // can be enabled or disabled
    * @param  {Boolean}  val
    * @return {Boolean}
    */
  def hasAuthorityPrefix(): scala.Boolean = js.native
  def hasAuthorityPrefix(`val`: scala.Boolean): scala.Boolean = js.native
  /**
    * test for the existence of a query parameter
    * @param  {string}  key        check values for key
    * @return {Boolean}            true if key exists, otherwise false
    */
  def hasQueryParam(key: java.lang.String): scala.Boolean = js.native
  def host(): java.lang.String = js.native
  def host(`val`: java.lang.String): java.lang.String = js.native
  def isColonUri(): scala.Boolean = js.native
  def isColonUri(`val`: scala.Boolean): scala.Boolean = js.native
  /**
    * Same as Mozilla nsIURI.prePath
    * @return {string} scheme://user:password@host:port
    * @see  https://developer.mozilla.org/en/nsIURI
    */
  def origin(): java.lang.String = js.native
  def path(): java.lang.String = js.native
  def path(`val`: java.lang.String): java.lang.String = js.native
  def port(): scala.Double = js.native
  def port(`val`: scala.Double): scala.Double = js.native
  /**
    * Define getter/setter methods
    */
  def protocol(): java.lang.String = js.native
  def protocol(`val`: java.lang.String): java.lang.String = js.native
  /**
    * Serializes the internal state of the query pairs
    * @param  {string} [val]   set a new query string
    * @return {string}         query string
    */
  def query(): java.lang.String = js.native
  def query(`val`: java.lang.String): java.lang.String = js.native
  /**
    * replaces query param values
    * @param  {string} key         key to replace value for
    * @param  {string} newVal      new value
    * @param  {string} [oldVal]    replace only one specific value (otherwise replaces all)
    * @return {Uri}                returns self for fluent chaining
    */
  def replaceQueryParam(key: java.lang.String, newVal: Primitive): Uri = js.native
  def replaceQueryParam(key: java.lang.String, newVal: Primitive, oldVal: Primitive): Uri = js.native
  /**
    * Scheme name, colon and doubleslash, as required
    * @return {string} http:// or possibly just //
    */
  def scheme(): java.lang.String = js.native
  def setAnchor(`val`: java.lang.String): Uri = js.native
  def setHasAuthorityPrefix(`val`: scala.Boolean): Uri = js.native
  def setHost(`val`: java.lang.String): Uri = js.native
  def setIsColonUri(`val`: scala.Boolean): Uri = js.native
  def setPath(`val`: java.lang.String): Uri = js.native
  def setPort(`val`: scala.Double): Uri = js.native
  /**
    * Define fluent setter methods (setProtocol, setHasAuthorityPrefix, etc)
    */
  def setProtocol(`val`: java.lang.String): Uri = js.native
  def setQuery(`val`: java.lang.String): Uri = js.native
  def setUserInfo(`val`: java.lang.String): Uri = js.native
  def userInfo(): java.lang.String = js.native
  def userInfo(`val`: java.lang.String): java.lang.String = js.native
}

