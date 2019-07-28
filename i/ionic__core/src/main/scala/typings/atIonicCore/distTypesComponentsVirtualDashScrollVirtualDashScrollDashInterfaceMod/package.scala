package typings.atIonicCore

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod {
  type DomRenderFn = js.Function1[/* dom */ js.Array[VirtualNode], Unit]
  type FooterHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  type HeaderFn = js.Function3[
    /* item */ js.Any, 
    /* index */ Double, 
    /* items */ js.Array[js.Any], 
    js.UndefOr[String | Null]
  ]
  type HeaderHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  type ItemHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  type ItemRenderFn = js.Function3[/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double, HTMLElement]
  type NodeChange = Double
}
