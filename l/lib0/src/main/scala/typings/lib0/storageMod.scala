package typings.lib0

import typings.lib0.anon.Key
import typings.lib0.lib0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("lib0/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onChange(eventHandler: js.Function1[/* arg0 */ Key, Unit]): `true` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[`true` | Unit]
  
  @JSImport("lib0/storage", "varStorage")
  @js.native
  val varStorage: Any = js.native
}
