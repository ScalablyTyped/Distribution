package typings.inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputWrapperMod {
  
  @JSImport("inferno/dist/DOM/wrappers/InputWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyValueInput(nextPropsOrEmpty: Any, dom: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyValueInput")(nextPropsOrEmpty.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inputEvents(dom: Any, nextPropsOrEmpty: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inputEvents")(dom.asInstanceOf[js.Any], nextPropsOrEmpty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isCheckedType(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
