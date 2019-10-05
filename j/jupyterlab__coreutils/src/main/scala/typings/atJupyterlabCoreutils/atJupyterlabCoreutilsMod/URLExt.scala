package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCoreutils.libUrlMod.URLExt.IUrl
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "URLExt")
@js.native
object URLExt extends js.Object {
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
  def encodeParts(url: String): String = js.native
  /**
    * Test whether the url is a local url.
    *
    * #### Notes
    * This function returns `false` for any fully qualified url, including
    * `data:`, `file:`, and `//` protocol URLs.
    */
  def isLocal(url: String): Boolean = js.native
  /**
    * Join a sequence of url components and normalizes as in node `path.join`.
    *
    * @param parts - The url components.
    *
    * @returns the joined url.
    */
  def join(parts: String*): String = js.native
  /**
    * Normalize a url.
    */
  def normalize(url: String): String = js.native
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
  def objectToQueryString(value: JSONObject): String = js.native
  /**
    * Parse a url into a URL object.
    *
    * @param urlString - The URL string to parse.
    *
    * @returns A URL object.
    */
  def parse(url: String): IUrl = js.native
  /**
    * Return a parsed object that represents the values in a query string.
    */
  def queryStringToObject(value: String): StringDictionary[String] = js.native
}

