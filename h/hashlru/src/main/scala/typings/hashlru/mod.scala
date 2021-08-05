package typings.hashlru

import typings.hashlru.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hashlru", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(max: Double): Clear = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(max.asInstanceOf[js.Any]).asInstanceOf[Clear]
}
