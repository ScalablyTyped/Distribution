package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.srcBitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.srcBitcoinHelpersMod.FoundTransaction
import typings.keepNetworkTbtcJs.srcBitcoinHelpersMod.SPVProof
import typings.keepNetworkTbtcJs.srcLibElectrumClientMod.default
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIVE extends StObject {
    
    var ACTIVE: Double
    
    var AWAITING_BTC_FUNDING_PROOF: Double
    
    var AWAITING_SIGNER_SETUP: Double
    
    var AWAITING_WITHDRAWAL_PROOF: Double
    
    var AWAITING_WITHDRAWAL_SIGNATURE: Double
    
    var COURTESY_CALL: Double
    
    var FAILED_SETUP: Double
    
    var FRAUD_LIQUIDATION_IN_PROGRESS: Double
    
    var LIQUIDATED: Double
    
    var LIQUIDATION_IN_PROGRESS: Double
    
    var REDEEMED: Double
    
    var START: Double
  }
  object ACTIVE {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ACTIVE] (val x: Self) extends AnyVal {
      
      inline def setACTIVE(value: Double): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
      
      inline def setAWAITING_BTC_FUNDING_PROOF(value: Double): Self = StObject.set(x, "AWAITING_BTC_FUNDING_PROOF", value.asInstanceOf[js.Any])
      
      inline def setAWAITING_SIGNER_SETUP(value: Double): Self = StObject.set(x, "AWAITING_SIGNER_SETUP", value.asInstanceOf[js.Any])
      
      inline def setAWAITING_WITHDRAWAL_PROOF(value: Double): Self = StObject.set(x, "AWAITING_WITHDRAWAL_PROOF", value.asInstanceOf[js.Any])
      
      inline def setAWAITING_WITHDRAWAL_SIGNATURE(value: Double): Self = StObject.set(x, "AWAITING_WITHDRAWAL_SIGNATURE", value.asInstanceOf[js.Any])
      
      inline def setCOURTESY_CALL(value: Double): Self = StObject.set(x, "COURTESY_CALL", value.asInstanceOf[js.Any])
      
      inline def setFAILED_SETUP(value: Double): Self = StObject.set(x, "FAILED_SETUP", value.asInstanceOf[js.Any])
      
      inline def setFRAUD_LIQUIDATION_IN_PROGRESS(value: Double): Self = StObject.set(x, "FRAUD_LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
      
      inline def setLIQUIDATED(value: Double): Self = StObject.set(x, "LIQUIDATED", value.asInstanceOf[js.Any])
      
      inline def setLIQUIDATION_IN_PROGRESS(value: Double): Self = StObject.set(x, "LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
      
      inline def setREDEEMED(value: Double): Self = StObject.set(x, "REDEEMED", value.asInstanceOf[js.Any])
      
      inline def setSTART(value: Double): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddWitnessSignature extends StObject {
    
    def addWitnessSignature(unsignedTransaction: String, inputIndex: Double, r: String, s: String, publicKey: String): String
    
    def broadcast(signedTransaction: String): js.Promise[TransactionID]
    
    def checkForConfirmations(transactionID: String, requiredConfirmations: Double): js.Promise[Double]
    
    def constructOneInputOneOutputWitnessTransaction(previousOutpoint: String, inputSequence: Double, outputValue: Double, outputScript: String): String
    
    def estimateFee(tbtcConstantsContract: Any): js.Promise[Double]
    
    def find(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction]
    
    def findAllUnspent(bitcoinAddress: String): js.Promise[js.Array[FoundTransaction]]
    
    def findAllUnspentWithClient(electrumClient: default, receiverScript: String): js.Promise[js.Array[FoundTransaction]]
    
    def findOrWaitFor(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction]
    
    def findScript(outputScript: String, expectedValue: Double): js.Promise[FoundTransaction]
    
    def findWithClient(electrumClient: default, receiverScript: String, expectedValue: Double): js.Promise[js.UndefOr[FoundTransaction]]
    
    def getBalance(bitcoinAddress: String): js.Promise[Double]
    
    def getSPVProof(transactionID: String, confirmations: Double): js.Promise[SPVProof]
    
    def waitForConfirmations(
      transactionID: String,
      requiredConfirmations: Double,
      onReceivedConfirmation: js.Function1[/* tx */ Confirmations, Unit]
    ): js.Promise[Double]
  }
  object AddWitnessSignature {
    
    inline def apply(
      addWitnessSignature: (String, Double, String, String, String) => String,
      broadcast: String => js.Promise[TransactionID],
      checkForConfirmations: (String, Double) => js.Promise[Double],
      constructOneInputOneOutputWitnessTransaction: (String, Double, Double, String) => String,
      estimateFee: Any => js.Promise[Double],
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
    implicit open class MutableBuilder[Self <: AddWitnessSignature] (val x: Self) extends AnyVal {
      
      inline def setAddWitnessSignature(value: (String, Double, String, String, String) => String): Self = StObject.set(x, "addWitnessSignature", js.Any.fromFunction5(value))
      
      inline def setBroadcast(value: String => js.Promise[TransactionID]): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
      
      inline def setCheckForConfirmations(value: (String, Double) => js.Promise[Double]): Self = StObject.set(x, "checkForConfirmations", js.Any.fromFunction2(value))
      
      inline def setConstructOneInputOneOutputWitnessTransaction(value: (String, Double, Double, String) => String): Self = StObject.set(x, "constructOneInputOneOutputWitnessTransaction", js.Any.fromFunction4(value))
      
      inline def setEstimateFee(value: Any => js.Promise[Double]): Self = StObject.set(x, "estimateFee", js.Any.fromFunction1(value))
      
      inline def setFind(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
      
      inline def setFindAllUnspent(value: String => js.Promise[js.Array[FoundTransaction]]): Self = StObject.set(x, "findAllUnspent", js.Any.fromFunction1(value))
      
      inline def setFindAllUnspentWithClient(value: (default, String) => js.Promise[js.Array[FoundTransaction]]): Self = StObject.set(x, "findAllUnspentWithClient", js.Any.fromFunction2(value))
      
      inline def setFindOrWaitFor(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "findOrWaitFor", js.Any.fromFunction2(value))
      
      inline def setFindScript(value: (String, Double) => js.Promise[FoundTransaction]): Self = StObject.set(x, "findScript", js.Any.fromFunction2(value))
      
      inline def setFindWithClient(value: (default, String, Double) => js.Promise[js.UndefOr[FoundTransaction]]): Self = StObject.set(x, "findWithClient", js.Any.fromFunction3(value))
      
      inline def setGetBalance(value: String => js.Promise[Double]): Self = StObject.set(x, "getBalance", js.Any.fromFunction1(value))
      
      inline def setGetSPVProof(value: (String, Double) => js.Promise[SPVProof]): Self = StObject.set(x, "getSPVProof", js.Any.fromFunction2(value))
      
      inline def setWaitForConfirmations(value: (String, Double, js.Function1[/* tx */ Confirmations, Unit]) => js.Promise[Double]): Self = StObject.set(x, "waitForConfirmations", js.Any.fromFunction3(value))
    }
  }
  
  trait Address extends StObject {
    
    var address: String
  }
  object Address {
    
    inline def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait Confirmations extends StObject {
    
    var confirmations: Double
    
    var transactionID: String
  }
  object Confirmations {
    
    inline def apply(confirmations: Double, transactionID: String): Confirmations = {
      val __obj = js.Dynamic.literal(confirmations = confirmations.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confirmations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Confirmations] (val x: Self) extends AnyVal {
      
      inline def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  trait DepositAddress extends StObject {
    
    var depositAddress: String
    
    var keepAddress: String
  }
  object DepositAddress {
    
    inline def apply(depositAddress: String, keepAddress: String): DepositAddress = {
      val __obj = js.Dynamic.literal(depositAddress = depositAddress.asInstanceOf[js.Any], keepAddress = keepAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepositAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DepositAddress] (val x: Self) extends AnyVal {
      
      inline def setDepositAddress(value: String): Self = StObject.set(x, "depositAddress", value.asInstanceOf[js.Any])
      
      inline def setKeepAddress(value: String): Self = StObject.set(x, "keepAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait Digest extends StObject {
    
    var _digest: String
    
    var _outpoint: String
    
    var _redeemerOutputScript: String
    
    var _requestedFee: String
    
    var _utxoValue: String
  }
  object Digest {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Digest] (val x: Self) extends AnyVal {
      
      inline def set_digest(value: String): Self = StObject.set(x, "_digest", value.asInstanceOf[js.Any])
      
      inline def set_outpoint(value: String): Self = StObject.set(x, "_outpoint", value.asInstanceOf[js.Any])
      
      inline def set_redeemerOutputScript(value: String): Self = StObject.set(x, "_redeemerOutputScript", value.asInstanceOf[js.Any])
      
      inline def set_requestedFee(value: String): Self = StObject.set(x, "_requestedFee", value.asInstanceOf[js.Any])
      
      inline def set_utxoValue(value: String): Self = StObject.set(x, "_utxoValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locktime extends StObject {
    
    var locktime: Any
    
    var txInVector: Any
    
    var txOutVector: Any
    
    var version: Any
  }
  object Locktime {
    
    inline def apply(locktime: Any, txInVector: Any, txOutVector: Any, version: Any): Locktime = {
      val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locktime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locktime] (val x: Self) extends AnyVal {
      
      inline def setLocktime(value: Any): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      inline def setTxInVector(value: Any): Self = StObject.set(x, "txInVector", value.asInstanceOf[js.Any])
      
      inline def setTxOutVector(value: Any): Self = StObject.set(x, "txOutVector", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MAINNET extends StObject {
    
    var MAINNET: String
    
    var SIMNET: String
    
    var TESTNET: String
  }
  object MAINNET {
    
    inline def apply(MAINNET: String, SIMNET: String, TESTNET: String): MAINNET = {
      val __obj = js.Dynamic.literal(MAINNET = MAINNET.asInstanceOf[js.Any], SIMNET = SIMNET.asInstanceOf[js.Any], TESTNET = TESTNET.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAINNET]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MAINNET] (val x: Self) extends AnyVal {
      
      inline def setMAINNET(value: String): Self = StObject.set(x, "MAINNET", value.asInstanceOf[js.Any])
      
      inline def setSIMNET(value: String): Self = StObject.set(x, "SIMNET", value.asInstanceOf[js.Any])
      
      inline def setTESTNET(value: String): Self = StObject.set(x, "TESTNET", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@keep-network/tbtc.js.@keep-network/tbtc.js/src/BitcoinHelpers.FoundTransaction, 'value'> */
  trait OmitFoundTransactionvalue extends StObject {
    
    var outputPosition: Double
    
    var transactionID: String
  }
  object OmitFoundTransactionvalue {
    
    inline def apply(outputPosition: Double, transactionID: String): OmitFoundTransactionvalue = {
      val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitFoundTransactionvalue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitFoundTransactionvalue] (val x: Self) extends AnyVal {
      
      inline def setOutputPosition(value: Double): Self = StObject.set(x, "outputPosition", value.asInstanceOf[js.Any])
      
      inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  trait PubKeyHashFrom extends StObject {
    
    def pubKeyHashFrom(address: String): Buffer | Null
    
    def pubKeyHashToBech32(pubKeyHash: String, network: BitcoinNetworkType): String
    
    def publicKeyPointToP2WPKHAddress(publicKeyX: String, publicKeyY: String, bitcoinNetwork: BitcoinNetworkType): String
    
    def publicKeyToP2WPKHAddress(publicKeyString: String, network: BitcoinNetworkType): String
    
    def toRawScript(address: String): Buffer
    
    def toScript(address: String): String
  }
  object PubKeyHashFrom {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: PubKeyHashFrom] (val x: Self) extends AnyVal {
      
      inline def setPubKeyHashFrom(value: String => Buffer | Null): Self = StObject.set(x, "pubKeyHashFrom", js.Any.fromFunction1(value))
      
      inline def setPubKeyHashToBech32(value: (String, BitcoinNetworkType) => String): Self = StObject.set(x, "pubKeyHashToBech32", js.Any.fromFunction2(value))
      
      inline def setPublicKeyPointToP2WPKHAddress(value: (String, String, BitcoinNetworkType) => String): Self = StObject.set(x, "publicKeyPointToP2WPKHAddress", js.Any.fromFunction3(value))
      
      inline def setPublicKeyToP2WPKHAddress(value: (String, BitcoinNetworkType) => String): Self = StObject.set(x, "publicKeyToP2WPKHAddress", js.Any.fromFunction2(value))
      
      inline def setToRawScript(value: String => Buffer): Self = StObject.set(x, "toRawScript", js.Any.fromFunction1(value))
      
      inline def setToScript(value: String => String): Self = StObject.set(x, "toScript", js.Any.fromFunction1(value))
    }
  }
  
  trait RequiredConfirmations extends StObject {
    
    var requiredConfirmations: Double
    
    var transaction: FoundTransaction
  }
  object RequiredConfirmations {
    
    inline def apply(requiredConfirmations: Double, transaction: FoundTransaction): RequiredConfirmations = {
      val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredConfirmations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredConfirmations] (val x: Self) extends AnyVal {
      
      inline def setRequiredConfirmations(value: Double): Self = StObject.set(x, "requiredConfirmations", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: FoundTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequiredConfirmationsTransactionID extends StObject {
    
    var requiredConfirmations: Double
    
    var transactionID: String
  }
  object RequiredConfirmationsTransactionID {
    
    inline def apply(requiredConfirmations: Double, transactionID: String): RequiredConfirmationsTransactionID = {
      val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredConfirmationsTransactionID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredConfirmationsTransactionID] (val x: Self) extends AnyVal {
      
      inline def setRequiredConfirmations(value: Double): Self = StObject.set(x, "requiredConfirmations", value.asInstanceOf[js.Any])
      
      inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionID extends StObject {
    
    var transactionID: String
  }
  object TransactionID {
    
    inline def apply(transactionID: String): TransactionID = {
      val __obj = js.Dynamic.literal(transactionID = transactionID.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionID] (val x: Self) extends AnyVal {
      
      inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    }
  }
}
