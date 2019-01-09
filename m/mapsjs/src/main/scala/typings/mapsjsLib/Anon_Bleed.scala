package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bleed extends js.Object {
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ stdLib.HTMLElement, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      /* contextSize */ scala.Double, 
      /* bleed */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var renderGeometry: js.UndefOr[
    js.Function2[
      /* shape */ mapsjsLib.mapsjsMod.geometry, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      scala.Unit
    ]
  ] = js.undefined
  var renderPoint: js.UndefOr[
    js.Function2[
      /* pt */ mapsjsLib.mapsjsMod.point, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      scala.Unit
    ]
  ] = js.undefined
}

