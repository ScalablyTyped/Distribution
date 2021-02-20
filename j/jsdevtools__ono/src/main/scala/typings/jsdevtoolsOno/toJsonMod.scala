package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorPOJO
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toJsonMod {
  
  @JSImport("@jsdevtools/ono/esm/to-json", "getDeepKeys")
  @js.native
  def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = js.native
  @JSImport("@jsdevtools/ono/esm/to-json", "getDeepKeys")
  @js.native
  def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = js.native
  
  @JSImport("@jsdevtools/ono/esm/to-json", "toJSON")
  @js.native
  def toJSON(): ErrorPOJO = js.native
  @JSImport("@jsdevtools/ono/esm/to-json", "toJSON")
  @js.native
  def toJSON_Intersection(): ErrorPOJO with Error = js.native
}
