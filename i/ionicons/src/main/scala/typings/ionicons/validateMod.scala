package typings.ionicons

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionicons/dist/types/icon/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  def isValid(elm: HTMLElement): Boolean = js.native
  def validateContent(): String = js.native
  def validateContent(svgContent: String): String = js.native
}

