package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import typings.keepNetworkTbtcJs.constantsMod.Constants
import typings.keepNetworkTbtcJs.depositMod.DepositFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tbtcMod {
  
  @JSImport("@keep-network/tbtc.js/src/TBTC", JSImport.Default)
  @js.native
  class default protected () extends TBTC {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@keep-network/tbtc.js/src/TBTC", "default.withConfig")
    @js.native
    def withConfig(config: TBTCConfig): js.Promise[TBTC] = js.native
    @JSImport("@keep-network/tbtc.js/src/TBTC", "default.withConfig")
    @js.native
    def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = js.native
  }
  
  @JSImport("@keep-network/tbtc.js/src/TBTC", "getNetworkIdFromArtifact")
  @js.native
  def getNetworkIdFromArtifact(): String = js.native
  
  @js.native
  trait TBTC extends StObject {
    
    def Constants: typings.keepNetworkTbtcJs.constantsMod.Constants = js.native
    
    def Deposit: DepositFactory = js.native
    
    var config: TBTCConfig = js.native
    
    var constants: Constants = js.native
    
    var depositFactory: DepositFactory = js.native
    
    var satoshisPerTbtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  }
}
