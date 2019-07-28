package typings.hammerjs

import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Hammer")
@js.native
class Hammer protected () extends HammerManager {
  def this(element: HTMLElement) = this()
  def this(element: SVGElement) = this()
  def this(element: HTMLElement, options: HammerOptions) = this()
  def this(element: SVGElement, options: HammerOptions) = this()
}

