package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object execMod {
  
  @JSImport("locutus/php/exec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeshellarg(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeshellarg")().asInstanceOf[js.Any]
  inline def escapeshellarg(arg: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeshellarg")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
