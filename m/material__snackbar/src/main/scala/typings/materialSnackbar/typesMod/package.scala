package typings.materialSnackbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type MDCSnackbarAnnouncer = js.Function2[
    /* ariaEl */ typings.std.Element, 
    /* labelEl */ js.UndefOr[typings.std.Element], 
    scala.Unit
  ]
  
  type MDCSnackbarAnnouncerFactory = js.Function0[typings.materialSnackbar.typesMod.MDCSnackbarAnnouncer]
}
