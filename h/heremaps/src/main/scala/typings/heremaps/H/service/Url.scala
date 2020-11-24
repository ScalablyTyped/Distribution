package typings.heremaps.H.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a URL giving access to the individual parts that make up a URL,such as the scheme, host/domain, path, etc. Use the static parse method to populate a new URL object
  * from a URL string. Be aware that URLs with user and password like "ftp://user:password@foo.bar/" are not supported!
  */
@js.native
trait Url extends js.Object {
  
  /**
    * This function adds a sub-domain to the host of this URL object.
    * @param subDomain {string} - the sub domain (non-empty string) to be added
    * @returns {H.service.Url} - this URL object
    */
  def addSubDomain(subDomain: String): Url = js.native
  
  /**
    * This function adds a sub-path to this URL's path
    * @param subPath {string} - the path to be added
    * @returns {H.service.Url} - this URL object
    */
  def addSubPath(subPath: String): Url = js.native
  
  /**
    * This function returns the anchor of this Url object.
    * @returns {(string | undefined)} - the anchor
    */
  def getAnchor(): String | Unit = js.native
  
  /**
    * This function returns the host name of this Url object.
    * @returns {string} - the host (for example 'api.here.com')
    */
  def getHost(): String = js.native
  
  /**
    * This function returns the path part of this Url object.
    * @returns {(string | undefined)} - the path (for example 'myresources/resource.html')
    */
  def getPath(): String | Unit = js.native
  
  /**
    * This function returns the query object of this Url object.
    * @returns {Object} - the query object
    */
  def getQuery(): js.Object = js.native
  
  /**
    * This function returns the scheme of this Url object.
    * @returns {string} - the scheme (for example 'http')
    */
  def getScheme(): String = js.native
  
  /**
    * This function returns a boolean value indicating whether there are any query string parameter associated with this URL.
    * @returns {boolean} - true if there are parameters, false if none are present
    */
  def hasQuery(): Boolean = js.native
  
  /**
    * This function merges the provided parameters into this URL's existing parameters. Key-value pairs which are defined in the argument and this URL's parameters will be overwritten.
    * Key-value pairs which are defined in the argument and are not defined in this URL's parameters will be added. Prototype properties and function properties will not be merged.
    * @param other {Object} - the parmeters to be merged into this URL's query string parameters
    * @returns {H.service.Url} - this URL object
    */
  def mergeQuery(other: js.Object): Url = js.native
  
  /**
    * This function sets the anchor of this URL object.
    * @param anchor {(string | boolean | undefined)} - the new anchor or undefined to clear the anchor
    * @returns {H.service.Url} - this URL object
    */
  def setAnchor(): Url = js.native
  def setAnchor(anchor: String): Url = js.native
  def setAnchor(anchor: Boolean): Url = js.native
  
  /**
    * This function sets the host of this URL object.
    * @param host {string} - the new host
    * @returns {H.service.Url} - this URL object
    */
  def setHost(host: String): Url = js.native
  
  /**
    * This function sets the path of this URL object.
    * @param path {(string | undefined)} - the new path or a boolean to clear the path
    * @returns {H.service.Url} - this URL object
    */
  def setPath(path: String): Url = js.native
  def setPath(path: Boolean): Url = js.native
  
  /**
    * This function sets the specified parameters for this URL object. Keys in this object, which are associated with undefined values will be treated as query string parameters
    * with no value.
    * @param params {(Object | undefined)} - a hash of query string parameters specifying the parameters to be set.or a boolean to clear the parameters.
    * @returns {H.service.Url} - this URL object
    */
  def setQuery(): Url = js.native
  def setQuery(params: js.Object): Url = js.native
  def setQuery(params: Boolean): Url = js.native
  
  /**
    * This function sets the scheme of this URL object.
    * @param scheme {string} - the new scheme
    * @returns {H.service.Url} - this URL object
    */
  def setScheme(scheme: String): Url = js.native
}
