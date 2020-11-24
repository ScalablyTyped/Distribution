package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object html2canvas {
  
  type Html2CanvasStatic = js.Function2[
    /* element */ typings.std.HTMLElement, 
    /* options */ js.UndefOr[typings.html2canvas.Html2CanvasOptions], 
    js.Promise[typings.std.HTMLCanvasElement]
  ]
}
