package typings.ink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inkMod {
  import typings.std.Record

  type InkComponent[P /* <: Record[String, _] */] = (ComponentClass[P, js.Any, js.Any]) | (StatelessComponent[P, js.Any])
  type InkNode = (js.Array[InkElement | String | Double | Null]) | InkElement | String | Double | Null
}
