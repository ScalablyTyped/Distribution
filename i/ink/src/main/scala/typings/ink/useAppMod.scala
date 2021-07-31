package typings.ink

import typings.ink.appContextMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAppMod {
  
  @JSImport("ink/build/hooks/use-app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Props]
}
