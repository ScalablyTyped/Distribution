package typings.materialUiCore

import typings.materialUiCore.anon.PartialwithThemeboolean
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClassesMod {
  
  @JSImport("@material-ui/core/test-utils/getClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](element: ReactElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def default[T](element: ReactElement, options: PartialwithThemeboolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
