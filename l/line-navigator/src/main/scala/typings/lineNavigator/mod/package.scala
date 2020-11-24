package typings.lineNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FindAllCallback = js.Function4[
    /* err */ js.Any, 
    /* index */ scala.Double, 
    /* limitHit */ js.UndefOr[scala.Boolean], 
    /* results */ js.UndefOr[js.Array[typings.lineNavigator.mod.FindAllResult]], 
    scala.Unit
  ]
  
  type FindCallback = js.Function3[
    /* err */ js.Any, 
    /* index */ js.UndefOr[scala.Double], 
    /* match */ js.UndefOr[typings.lineNavigator.mod.FindMatch], 
    scala.Unit
  ]
  
  type ReadLinesCallback = js.Function5[
    /* err */ js.Any, 
    /* index */ scala.Double, 
    /* lines */ js.UndefOr[js.Array[java.lang.String]], 
    /* isEof */ js.UndefOr[scala.Boolean], 
    /* progress */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
