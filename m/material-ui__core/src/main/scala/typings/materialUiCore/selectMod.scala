package typings.materialUiCore

import typings.materialUiCore.selectSelectMod.SelectProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@material-ui/core/Select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
