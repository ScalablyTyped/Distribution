package typings.knockoutPreRendered.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex extends /* index */ NumberDictionary[Node] {
  var length: Double
}

object Dictindex {
  @scala.inline
  def apply(length: Double, NumberDictionary: /* index */ NumberDictionary[Node] = null): Dictindex = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Dictindex]
  }
}

