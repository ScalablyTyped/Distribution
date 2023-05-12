package typings.hapiHoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAssertMod {
  
  inline def apply(
    condition: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def apply(condition: Any, error: js.Error): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  @JSImport("@hapi/hoek/lib/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
