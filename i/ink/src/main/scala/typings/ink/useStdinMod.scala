package typings.ink

import typings.ink.stdinContextMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStdinMod {
  
  @JSImport("ink/build/hooks/use-stdin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Props]
}
