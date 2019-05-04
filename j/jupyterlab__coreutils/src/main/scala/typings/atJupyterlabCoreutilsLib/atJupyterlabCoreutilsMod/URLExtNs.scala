package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "URLExt")
@js.native
object URLExtNs extends js.Object {
  /**
    * Encode the components of a multi-segment url.
    *
    * @param url - The url to encode.
    *
    * @returns the encoded url.
    *
    * #### Notes
    * Preserves the `'/'` separators.
    * Should not include the base url, since all parts are escaped.
    */
  def encodeParts(url: java.lang.String): java.lang.String = js.native
  /**
    * Test whether the url is a local url.
    *
    * #### Notes
    * This function returns `false` for any fully qualified url, including
    * `data:`, `file:`, and `//` protocol URLs.
    */
  def isLocal(url: java.lang.String): scala.Boolean = js.native
  /**
    * Join a sequence of url components and normalizes as in node `path.join`.
    *
    * @param parts - The url components.
    *
    * @returns the joined url.
    */
  def join(parts: java.lang.String*): java.lang.String = js.native
  /**
    * Normalize a url.
    */
  def normalize(url: java.lang.String): java.lang.String = js.native
  /**
    * Return a serialized object string suitable for a query.
    *
    * @param object - The source object.
    *
    * @returns an encoded url query.
    *
    * #### Notes
    * Modified version of [stackoverflow](http://stackoverflow.com/a/30707423).
    */
  def objectToQueryString(value: atPhosphorCoreutilsLib.libJsonMod.JSONObject): java.lang.String = js.native
  /**
    * Parse a url into a URL object.
    *
    * @param urlString - The URL string to parse.
    *
    * @returns A URL object.
    */
  def parse(url: java.lang.String): atJupyterlabCoreutilsLib.libUrlMod.URLExtNs.IUrl = js.native
  /**
    * Return a parsed object that represents the values in a query string.
    */
  def queryStringToObject(value: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

