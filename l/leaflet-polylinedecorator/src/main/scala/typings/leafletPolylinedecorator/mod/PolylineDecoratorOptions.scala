package typings.leafletPolylinedecorator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineDecoratorOptions extends js.Object {
  var patterns: js.Array[Pattern]
}

object PolylineDecoratorOptions {
  @scala.inline
  def apply(patterns: js.Array[Pattern]): PolylineDecoratorOptions = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineDecoratorOptions]
  }
}

