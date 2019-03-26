package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Hammer")
@js.native
class Hammer protected () extends HammerManager {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.SVGElement) = this()
  def this(element: stdLib.HTMLElement, options: HammerOptions) = this()
  def this(element: stdLib.SVGElement, options: HammerOptions) = this()
}

