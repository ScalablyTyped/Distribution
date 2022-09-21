package typings.materialUiCore

import typings.materialUiCore.slideSlideMod.SlideProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideMod {
  
  @JSImport("@material-ui/core/Slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
