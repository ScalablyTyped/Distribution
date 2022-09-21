package typings.materialUiCore

import typings.materialUiCore.fadeFadeMod.FadeProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeMod {
  
  @JSImport("@material-ui/core/Fade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FadeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
