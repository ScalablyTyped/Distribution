package typings
package atIonicCliDashFrameworkLib.utilsObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/object", "AliasedMap")
@js.native
class AliasedMap[K, V] ()
  extends lodashLib.lodashMod.Global.Map[AliasedMapKey | K, AliasedMapKey | V] {
  def getAliases(): lodashLib.lodashMod.Global.Map[AliasedMapKey, js.Array[AliasedMapKey]] = js.native
  def keysWithoutAliases(): js.Array[K] = js.native
  def resolveAlias(key: K): js.UndefOr[V] = js.native
  def resolveAlias(key: AliasedMapKey): js.UndefOr[V] = js.native
}

