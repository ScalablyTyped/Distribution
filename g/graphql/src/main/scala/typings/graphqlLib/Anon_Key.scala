package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String | scala.Double
  var prev: js.UndefOr[graphqlLib.typeDefinitionMod.ResponsePath]
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String | scala.Double, prev: graphqlLib.typeDefinitionMod.ResponsePath = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Anon_Key]
  }
}

