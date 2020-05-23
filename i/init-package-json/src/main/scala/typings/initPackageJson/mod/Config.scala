package typings.initPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ StringDictionary[js.Any] {
  def get(k: String): js.Any
}

object Config {
  @scala.inline
  def apply(get: String => js.Any, StringDictionary: /* name */ StringDictionary[js.Any] = null): Config = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Config]
  }
}

