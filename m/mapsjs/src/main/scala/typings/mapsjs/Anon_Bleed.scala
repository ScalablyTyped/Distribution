package typings.mapsjs

import typings.mapsjs.mapsjsMod.geometry
import typings.mapsjs.mapsjsMod.point
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bleed extends js.Object {
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.undefined
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
}

object Anon_Bleed {
  @scala.inline
  def apply(
    renderBitmap: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Unit = null,
    renderGeometry: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Unit = null,
    renderPoint: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Unit = null
  ): Anon_Bleed = {
    val __obj = js.Dynamic.literal()
    if (renderBitmap != null) __obj.updateDynamic("renderBitmap")(js.Any.fromFunction4(renderBitmap))
    if (renderGeometry != null) __obj.updateDynamic("renderGeometry")(js.Any.fromFunction2(renderGeometry))
    if (renderPoint != null) __obj.updateDynamic("renderPoint")(js.Any.fromFunction2(renderPoint))
    __obj.asInstanceOf[Anon_Bleed]
  }
}

