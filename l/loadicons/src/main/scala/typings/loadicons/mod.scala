package typings.loadicons

import typings.std.Error
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadicons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Load SVG icon sprites safely and asynchronously
    */
  def apply(svgURL: String, callback: Callback): Unit = js.native
  type Callback = js.Function2[/* error */ Error | Null, /* svg */ SVGElement, Unit]
}

