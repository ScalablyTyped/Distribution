package typings
package hexoLib.hexoMod.HexoNs.extendNs.DeployerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  val `type`: js.UndefOr[java.lang.String]
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `type`: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Config]
  }
}

