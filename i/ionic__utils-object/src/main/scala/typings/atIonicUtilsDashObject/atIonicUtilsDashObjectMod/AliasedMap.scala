package typings.atIonicUtilsDashObject.atIonicUtilsDashObjectMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-object", "AliasedMap")
@js.native
class AliasedMap[K, V] () extends Map[AliasedMapKey | K, AliasedMapKey | V] {
  def getAliases(): Map[AliasedMapKey, js.Array[AliasedMapKey]] = js.native
  def keysWithoutAliases(): js.Array[K] = js.native
  def resolveAlias(key: K): js.UndefOr[V] = js.native
  def resolveAlias(key: AliasedMapKey): js.UndefOr[V] = js.native
}

