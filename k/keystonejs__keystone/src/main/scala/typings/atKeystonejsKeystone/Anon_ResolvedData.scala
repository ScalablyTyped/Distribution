package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.KeyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResolvedData[FieldNames /* <: String */] extends js.Object {
  var resolvedData: KeyValues[FieldNames, _]
}

object Anon_ResolvedData {
  @scala.inline
  def apply[FieldNames /* <: String */](resolvedData: KeyValues[FieldNames, _]): Anon_ResolvedData[FieldNames] = {
    val __obj = js.Dynamic.literal(resolvedData = resolvedData)
  
    __obj.asInstanceOf[Anon_ResolvedData[FieldNames]]
  }
}

