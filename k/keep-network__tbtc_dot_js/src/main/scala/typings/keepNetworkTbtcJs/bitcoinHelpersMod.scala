package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.anon.AddWitnessSignature
import typings.keepNetworkTbtcJs.anon.MAINNET
import typings.keepNetworkTbtcJs.anon.PubKeyHashFrom
import typings.keepNetworkTbtcJs.bitcoinSPVMod.Proof
import typings.keepNetworkTbtcJs.electrumClientMod.Config
import typings.keepNetworkTbtcJs.electrumClientMod.default
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitcoinHelpersMod {
  
  @js.native
  trait BitcoinHelpers extends StObject {
    
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
    implicit class BitcoinHelpersMutableBuilder[Self <: BitcoinHelpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: PubKeyHashFrom): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectrumConfig(value: Config): Self = StObject.set(x, "electrumConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectrumConfigNull: Self = StObject.set(x, "electrumConfig", null)
      
      @scala.inline
      def setNetwork(value: MAINNET): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyPointToPublicKeyString(value: (String, String) => String): Self = StObject.set(x, "publicKeyPointToPublicKeyString", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSatoshisPerBtc(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): Self = StObject.set(x, "satoshisPerBtc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetElectrumConfig(value: Config => Unit): Self = StObject.set(x, "setElectrumConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureDER(value: (String, String) => Buffer): Self = StObject.set(x, "signatureDER", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransaction(value: AddWitnessSignature): Self = StObject.set(x, "Transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithElectrumClient(value: js.Function1[/* client */ default, js.Promise[js.Any]] => js.Promise[js.Any]): Self = StObject.set(x, "withElectrumClient", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet
  */
  trait BitcoinNetworkType extends StObject
  object BitcoinNetworkType {
    
    @scala.inline
    def main: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main = "main".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.main]
    
    @scala.inline
    def simnet: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet = "simnet".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.simnet]
    
    @scala.inline
    def testnet: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet = "testnet".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.testnet]
  }
  
  @js.native
  trait FoundTransaction extends StObject {
    
    var outputPosition: Double = js.native
    
    var transactionID: String = js.native
    
    var value: Double = js.native
  }
  object FoundTransaction {
    
    @scala.inline
    def apply(outputPosition: Double, transactionID: String, value: Double): FoundTransaction = {
      val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoundTransaction]
    }
    
    @scala.inline
    implicit class FoundTransactionMutableBuilder[Self <: FoundTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputPosition(value: Double): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedTransaction extends StObject {
    
    var locktime: String = js.native
    
    var txInVector: String = js.native
    
    var txOutVector: String = js.native
    
    var version: String = js.native
  }
  object ParsedTransaction {
    
    @scala.inline
    def apply(locktime: String, txInVector: String, txOutVector: String, version: String): ParsedTransaction = {
      val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTransaction]
    }
    
    @scala.inline
    implicit class ParsedTransactionMutableBuilder[Self <: ParsedTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocktime(value: String): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxInVector(value: String): Self = StObject.set(x, "txInVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxOutVector(value: String): Self = StObject.set(x, "txOutVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SPVProof extends Proof {
    
    var parsedTransaction: ParsedTransaction = js.native
  }
  object SPVProof {
    
    @scala.inline
    def apply(
      chainHeaders: String,
      merkleProof: String,
      parsedTransaction: ParsedTransaction,
      tx: String,
      txInBlockIndex: String
    ): SPVProof = {
      val __obj = js.Dynamic.literal(chainHeaders = chainHeaders.asInstanceOf[js.Any], merkleProof = merkleProof.asInstanceOf[js.Any], parsedTransaction = parsedTransaction.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], txInBlockIndex = txInBlockIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SPVProof]
    }
    
    @scala.inline
    implicit class SPVProofMutableBuilder[Self <: SPVProof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsedTransaction(value: ParsedTransaction): Self = StObject.set(x, "parsedTransaction", value.asInstanceOf[js.Any])
    }
  }
}
