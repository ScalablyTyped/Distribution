package typings.hapiHoek

import typings.hapiHoek.mod.clone_.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCloneMod {
  
  inline def apply[T](obj: T): T = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](obj: T, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@hapi/hoek/lib/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
