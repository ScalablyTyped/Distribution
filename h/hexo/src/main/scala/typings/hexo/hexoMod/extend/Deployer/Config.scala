package typings.hexo.hexoMod.extend.Deployer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ StringDictionary[js.Any] {
  val `type`: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, `type`: String = null): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Config]
  }
}

