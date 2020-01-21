package typings.jupyterlabCodemirror.modeMod.Mode

import org.scalablytyped.runtime.StringDictionary
import typings.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface of a codemirror mode spec.
  */
trait IMode extends /* key */ StringDictionary[JSONValue] {
  var name: String
}

object IMode {
  @scala.inline
  def apply(name: String, StringDictionary: /* key */ StringDictionary[JSONValue] = null): IMode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMode]
  }
}

