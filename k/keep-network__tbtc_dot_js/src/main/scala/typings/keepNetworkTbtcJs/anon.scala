package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.FoundTransaction
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.SPVProof
import typings.keepNetworkTbtcJs.electrumClientMod.default
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ACTIVE extends StObject {
    
    var ACTIVE: Double = js.native
    
    var AWAITING_BTC_FUNDING_PROOF: Double = js.native
    
    var AWAITING_SIGNER_SETUP: Double = js.native
    
    var AWAITING_WITHDRAWAL_PROOF: Double = js.native
    
    var AWAITING_WITHDRAWAL_SIGNATURE: Double = js.native
    
    var COURTESY_CALL: Double = js.native
    
    var FAILED_SETUP: Double = js.native
    
    var FRAUD_LIQUIDATION_IN_PROGRESS: Double = js.native
    
    var LIQUIDATED: Double = js.native
    
    var LIQUIDATION_IN_PROGRESS: Double = js.native
    
    var REDEEMED: Double = js.native
    
    var START: Double = js.native
  }
  object ACTIVE {
    
    @scala.inline
    def apply(
      ACTIVE: Double,
      AWAITING_BTC_FUNDING_PROOF: Double,
      AWAITING_SIGNER_SETUP: Double,
      AWAITING_WITHDRAWAL_PROOF: Double,
      AWAITING_WITHDRAWAL_SIGNATURE: Double,
      COURTESY_CALL: Double,
      FAILED_SETUP: Double,
      FRAUD_LIQUIDATION_IN_PROGRESS: Double,
      LIQUIDATED: Double,
      LIQUIDATION_IN_PROGRESS: Double,
      REDEEMED: Double,
      START: Double
    ): ACTIVE = {
      val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], AWAITING_BTC_FUNDING_PROOF = AWAITING_BTC_FUNDING_PROOF.asInstanceOf[js.Any], AWAITING_SIGNER_SETUP = AWAITING_SIGNER_SETUP.asInstanceOf[js.Any], AWAITING_WITHDRAWAL_PROOF = AWAITING_WITHDRAWAL_PROOF.asInstanceOf[js.Any], AWAITING_WITHDRAWAL_SIGNATURE = AWAITING_WITHDRAWAL_SIGNATURE.asInstanceOf[js.Any], COURTESY_CALL = COURTESY_CALL.asInstanceOf[js.Any], FAILED_SETUP = FAILED_SETUP.asInstanceOf[js.Any], FRAUD_LIQUIDATION_IN_PROGRESS = FRAUD_LIQUIDATION_IN_PROGRESS.asInstanceOf[js.Any], LIQUIDATED = LIQUIDATED.asInstanceOf[js.Any], LIQUIDATION_IN_PROGRESS = LIQUIDATION_IN_PROGRESS.asInstanceOf[js.Any], REDEEMED = REDEEMED.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIVE]
    }
    
    @scala.inline
    implicit class ACTIVEMutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACTIVE(value: Double): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWAITING_BTC_FUNDING_PROOF(value: Double): Self = StObject.set(x, "AWAITING_BTC_FUNDING_PROOF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWAITING_SIGNER_SETUP(value: Double): Self = StObject.set(x, "AWAITING_SIGNER_SETUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWAITING_WITHDRAWAL_PROOF(value: Double): Self = StObject.set(x, "AWAITING_WITHDRAWAL_PROOF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWAITING_WITHDRAWAL_SIGNATURE(value: Double): Self = StObject.set(x, "AWAITING_WITHDRAWAL_SIGNATURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOURTESY_CALL(value: Double): Self = StObject.set(x, "COURTESY_CALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFAILED_SETUP(value: Double): Self = StObject.set(x, "FAILED_SETUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFRAUD_LIQUIDATION_IN_PROGRESS(value: Double): Self = StObject.set(x, "FRAUD_LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLIQUIDATED(value: Double): Self = StObject.set(x, "LIQUIDATED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLIQUIDATION_IN_PROGRESS(value: Double): Self = StObject.set(x, "LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREDEEMED(value: Double): Self = StObject.set(x, "REDEEMED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTART(value: Double): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AddWitnessSignature extends StObject {
    
    def addWitnessSignature(unsignedTransaction: String, inputIndex: Double, r: String, s: String, publicKey: String): String = js.native
    
    def broadcast(signedTransaction: String): js.Promise[TransactionID] = js.native
    
    def checkForConfirmations(transactionID: String, requiredConfirmations: Double): js.Promise[Double] = js.native
    
    def constructOneInputOneOutputWitnessTransaction(previousOutpoint: String, inputSequence: Double, outputValue: Double, outputScript: String): String = js.native
    
    def estimateFee(tbtcConstantsContract: js.Any): js.Promise[Double] = js.native
    
    def find(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
    
    def findAllUnspent(bitcoinAddress: String): js.Promise[js.Array[FoundTransaction]] = js.native
    
    def findAllUnspentWithClient(electrumClient: default, receiverScript: String): js.Promise[js.Array[FoundTransaction]] = js.native
    
    def findOrWaitFor(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
    
    def findScript(outputScript: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
    
    def findWithClient(electrumClient: default, receiverScript: String, expectedValue: Double): js.Promise[js.UndefOr[FoundTransaction]] = js.native
    
    def getBalance(bitcoinAddress: String): js.Promise[Double] = js.native
    
    def getSPVProof(transactionID: String, confirmations: Double): js.Promise[SPVProof] = js.native
    
    def waitForConfirmations(
      transactionID: String,
      requiredConfirmations: Double,
      onReceivedConfirmation: js.Function1[/* tx */ Confirmations, Unit]
    ): js.Promise[Double] = js.native
  }
  object AddWitnessSignature {
    
    @scala.inline
    def apply(
      addWitnessSignature: (String, Double, String, String, String) => String,
      broadcast: String => js.Promise[TransactionID],
      checkForConfirmations: (String, Double) => js.Promise[Double],
      constructOneInputOneOutputWitnessTransaction: (String, Double, Double, String) => String,
      estimateFee: js.Any => js.Promise[Double],
      find: (String, Double) => js.Promise[FoundTransaction],
      findAllUnspent: String => js.Promise[js.Array[FoundTransaction]],
      findAllUnspentWithClient: (default, String) => js.Promise[js.Array[FoundTransaction]],
      findOrWaitFor: (String, Double) => js.Promise[FoundTransaction],
      findScript: (String, Double) => js.Promise[FoundTransaction],
      findWithClient: (default, String, Double) => js.Promise[js.UndefOr[FoundTransaction]],
      getBalance: String => js.Promise[Double],
      getSPVProof: (String, Double) => js.Promise[SPVProof],
      waitForConfirmations: (String, Double, js.Function1[/* tx */ Confirmations, Unit]) => js.Promise[Double]
    ): AddWitnessSignature = {
      val __obj = js.Dynamic.literal(addWitnessSignature = js.Any.fromFunction5(addWitnessSignature), broadcast = js.Any.fromFunction1(broadcast), checkForConfirmations = js.Any.fromFunction2(checkForConfirmations), constructOneInputOneOutputWitnessTransaction = js.Any.fromFunction4(constructOneInputOneOutputWitnessTransaction), estimateFee = js.Any.fromFunction1(estimateFee), find = js.Any.fromFunction2(find), findAllUnspent = js.Any.fromFunction1(findAllUnspent), findAllUnspentWithClient = js.Any.fromFunction2(findAllUnspentWithClient), findOrWaitFor = js.Any.fromFunction2(findOrWaitFor), findScript = js.Any.fromFunction2(findScript), findWithClient = js.Any.fromFunction3(findWithClient), getBalance = js.Any.fromFunction1(getBalance), getSPVProof = js.Any.fromFunction2(getSPVProof), waitForConfirmations = js.Any.fromFunction3(waitForConfirmations))
      __obj.asInstanceOf[AddWitnessSignature]
    }
    
    @scala.inline
    implicit class AddWitnessSignatureMutableBuilder[Self <: AddWitnessSignature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddWitnessSignature(value: (String, Double, String, String, String) => String): Self = StObject.set(x, "addWitnessSignature", js.Any.fromFunction5(value))
      
      @scala.inline
      def setBroadcast(value: String => js.Promise[TransactionID]): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCheckForConfirmations(value: (String, Double) => js.Promise[Double]): Self = StObject.set(x, "checkForConfirmations", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConstructOneInputOneOutputWitnessTransaction(value: (String, Double, Double, String) => String): Self = StObject.set(x, "constructOneInputOneOutputWitnessTransaction", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEstimateFee(value: js.Any => js.Promise[Double]): Self = StObject.set(x, "estimateFee", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindAllUnspent(value: String => js.Promise[js.Array[FoundTransaction]]): Self = StObject.set(x, "findAllUnspent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindAllUnspentWithClient(value: (default, String) => js.Promise[js.Array[FoundTransaction]]): Self = StObject.set(x, "findAllUnspentWithClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindOrWaitFor(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "findOrWaitFor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindScript(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "findScript", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindWithClient(value: (default, String, Double) => js.Promise[js.UndefOr[FoundTransaction]]): Self = StObject.set(x, "findWithClient", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetBalance(value: String => js.Promise[Double]): Self = StObject.set(x, "getBalance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSPVProof(value: (String, Double) => js.Promise[SPVProof]): Self = StObject.set(x, "getSPVProof", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaitForConfirmations(value: (String, Double, js.Function1[/* tx */ Confirmations, Unit]) => js.Promise[Double]): Self = StObject.set(x, "waitForConfirmations", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Address extends StObject {
    
    var address: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Confirmations extends StObject {
    
    var confirmations: Double = js.native
    
    var transactionID: String = js.native
  }
  object Confirmations {
    
    @scala.inline
    def apply(confirmations: Double, transactionID: String): Confirmations = {
      val __obj = js.Dynamic.literal(confirmations = confirmations.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confirmations]
    }
    
    @scala.inline
    implicit class ConfirmationsMutableBuilder[Self <: Confirmations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DepositAddress extends StObject {
    
    var depositAddress: String = js.native
    
    var keepAddress: String = js.native
  }
  object DepositAddress {
    
    @scala.inline
    def apply(depositAddress: String, keepAddress: String): DepositAddress = {
      val __obj = js.Dynamic.literal(depositAddress = depositAddress.asInstanceOf[js.Any], keepAddress = keepAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepositAddress]
    }
    
    @scala.inline
    implicit class DepositAddressMutableBuilder[Self <: DepositAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepositAddress(value: String): Self = StObject.set(x, "depositAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAddress(value: String): Self = StObject.set(x, "keepAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Digest extends StObject {
    
    var _digest: String = js.native
    
    var _outpoint: String = js.native
    
    var _redeemerOutputScript: String = js.native
    
    var _requestedFee: String = js.native
    
    var _utxoValue: String = js.native
  }
  object Digest {
    
    @scala.inline
    def apply(
      _digest: String,
      _outpoint: String,
      _redeemerOutputScript: String,
      _requestedFee: String,
      _utxoValue: String
    ): Digest = {
      val __obj = js.Dynamic.literal(_digest = _digest.asInstanceOf[js.Any], _outpoint = _outpoint.asInstanceOf[js.Any], _redeemerOutputScript = _redeemerOutputScript.asInstanceOf[js.Any], _requestedFee = _requestedFee.asInstanceOf[js.Any], _utxoValue = _utxoValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Digest]
    }
    
    @scala.inline
    implicit class DigestMutableBuilder[Self <: Digest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_digest(value: String): Self = StObject.set(x, "_digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_outpoint(value: String): Self = StObject.set(x, "_outpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_redeemerOutputScript(value: String): Self = StObject.set(x, "_redeemerOutputScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_requestedFee(value: String): Self = StObject.set(x, "_requestedFee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_utxoValue(value: String): Self = StObject.set(x, "_utxoValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Locktime extends StObject {
    
    var locktime: js.Any = js.native
    
    var txInVector: js.Any = js.native
    
    var txOutVector: js.Any = js.native
    
    var version: js.Any = js.native
  }
  object Locktime {
    
    @scala.inline
    def apply(locktime: js.Any, txInVector: js.Any, txOutVector: js.Any, version: js.Any): Locktime = {
      val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locktime]
    }
    
    @scala.inline
    implicit class LocktimeMutableBuilder[Self <: Locktime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocktime(value: js.Any): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxInVector(value: js.Any): Self = StObject.set(x, "txInVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxOutVector(value: js.Any): Self = StObject.set(x, "txOutVector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MAINNET extends StObject {
    
    var MAINNET: String = js.native
    
    var SIMNET: String = js.native
    
    var TESTNET: String = js.native
  }
  object MAINNET {
    
    @scala.inline
    def apply(MAINNET: String, SIMNET: String, TESTNET: String): MAINNET = {
      val __obj = js.Dynamic.literal(MAINNET = MAINNET.asInstanceOf[js.Any], SIMNET = SIMNET.asInstanceOf[js.Any], TESTNET = TESTNET.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAINNET]
    }
    
    @scala.inline
    implicit class MAINNETMutableBuilder[Self <: MAINNET] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAINNET(value: String): Self = StObject.set(x, "MAINNET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIMNET(value: String): Self = StObject.set(x, "SIMNET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTESTNET(value: String): Self = StObject.set(x, "TESTNET", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@keep-network/tbtc.js.@keep-network/tbtc.js/src/BitcoinHelpers.FoundTransaction, 'value'> */
  @js.native
  trait OmitFoundTransactionvalue extends StObject {
    
    var outputPosition: Double = js.native
    
    var transactionID: String = js.native
  }
  object OmitFoundTransactionvalue {
    
    @scala.inline
    def apply(outputPosition: Double, transactionID: String): OmitFoundTransactionvalue = {
      val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitFoundTransactionvalue]
    }
    
    @scala.inline
    implicit class OmitFoundTransactionvalueMutableBuilder[Self <: OmitFoundTransactionvalue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputPosition(value: Double): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PubKeyHashFrom extends StObject {
    
    def pubKeyHashFrom(address: String): Buffer | Null = js.native
    
    def pubKeyHashToBech32(pubKeyHash: String, network: BitcoinNetworkType): String = js.native
    
    def publicKeyPointToP2WPKHAddress(publicKeyX: String, publicKeyY: String, bitcoinNetwork: BitcoinNetworkType): String = js.native
    
    def publicKeyToP2WPKHAddress(publicKeyString: String, network: BitcoinNetworkType): String = js.native
    
    def toRawScript(address: String): Buffer = js.native
    
    def toScript(address: String): String = js.native
  }
  object PubKeyHashFrom {
    
    @scala.inline
    def apply(
      pubKeyHashFrom: String => Buffer | Null,
      pubKeyHashToBech32: (String, BitcoinNetworkType) => String,
      publicKeyPointToP2WPKHAddress: (String, String, BitcoinNetworkType) => String,
      publicKeyToP2WPKHAddress: (String, BitcoinNetworkType) => String,
      toRawScript: String => Buffer,
      toScript: String => String
    ): PubKeyHashFrom = {
      val __obj = js.Dynamic.literal(pubKeyHashFrom = js.Any.fromFunction1(pubKeyHashFrom), pubKeyHashToBech32 = js.Any.fromFunction2(pubKeyHashToBech32), publicKeyPointToP2WPKHAddress = js.Any.fromFunction3(publicKeyPointToP2WPKHAddress), publicKeyToP2WPKHAddress = js.Any.fromFunction2(publicKeyToP2WPKHAddress), toRawScript = js.Any.fromFunction1(toRawScript), toScript = js.Any.fromFunction1(toScript))
      __obj.asInstanceOf[PubKeyHashFrom]
    }
    
    @scala.inline
    implicit class PubKeyHashFromMutableBuilder[Self <: PubKeyHashFrom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubKeyHashFrom(value: String => Buffer | Null): Self = StObject.set(x, "pubKeyHashFrom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPubKeyHashToBech32(value: (String, BitcoinNetworkType) => String): Self = StObject.set(x, "pubKeyHashToBech32", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPublicKeyPointToP2WPKHAddress(value: (String, String, BitcoinNetworkType) => String): Self = StObject.set(x, "publicKeyPointToP2WPKHAddress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPublicKeyToP2WPKHAddress(value: (String, BitcoinNetworkType) => String): Self = StObject.set(x, "publicKeyToP2WPKHAddress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToRawScript(value: String => Buffer): Self = StObject.set(x, "toRawScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToScript(value: String => String): Self = StObject.set(x, "toScript", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RequiredConfirmations extends StObject {
    
    var requiredConfirmations: Double = js.native
    
    var transaction: FoundTransaction = js.native
  }
  object RequiredConfirmations {
    
    @scala.inline
    def apply(requiredConfirmations: Double, transaction: FoundTransaction): RequiredConfirmations = {
      val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredConfirmations]
    }
    
    @scala.inline
    implicit class RequiredConfirmationsMutableBuilder[Self <: RequiredConfirmations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequiredConfirmations(value: Double): Self = StObject.set(x, "requiredConfirmations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction(value: FoundTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequiredConfirmationsTransactionID extends StObject {
    
    var requiredConfirmations: Double = js.native
    
    var transactionID: String = js.native
  }
  object RequiredConfirmationsTransactionID {
    
    @scala.inline
    def apply(requiredConfirmations: Double, transactionID: String): RequiredConfirmationsTransactionID = {
      val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredConfirmationsTransactionID]
    }
    
    @scala.inline
    implicit class RequiredConfirmationsTransactionIDMutableBuilder[Self <: RequiredConfirmationsTransactionID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequiredConfirmations(value: Double): Self = StObject.set(x, "requiredConfirmations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransactionID extends StObject {
    
    var transactionID: String = js.native
  }
  object TransactionID {
    
    @scala.inline
    def apply(transactionID: String): TransactionID = {
      val __obj = js.Dynamic.literal(transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionID]
    }
    
    @scala.inline
    implicit class TransactionIDMutableBuilder[Self <: TransactionID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
}
