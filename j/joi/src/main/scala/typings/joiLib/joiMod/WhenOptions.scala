package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WhenOptions extends js.Object {
  /**
       * the required condition joi type.
       */
  var is: SchemaLike
  /**
       * the alternative schema type if the condition is false. Required if then is missing
       */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  /**
       * the alternative schema type if the condition is true. Required if otherwise is missing.
       */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}

