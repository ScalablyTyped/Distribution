package typings.mapsjs.anon

import typings.mapsjs.mod.geometry
import typings.mapsjs.mod.point
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBitmap extends js.Object {
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.native
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.native
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.native
}

object RenderBitmap {
  @scala.inline
  def apply(): RenderBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderBitmap]
  }
  @scala.inline
  implicit class RenderBitmapOps[Self <: RenderBitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderBitmap(
      value: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Unit
    ): Self = this.set("renderBitmap", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderBitmap: Self = this.set("renderBitmap", js.undefined)
    @scala.inline
    def setRenderGeometry(value: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Unit): Self = this.set("renderGeometry", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderGeometry: Self = this.set("renderGeometry", js.undefined)
    @scala.inline
    def setRenderPoint(value: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Unit): Self = this.set("renderPoint", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderPoint: Self = this.set("renderPoint", js.undefined)
  }
  
}

