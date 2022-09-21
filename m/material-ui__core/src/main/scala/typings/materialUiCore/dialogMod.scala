package typings.materialUiCore

import typings.materialUiCore.dialogDialogMod.DialogProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@material-ui/core/Dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
