package typings.interactjsTypes

import typings.interactjsTypes.typesMod.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNonNativeEventMod {
  
  @JSImport("@interactjs/core/isNonNativeEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`type`: String, actions: Actions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`type`.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
