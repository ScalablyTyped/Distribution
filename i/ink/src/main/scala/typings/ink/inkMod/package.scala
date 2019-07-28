package typings.ink

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkMod {
  type InkComponent[P /* <: Record[String, _] */] = (ComponentClass[P, js.Any, js.Any]) | (StatelessComponent[P, js.Any])
  type InkNode = (js.Array[InkElement | String | Double | Null]) | InkElement | String | Double | Null
}
