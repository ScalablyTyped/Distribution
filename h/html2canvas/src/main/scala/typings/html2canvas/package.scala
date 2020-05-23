package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object html2canvas {
  type Html2CanvasStatic = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* options */ js.UndefOr[typings.html2canvas.Html2Canvas.Html2CanvasOptions], 
    typings.html2canvas.Html2CanvasPromise[typings.std.HTMLCanvasElement]
  ]
}
