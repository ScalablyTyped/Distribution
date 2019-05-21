package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePath extends js.Object {
  val key: java.lang.String | scala.Double
  val prev: js.UndefOr[ResponsePath] = js.undefined
}

object ResponsePath {
  @scala.inline
  def apply(key: java.lang.String | scala.Double, prev: ResponsePath = null): ResponsePath = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[ResponsePath]
  }
}

