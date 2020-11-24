package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object virtualScrollInterfaceMod {
  
  type DomRenderFn = js.Function1[
    /* dom */ js.Array[typings.ionicCore.virtualScrollInterfaceMod.VirtualNode], 
    scala.Unit
  ]
  
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
    /* el */ typings.std.HTMLElement | scala.Null, 
    /* cell */ typings.ionicCore.virtualScrollInterfaceMod.Cell, 
    /* domIndex */ scala.Double, 
    typings.std.HTMLElement
  ]
  
  type NodeChange = scala.Double
}
