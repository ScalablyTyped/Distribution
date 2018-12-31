package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkElement extends js.Object {
  var _children: js.Array[InkNode]
  var _props: js.Any
  var component: InkComponent[_]
  var instance: (Component[_, _, _]) | scala.Null
  def ref(ref: js.Any): scala.Unit
}

