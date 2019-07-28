package typings.httperr.httperrMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Factory function for creating an Error object. */
@js.native
trait ErrorBuilder
  extends /**
  *  Creates an Error object. The new keyword is optional.
  * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
  *                                           If config is an Error object, it will be treated as config.cause.
  */
Instantiable0[HttpError]
     with Instantiable1[(/* config */ Config) | (/* config */ Error) | (/* config */ String), HttpError] {
  /**
    *  Creates an Error object. The new keyword is optional.
    * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
    *                                           If config is an Error object, it will be treated as config.cause.
    */
  def apply(): HttpError = js.native
  def apply(config: String): HttpError = js.native
  def apply(config: Config): HttpError = js.native
  def apply(config: Error): HttpError = js.native
}

