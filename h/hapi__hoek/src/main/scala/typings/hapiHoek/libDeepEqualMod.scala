package typings.hapiHoek

import typings.hapiHoek.mod.deepEqual.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDeepEqualMod {
  
  inline def apply(obj: Any, ref: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(obj: Any, ref: Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@hapi/hoek/lib/deepEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
