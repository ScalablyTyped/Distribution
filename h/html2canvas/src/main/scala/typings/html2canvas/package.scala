package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object html2canvas {
  import typings.html2canvas.Html2CanvasNs.Html2CanvasOptions
  import typings.std.HTMLCanvasElement
  import typings.std.HTMLElement

  type Html2CanvasStatic = js.Function2[
    /* element */ HTMLElement, 
    /* options */ js.UndefOr[Html2CanvasOptions], 
    Html2CanvasPromise[HTMLCanvasElement]
  ]
}
