package typings.infernoCompat

import typings.inferno.typesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidElementMod {
  
  @JSImport("inferno-compat/dist/isValidElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidElement(obj: VNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
