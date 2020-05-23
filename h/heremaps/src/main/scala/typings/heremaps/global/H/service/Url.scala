package typings.heremaps.global.H.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a URL giving access to the individual parts that make up a URL,such as the scheme, host/domain, path, etc. Use the static parse method to populate a new URL object
  * from a URL string. Be aware that URLs with user and password like "ftp://user:password@foo.bar/" are not supported!
  */
@JSGlobal("H.service.Url")
@js.native
class Url protected ()
  extends typings.heremaps.H.service.Url {
  /**
    * Constructor
    * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
    * @param host {string} - the host (or domain) part of the URL
    * @param opt_path {string=} - the path following the host pointing to a resource
    * @param opt_params {Object=} - the query string parameters of this URL
    * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
    * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
    */
  def this(scheme: String, host: String) = this()
  def this(scheme: String, host: String, opt_path: String) = this()
  def this(scheme: String, host: String, opt_path: String, opt_params: js.Object) = this()
  def this(scheme: String, host: String, opt_path: String, opt_params: js.Object, opt_port: Double) = this()
  def this(
    scheme: String,
    host: String,
    opt_path: String,
    opt_params: js.Object,
    opt_port: Double,
    opt_anchor: String
  ) = this()
}

/* static members */
@JSGlobal("H.service.Url")
@js.native
object Url extends js.Object {
  /**
    * This function parses a URL string and returns a H.service.Url object. The URL string must contain at least a scheme and a host.
    * @param url {string} - The URL string to parse.
    * @param opt_baseURL {string=} - The base URL to use to resolve relative URLs. If ommited the base URL of the document which loaded the API is taken.
    * @returns {H.service.Url} - the parsed URL object
    */
  def parse(url: String): typings.heremaps.H.service.Url = js.native
  def parse(url: String, opt_baseURL: String): typings.heremaps.H.service.Url = js.native
}

