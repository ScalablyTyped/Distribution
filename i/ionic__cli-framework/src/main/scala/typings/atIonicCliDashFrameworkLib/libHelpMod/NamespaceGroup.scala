package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamespaceGroup extends js.Object

@JSImport("@ionic/cli-framework/lib/help", "NamespaceGroup")
@js.native
object NamespaceGroup extends js.Object {
  @js.native
  sealed trait Beta
    extends atIonicCliDashFrameworkLib.libHelpMod.NamespaceGroup
  
  @js.native
  sealed trait Deprecated
    extends atIonicCliDashFrameworkLib.libHelpMod.NamespaceGroup
  
  @js.native
  sealed trait Experimental
    extends atIonicCliDashFrameworkLib.libHelpMod.NamespaceGroup
  
  @js.native
  sealed trait Hidden
    extends atIonicCliDashFrameworkLib.libHelpMod.NamespaceGroup
  
  /* "beta" */ val Beta: Beta with java.lang.String = js.native
  /* "deprecated" */ val Deprecated: Deprecated with java.lang.String = js.native
  /* "experimental" */ val Experimental: Experimental with java.lang.String = js.native
  /* "hidden" */ val Hidden: Hidden with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atIonicCliDashFrameworkLib.libHelpMod.NamespaceGroup with java.lang.String] = js.native
}

