package typings.luminoCoreutils.jsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialJSONObject
  extends /* key */ StringDictionary[js.UndefOr[PartialJSONValue]]
     with _PartialJSONValue
object PartialJSONObject {
  
  @scala.inline
  def apply(): PartialJSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJSONObject]
  }
}
