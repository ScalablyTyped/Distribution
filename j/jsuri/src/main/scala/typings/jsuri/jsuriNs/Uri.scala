package typings.jsuri.jsuriNs

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
  def this(str: String) = this()
  /**
    * adds a query parameter
    * @param  {string}  key        add values for key
    * @param  {string}  val        value to add
    * @param  {integer} [index]    specific index to add the value at
    * @return {Uri}                returns self for fluent chaining
    */
  def addQueryParam(key: String, `val`: Primitive): typings.jsuri.jsuriNs.Uri = js.native
  def addQueryParam(key: String, `val`: Primitive, index: Double): typings.jsuri.jsuriNs.Uri = js.native
  /**
    * Adds a trailing slash to the path
    */
  def addTrailingSlash(): typings.jsuri.jsuriNs.Uri = js.native
  def anchor(): String = js.native
  def anchor(`val`: String): String = js.native
  /**
    * removes query parameters
    * @param  {string} key     remove values for key
    * @param  {val}    [val]   remove a specific value, otherwise removes all
    * @return {Uri}            returns self for fluent chaining
    */
  def deleteQueryParam(key: String): typings.jsuri.jsuriNs.Uri = js.native
  def deleteQueryParam(key: String, `val`: String): typings.jsuri.jsuriNs.Uri = js.native
  /**
    * returns the first query param value found for the key
    * @param  {string} key query key
    * @return {string}     first value found for key
    */
  def getQueryParamValue(key: String): String = js.native
  /**
    * returns an array of query param values for the key
    * @param  {string} key query key
    * @return {array}      array of values
    */
  def getQueryParamValues(key: String): js.Array[String] = js.native
  /**
    * if there is no protocol, the leading // can be enabled or disabled
    * @param  {Boolean}  val
    * @return {Boolean}
    */
  def hasAuthorityPrefix(): Boolean = js.native
  def hasAuthorityPrefix(`val`: Boolean): Boolean = js.native
  /**
    * test for the existence of a query parameter
    * @param  {string}  key        check values for key
    * @return {Boolean}            true if key exists, otherwise false
    */
  def hasQueryParam(key: String): Boolean = js.native
  def host(): String = js.native
  def host(`val`: String): String = js.native
  def isColonUri(): Boolean = js.native
  def isColonUri(`val`: Boolean): Boolean = js.native
  /**
    * Same as Mozilla nsIURI.prePath
    * @return {string} scheme://user:password@host:port
    * @see  https://developer.mozilla.org/en/nsIURI
    */
  def origin(): String = js.native
  def path(): String = js.native
  def path(`val`: String): String = js.native
  def port(): Double = js.native
  def port(`val`: Double): Double = js.native
  /**
    * Define getter/setter methods
    */
  def protocol(): String = js.native
  def protocol(`val`: String): String = js.native
  /**
    * Serializes the internal state of the query pairs
    * @param  {string} [val]   set a new query string
    * @return {string}         query string
    */
  def query(): String = js.native
  def query(`val`: String): String = js.native
  /**
    * replaces query param values
    * @param  {string} key         key to replace value for
    * @param  {string} newVal      new value
    * @param  {string} [oldVal]    replace only one specific value (otherwise replaces all)
    * @return {Uri}                returns self for fluent chaining
    */
  def replaceQueryParam(key: String, newVal: Primitive): typings.jsuri.jsuriNs.Uri = js.native
  def replaceQueryParam(key: String, newVal: Primitive, oldVal: Primitive): typings.jsuri.jsuriNs.Uri = js.native
  /**
    * Scheme name, colon and doubleslash, as required
    * @return {string} http:// or possibly just //
    */
  def scheme(): String = js.native
  def setAnchor(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def setHasAuthorityPrefix(`val`: Boolean): typings.jsuri.jsuriNs.Uri = js.native
  def setHost(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def setIsColonUri(`val`: Boolean): typings.jsuri.jsuriNs.Uri = js.native
  def setPath(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def setPort(`val`: Double): typings.jsuri.jsuriNs.Uri = js.native
  /**
    * Define fluent setter methods (setProtocol, setHasAuthorityPrefix, etc)
    */
  def setProtocol(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def setQuery(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def setUserInfo(`val`: String): typings.jsuri.jsuriNs.Uri = js.native
  def userInfo(): String = js.native
  def userInfo(`val`: String): String = js.native
}

