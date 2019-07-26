package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod {
  type DomRenderFn = js.Function1[/* dom */ js.Array[VirtualNode], scala.Unit]
  type FooterHeightFn = js.Function2[/* item */ js.Any, /* index */ scala.Double, scala.Double]
  type HeaderFn = js.Function3[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    /* items */ js.Array[js.Any], 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type HeaderHeightFn = js.Function2[/* item */ js.Any, /* index */ scala.Double, scala.Double]
  type ItemHeightFn = js.Function2[/* item */ js.Any, /* index */ scala.Double, scala.Double]
  type ItemRenderFn = js.Function3[
    /* el */ stdLib.HTMLElement | scala.Null, 
    /* cell */ Cell, 
    /* domIndex */ scala.Double, 
    stdLib.HTMLElement
  ]
  type NodeChange = scala.Double
}
