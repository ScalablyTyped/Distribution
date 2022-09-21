package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.apiMod.ProvisioningApiOpts
import typings.matrixAppserviceBridge.storeMod.ProvisioningStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ProvisioningApi")
@js.native
open class ProvisioningApi protected ()
  extends typings.matrixAppserviceBridge.provisioningMod.ProvisioningApi {
  def this(store: ProvisioningStore) = this()
  def this(store: ProvisioningStore, opts: ProvisioningApiOpts) = this()
}
