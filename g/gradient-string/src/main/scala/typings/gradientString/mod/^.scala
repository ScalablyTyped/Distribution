package typings.gradientString.mod

import typings.tinycolor2.mod.ColorInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gradient-string", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(colors: (ColorInput | PositionedColorInput)*): Gradient = js.native
  def apply(colors: js.Array[ColorInput | PositionedColorInput]): Gradient = js.native
}
