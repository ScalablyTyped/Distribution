package typings.logkitty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiMod {
  
  type FilterCreator = js.Function3[
    /* platform */ typings.logkitty.typesMod.Platform, 
    /* minPriority */ js.UndefOr[scala.Double], 
    /* adbPath */ js.UndefOr[java.lang.String], 
    typings.logkitty.typesMod.IFilter
  ]
}
