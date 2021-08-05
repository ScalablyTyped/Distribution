package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorPOJO
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toJsonMod {
  
  @JSImport("@jsdevtools/ono/esm/to-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDeepKeys(obj: js.Object): Set[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Set[String | js.Symbol]]
  inline def getDeepKeys(obj: js.Object, omit: js.Array[String | js.Symbol]): Set[String | js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepKeys")(obj.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[Set[String | js.Symbol]]
  
  inline def toJSON(): ErrorPOJO = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[ErrorPOJO]
  
  inline def toJSON_Intersection(): ErrorPOJO & Error = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[ErrorPOJO & Error]
}
