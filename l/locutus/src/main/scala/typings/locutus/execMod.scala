package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object execMod {
  
  @JSImport("locutus/php/exec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeshellarg(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeshellarg")().asInstanceOf[Any]
  inline def escapeshellarg(arg: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeshellarg")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
}
