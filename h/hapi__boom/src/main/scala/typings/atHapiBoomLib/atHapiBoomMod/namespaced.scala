package typings
package atHapiBoomLib.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
@JSImport("@hapi/boom", JSImport.Namespace)
@js.native
/** Creates a new Boom object using the provided message and then calling boomify() to decorate the error with the Boom properties. */
class namespaced[Data] () extends Boom[Data] {
  def this(message: java.lang.String) = this()
  def this(message: stdLib.Error) = this()
  def this(message: java.lang.String, options: atHapiBoomLib.atHapiBoomMod.BoomNs.Options[Data]) = this()
  def this(message: stdLib.Error, options: atHapiBoomLib.atHapiBoomMod.BoomNs.Options[Data]) = this()
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  /* CompleteClass */
  override var data: Data = js.native
  /** isBoom - if true, indicates this is a Boom object instance. */
  /* CompleteClass */
  override var isBoom: scala.Boolean = js.native
  /** isServer - convenience bool indicating status code >= 500. */
  /* CompleteClass */
  override var isServer: scala.Boolean = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  /* CompleteClass */
  override var output: atHapiBoomLib.atHapiBoomMod.BoomNs.Output = js.native
  /** reformat() - rebuilds error.output using the other object properties. */
  /* CompleteClass */
  override def reformat(): java.lang.String = js.native
}

