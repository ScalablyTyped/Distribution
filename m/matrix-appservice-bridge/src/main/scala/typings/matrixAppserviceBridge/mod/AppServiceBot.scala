package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppServiceBot")
@js.native
open class AppServiceBot protected ()
  extends typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot {
  def this(
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixClient */ Any,
    userId: String,
    registration: typings.matrixAppservice.mod.AppServiceRegistration,
    memberCache: typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache
  ) = this()
}
