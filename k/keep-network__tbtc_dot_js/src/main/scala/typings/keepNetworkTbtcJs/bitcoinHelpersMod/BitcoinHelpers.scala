package typings.keepNetworkTbtcJs.bitcoinHelpersMod

import typings.keepNetworkTbtcJs.anon.AddWitnessSignature
import typings.keepNetworkTbtcJs.anon.MAINNET
import typings.keepNetworkTbtcJs.anon.PubKeyHashFrom
import typings.keepNetworkTbtcJs.electrumClientMod.Config
import typings.keepNetworkTbtcJs.electrumClientMod.default
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitcoinHelpers extends js.Object {
  
  var Address: PubKeyHashFrom = js.native
  
  var Network: MAINNET = js.native
  
  var Transaction: AddWitnessSignature = js.native
  
  var electrumConfig: Config | Null = js.native
  
  def publicKeyPointToPublicKeyString(publicKeyX: String, publicKeyY: String): String = js.native
  
  var satoshisPerBtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  def setElectrumConfig(newConfig: Config): Unit = js.native
  
  def signatureDER(r: String, s: String): Buffer = js.native
  
  def withElectrumClient[T](block: js.Function1[/* client */ default, js.Promise[T]]): js.Promise[T] = js.native
}
object BitcoinHelpers {
  
  @scala.inline
  def apply(
    Address: PubKeyHashFrom,
    Network: MAINNET,
    Transaction: AddWitnessSignature,
    publicKeyPointToPublicKeyString: (String, String) => String,
    satoshisPerBtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    setElectrumConfig: Config => Unit,
    signatureDER: (String, String) => Buffer,
    withElectrumClient: js.Function1[/* client */ default, js.Promise[js.Any]] => js.Promise[js.Any]
  ): BitcoinHelpers = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any], publicKeyPointToPublicKeyString = js.Any.fromFunction2(publicKeyPointToPublicKeyString), satoshisPerBtc = satoshisPerBtc.asInstanceOf[js.Any], setElectrumConfig = js.Any.fromFunction1(setElectrumConfig), signatureDER = js.Any.fromFunction2(signatureDER), withElectrumClient = js.Any.fromFunction1(withElectrumClient))
    __obj.asInstanceOf[BitcoinHelpers]
  }
  
  @scala.inline
  implicit class BitcoinHelpersOps[Self <: BitcoinHelpers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: PubKeyHashFrom): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: MAINNET): Self = this.set("Network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction(value: AddWitnessSignature): Self = this.set("Transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyPointToPublicKeyString(value: (String, String) => String): Self = this.set("publicKeyPointToPublicKeyString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSatoshisPerBtc(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = this.set("satoshisPerBtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetElectrumConfig(value: Config => Unit): Self = this.set("setElectrumConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureDER(value: (String, String) => Buffer): Self = this.set("signatureDER", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWithElectrumClient(value: js.Function1[/* client */ default, js.Promise[js.Any]] => js.Promise[js.Any]): Self = this.set("withElectrumClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElectrumConfig(value: Config): Self = this.set("electrumConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectrumConfigNull: Self = this.set("electrumConfig", null)
  }
}
