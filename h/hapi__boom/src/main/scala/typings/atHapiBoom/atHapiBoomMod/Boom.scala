package typings.atHapiBoom.atHapiBoomMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
@js.native
trait Boom[Data] extends Error {
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  var data: Data = js.native
  /** isBoom - if true, indicates this is a Boom object instance. */
  var isBoom: Boolean = js.native
  /**
    * "If message is unset, the 'error' segment of the header will not be present and
    * isMissing will be true on the error object." mentioned in
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  var isMissing: js.UndefOr[Boolean] = js.native
  /** isServer - convenience bool indicating status code >= 500. */
  var isServer: Boolean = js.native
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  var output: Output = js.native
  /** reformat() - rebuilds error.output using the other object properties. */
  def reformat(): String = js.native
  def reformat(debug: Boolean): String = js.native
}

