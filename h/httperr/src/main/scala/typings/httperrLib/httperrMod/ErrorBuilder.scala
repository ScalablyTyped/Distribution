package typings
package httperrLib.httperrMod

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
org.scalablytyped.runtime.Instantiable0[HttpError]
     with /**
     *  Creates an Error object. The new keyword is optional.
     * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
     *                                           If config is an Error object, it will be treated as config.cause.
     */
org.scalablytyped.runtime.Instantiable1[
      (/* config */ Config) | (/* config */ stdLib.Error) | (/* config */ java.lang.String), 
      HttpError
    ] {
  /**
       *  Creates an Error object. The new keyword is optional.
       * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
       *                                           If config is an Error object, it will be treated as config.cause.
       */
  def apply(): HttpError = js.native
  /**
       *  Creates an Error object. The new keyword is optional.
       * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
       *                                           If config is an Error object, it will be treated as config.cause.
       */
  def apply(config: Config): HttpError = js.native
  /**
       *  Creates an Error object. The new keyword is optional.
       * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
       *                                           If config is an Error object, it will be treated as config.cause.
       */
  def apply(config: java.lang.String): HttpError = js.native
  /**
       *  Creates an Error object. The new keyword is optional.
       * @param {string | Error | Config} config - If config is a string, it will be treated as config.message.
       *                                           If config is an Error object, it will be treated as config.cause.
       */
  def apply(config: stdLib.Error): HttpError = js.native
}

