package typings.interceptStdout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intercept-stdout", JSImport.Namespace)
  @js.native
  def apply(stdoutIntercept: hookFunction): unhookFunction = js.native
  @JSImport("intercept-stdout", JSImport.Namespace)
  @js.native
  def apply(stdoutIntercept: hookFunction, stderrIntercept: hookFunction): unhookFunction = js.native
  
  type hookFunction = js.Function1[/* txt */ String, String | Unit]
  
  type unhookFunction = js.Function0[Unit]
}
