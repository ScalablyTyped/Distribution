package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents a URL giving access to the individual parts that make up a URL,such as the scheme, host/domain, path, etc. Use the static parse method to populate a new URL object
         * from a URL string. Be aware that URLs with user and password like "ftp://user:password@foo.bar/" are not supported!
         */
@JSGlobal("H.service.Url")
@js.native
class Url protected () extends js.Object {
  /**
               * Constructor
               * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
               * @param host {string} - the host (or domain) part of the URL
               * @param opt_path {string=} - the path following the host pointing to a resource
               * @param opt_params {Object=} - the query string parameters of this URL
               * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
               * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
               */
  def this(scheme: java.lang.String, host: java.lang.String) = this()
  /**
               * Constructor
               * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
               * @param host {string} - the host (or domain) part of the URL
               * @param opt_path {string=} - the path following the host pointing to a resource
               * @param opt_params {Object=} - the query string parameters of this URL
               * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
               * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
               */
  def this(scheme: java.lang.String, host: java.lang.String, opt_path: java.lang.String) = this()
  /**
               * Constructor
               * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
               * @param host {string} - the host (or domain) part of the URL
               * @param opt_path {string=} - the path following the host pointing to a resource
               * @param opt_params {Object=} - the query string parameters of this URL
               * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
               * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
               */
  def this(scheme: java.lang.String, host: java.lang.String, opt_path: java.lang.String, opt_params: js.Object) = this()
  /**
               * Constructor
               * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
               * @param host {string} - the host (or domain) part of the URL
               * @param opt_path {string=} - the path following the host pointing to a resource
               * @param opt_params {Object=} - the query string parameters of this URL
               * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
               * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
               */
  def this(scheme: java.lang.String, host: java.lang.String, opt_path: java.lang.String, opt_params: js.Object, opt_port: scala.Double) = this()
  /**
               * Constructor
               * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
               * @param host {string} - the host (or domain) part of the URL
               * @param opt_path {string=} - the path following the host pointing to a resource
               * @param opt_params {Object=} - the query string parameters of this URL
               * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
               * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
               */
  def this(scheme: java.lang.String, host: java.lang.String, opt_path: java.lang.String, opt_params: js.Object, opt_port: scala.Double, opt_anchor: java.lang.String) = this()
  /**
               * This function adds a sub-domain to the host of this URL object.
               * @param subDomain {string} - the sub domain (non-empty string) to be added
               * @returns {H.service.Url} - this URL object
               */
  def addSubDomain(subDomain: java.lang.String): Url = js.native
  /**
               * This function adds a sub-path to this URL's path
               * @param subPath {string} - the path to be added
               * @returns {H.service.Url} - this URL object
               */
  def addSubPath(subPath: java.lang.String): Url = js.native
  /**
               * This function returns the anchor of this Url object.
               * @returns {(string | undefined)} - the anchor
               */
  def getAnchor(): java.lang.String | scala.Unit = js.native
  /**
               * This function returns the host name of this Url object.
               * @returns {string} - the host (for example 'api.here.com')
               */
  def getHost(): java.lang.String = js.native
  /**
               * This function returns the path part of this Url object.
               * @returns {(string | undefined)} - the path (for example 'myresources/resource.html')
               */
  def getPath(): java.lang.String | scala.Unit = js.native
  /**
               * This function returns the query object of this Url object.
               * @returns {Object} - the query object
               */
  def getQuery(): js.Object = js.native
  /**
               * This function returns the scheme of this Url object.
               * @returns {string} - the scheme (for example 'http')
               */
  def getScheme(): java.lang.String = js.native
  /**
               * This function returns a boolean value indicating whether there are any query string parameter associated with this URL.
               * @returns {boolean} - true if there are parameters, false if none are present
               */
  def hasQuery(): scala.Boolean = js.native
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
  /**
               * This function sets the anchor of this URL object.
               * @param anchor {(string | boolean | undefined)} - the new anchor or undefined to clear the anchor
               * @returns {H.service.Url} - this URL object
               */
  def setAnchor(anchor: java.lang.String): Url = js.native
  /**
               * This function sets the anchor of this URL object.
               * @param anchor {(string | boolean | undefined)} - the new anchor or undefined to clear the anchor
               * @returns {H.service.Url} - this URL object
               */
  def setAnchor(anchor: scala.Boolean): Url = js.native
  /**
               * This function sets the host of this URL object.
               * @param host {string} - the new host
               * @returns {H.service.Url} - this URL object
               */
  def setHost(host: java.lang.String): Url = js.native
  /**
               * This function sets the path of this URL object.
               * @param path {(string | undefined)} - the new path or a boolean to clear the path
               * @returns {H.service.Url} - this URL object
               */
  def setPath(path: java.lang.String): Url = js.native
  /**
               * This function sets the path of this URL object.
               * @param path {(string | undefined)} - the new path or a boolean to clear the path
               * @returns {H.service.Url} - this URL object
               */
  def setPath(path: scala.Boolean): Url = js.native
  /**
               * This function sets the specified parameters for this URL object. Keys in this object, which are associated with undefined values will be treated as query string parameters
               * with no value.
               * @param params {(Object | undefined)} - a hash of query string parameters specifying the parameters to be set.or a boolean to clear the parameters.
               * @returns {H.service.Url} - this URL object
               */
  def setQuery(): Url = js.native
  /**
               * This function sets the specified parameters for this URL object. Keys in this object, which are associated with undefined values will be treated as query string parameters
               * with no value.
               * @param params {(Object | undefined)} - a hash of query string parameters specifying the parameters to be set.or a boolean to clear the parameters.
               * @returns {H.service.Url} - this URL object
               */
  def setQuery(params: js.Object): Url = js.native
  /**
               * This function sets the specified parameters for this URL object. Keys in this object, which are associated with undefined values will be treated as query string parameters
               * with no value.
               * @param params {(Object | undefined)} - a hash of query string parameters specifying the parameters to be set.or a boolean to clear the parameters.
               * @returns {H.service.Url} - this URL object
               */
  def setQuery(params: scala.Boolean): Url = js.native
  /**
               * This function sets the scheme of this URL object.
               * @param scheme {string} - the new scheme
               * @returns {H.service.Url} - this URL object
               */
  def setScheme(scheme: java.lang.String): Url = js.native
}

/**
         * This class represents a URL giving access to the individual parts that make up a URL,such as the scheme, host/domain, path, etc. Use the static parse method to populate a new URL object
         * from a URL string. Be aware that URLs with user and password like "ftp://user:password@foo.bar/" are not supported!
         */
@JSGlobal("H.service.Url")
@js.native
object Url extends js.Object {
  /**
               * This function parses a URL string and returns a H.service.Url object. The URL string must contain at least a scheme and a host.
               * @param url {string} - The URL string to parse.
               * @param opt_baseURL {string=} - The base URL to use to resolve relative URLs. If ommited the base URL of the document which loaded the API is taken.
               * @returns {H.service.Url} - the parsed URL object
               */
  def parse(url: java.lang.String): heremapsLib.HNs.serviceNs.Url = js.native
  /**
               * This function parses a URL string and returns a H.service.Url object. The URL string must contain at least a scheme and a host.
               * @param url {string} - The URL string to parse.
               * @param opt_baseURL {string=} - The base URL to use to resolve relative URLs. If ommited the base URL of the document which loaded the API is taken.
               * @returns {H.service.Url} - the parsed URL object
               */
  def parse(url: java.lang.String, opt_baseURL: java.lang.String): heremapsLib.HNs.serviceNs.Url = js.native
}

