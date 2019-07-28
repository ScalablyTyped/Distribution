package typings.hammerjs.hammerjsMod

import org.scalablytyped.runtime.TopLevel
import typings.hammerjs.HammerManager
import typings.hammerjs.HammerOptions
import typings.hammerjs.HammerStatic
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hammerjs", JSImport.Namespace)
@js.native
class ^ protected () extends HammerManager {
  def this(element: HTMLElement) = this()
  def this(element: SVGElement) = this()
  def this(element: HTMLElement, options: HammerOptions) = this()
  def this(element: SVGElement, options: HammerOptions) = this()
}

@JSImport("hammerjs", JSImport.Namespace)
@js.native
object ^ extends TopLevel[HammerStatic]

