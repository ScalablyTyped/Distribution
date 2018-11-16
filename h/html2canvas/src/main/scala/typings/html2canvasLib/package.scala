package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object html2canvasLib {
  type Html2CanvasStatic = js.Function2[
    /* element */ stdLib.HTMLElement, 
    /* options */ js.UndefOr[html2canvasLib.Html2CanvasNs.Html2CanvasOptions], 
    Html2CanvasPromise[stdLib.HTMLCanvasElement]
  ]
}
