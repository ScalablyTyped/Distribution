package typings.graphql

import typings.graphql.typeDefinitionMod.ResponsePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String | Double
  var prev: js.UndefOr[ResponsePath] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: String | Double, prev: ResponsePath = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Anon_Key]
  }
}

