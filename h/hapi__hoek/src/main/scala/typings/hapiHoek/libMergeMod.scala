package typings.hapiHoek

import typings.hapiHoek.mod.merge.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMergeMod {
  
  inline def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  inline def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2, options: Options): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  
  @JSImport("@hapi/hoek/lib/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
