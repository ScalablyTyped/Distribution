package typings
package intlDashRelativeformatLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STYLE extends js.Object

@JSImport("intl-relativeformat/lib/types", "STYLE")
@js.native
object STYLE extends js.Object {
  @js.native
  sealed trait bestFit
    extends intlDashRelativeformatLib.libTypesMod.STYLE
  
  @js.native
  sealed trait numeric
    extends intlDashRelativeformatLib.libTypesMod.STYLE
  
  /* "best fit" */ val bestFit: bestFit with java.lang.String = js.native
  /* "numeric" */ val numeric: numeric with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[intlDashRelativeformatLib.libTypesMod.STYLE with java.lang.String] = js.native
}

