package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Json {
  /**
    * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
    */
  type StringifyReplacer = js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, js.Any]) | (js.Array[String | Double])
  ]
  /**
    * Any value greater than 10 is truncated.
    */
  type StringifySpace = Double | String
}
