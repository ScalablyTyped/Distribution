package typings.grammarkdown.typedObjectsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructureHint
  extends /* key */ StringDictionary[TypeObject[TypeHint, TypeOfTypeHint[TypeHint]]]
     with TypeHint

object StructureHint {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[TypeObject[TypeHint, TypeOfTypeHint[TypeHint]]] = null
  ): StructureHint = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StructureHint]
  }
}

