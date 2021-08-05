package typings.materialUiLab

import typings.materialUiLab.ratingRatingMod.RatingProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingMod {
  
  @JSImport("@material-ui/lab/Rating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
