package typings.materialTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tabComponentMod {
  
  type MDCTabFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[typings.materialTabs.tabFoundationMod.MDCTabFoundation], 
    typings.materialTabs.tabComponentMod.MDCTab
  ]
}
