package typings.interceptStdout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stdoutIntercept: hookFunction): unhookFunction = ^.asInstanceOf[js.Dynamic].apply(stdoutIntercept.asInstanceOf[js.Any]).asInstanceOf[unhookFunction]
  inline def apply(stdoutIntercept: hookFunction, stderrIntercept: hookFunction): unhookFunction = (^.asInstanceOf[js.Dynamic].apply(stdoutIntercept.asInstanceOf[js.Any], stderrIntercept.asInstanceOf[js.Any])).asInstanceOf[unhookFunction]
  
  @JSImport("intercept-stdout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type hookFunction = js.Function1[/* txt */ String, String | Unit]
  
  type unhookFunction = js.Function0[Unit]
}
