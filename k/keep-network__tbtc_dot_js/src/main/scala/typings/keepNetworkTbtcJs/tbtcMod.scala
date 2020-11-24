package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import typings.keepNetworkTbtcJs.constantsMod.Constants
import typings.keepNetworkTbtcJs.depositMod.DepositFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/TBTC", JSImport.Namespace)
@js.native
object tbtcMod extends js.Object {
  
  def getNetworkIdFromArtifact(): String = js.native
  
  @js.native
  trait TBTC extends js.Object {
    
    def Constants: typings.keepNetworkTbtcJs.constantsMod.Constants = js.native
    
    def Deposit: DepositFactory = js.native
    
    var config: TBTCConfig = js.native
    
    var constants: Constants = js.native
    
    var depositFactory: DepositFactory = js.native
    
    var satoshisPerTbtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  }
  
  @js.native
  class default protected () extends TBTC {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def withConfig(config: TBTCConfig): js.Promise[TBTC] = js.native
    def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = js.native
  }
}
