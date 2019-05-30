package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataGroup extends js.Object

@JSImport("@ionic/cli-framework/definitions", "MetadataGroup")
@js.native
object MetadataGroup extends js.Object {
  @js.native
  sealed trait ADVANCED
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  @js.native
  sealed trait BETA
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  @js.native
  sealed trait DEPRECATED
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  @js.native
  sealed trait EXPERIMENTAL
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  @js.native
  sealed trait HIDDEN
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  @js.native
  sealed trait PAID
    extends atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup
  
  /* "advanced" */ val ADVANCED: ADVANCED with java.lang.String = js.native
  /* "beta" */ val BETA: BETA with java.lang.String = js.native
  /* "deprecated" */ val DEPRECATED: DEPRECATED with java.lang.String = js.native
  /* "experimental" */ val EXPERIMENTAL: EXPERIMENTAL with java.lang.String = js.native
  /* "hidden" */ val HIDDEN: HIDDEN with java.lang.String = js.native
  /* "paid" */ val PAID: PAID with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.MetadataGroup with java.lang.String] = js.native
}

