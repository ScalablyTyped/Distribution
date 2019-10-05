package typings.atJupyterlabCodemirror.libModeMod.Mode

import org.scalablytyped.runtime.StringDictionary
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
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
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMode]
  }
}

