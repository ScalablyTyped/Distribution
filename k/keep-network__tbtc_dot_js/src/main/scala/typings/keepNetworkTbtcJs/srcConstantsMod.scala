package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.srcCommonTypesMod.Contract
import typings.keepNetworkTbtcJs.srcCommonTypesMod.TBTCConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConstantsMod {
  
  @JSImport("@keep-network/tbtc.js/src/Constants", "Constants")
  @js.native
  open class Constants protected () extends StObject {
    def this(constants: Any, contract: Contract) = this()
    
    var AUCTION_DURATION: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var BENEFICIARY_REWARD_DIVISOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var COURTESY_CALL_DURATION: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var DEPOSIT_TERM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var FUNDING_PROOF_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var INCREASE_FEE_TIMER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var MINIMUM_REDEMPTION_FEE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var PERMITTED_FEE_BUMPS: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var REDEMPTION_PROOF_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var REDEMPTION_SIGNATURE_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var SATOSHI_MULTIPLIER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var SIGNING_GROUP_FORMATION_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var TX_PROOF_DIFFICULTY_FACTOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var contract: Contract = js.native
  }
  object Constants {
    
    @JSImport("@keep-network/tbtc.js/src/Constants", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def withConfig(config: TBTCConfig): js.Promise[Constants] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Constants]]
  }
}
