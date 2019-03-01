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

object Anon_Bleed {
  @scala.inline
  def apply(
    renderBitmap: js.Function4[
      /* img */ stdLib.HTMLElement, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      /* contextSize */ scala.Double, 
      /* bleed */ scala.Double, 
      scala.Unit
    ] = null,
    renderGeometry: js.Function2[
      /* shape */ mapsjsLib.mapsjsMod.geometry, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      scala.Unit
    ] = null,
    renderPoint: js.Function2[
      /* pt */ mapsjsLib.mapsjsMod.point, 
      /* context */ stdLib.CanvasRenderingContext2D, 
      scala.Unit
    ] = null
  ): Anon_Bleed = {
    val __obj = js.Dynamic.literal()
    if (renderBitmap != null) __obj.updateDynamic("renderBitmap")(renderBitmap)
    if (renderGeometry != null) __obj.updateDynamic("renderGeometry")(renderGeometry)
    if (renderPoint != null) __obj.updateDynamic("renderPoint")(renderPoint)
    __obj.asInstanceOf[Anon_Bleed]
  }
}

