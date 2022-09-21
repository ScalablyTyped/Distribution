package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("@lumino/coreutils/types/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fallbackRandomValues(buffer: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fallbackRandomValues")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
