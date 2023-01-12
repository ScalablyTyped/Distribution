package typings.ledgerhqHwAppBtc

import typings.ledgerhqHwAppBtc.anon.BitcoinAddress
import typings.ledgerhqHwAppBtc.anon.Format
import typings.ledgerhqHwAppBtc.anon.Index
import typings.ledgerhqHwAppBtc.anon.R
import typings.ledgerhqHwAppBtc.anon.TrustedInput
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-app-btc", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AppBtc {
    def this(transport: typings.ledgerhqHwTransport.mod.default[String]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32
  */
  trait AddressFormat extends StObject
  object AddressFormat {
    
    inline def bech32: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32 = "bech32".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32]
    
    inline def legacy: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy = "legacy".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy]
    
    inline def p2sh: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh = "p2sh".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh]
  }
  
  @js.native
  trait AppBtc extends StObject {
    
    def createPaymentTransactionNew(arg: CreateTransactionArg): js.Promise[String] = js.native
    
    def getTrustedInput(indexLookup: Double, transaction: Transaction): js.Promise[String] = js.native
    def getTrustedInput(indexLookup: Double, transaction: Transaction, additionals: js.Array[String]): js.Promise[String] = js.native
    
    def getTrustedInputBIP143(indexLookup: Double, transaction: Transaction): String = js.native
    def getTrustedInputBIP143(indexLookup: Double, transaction: Transaction, additionals: js.Array[String]): String = js.native
    
    def getWalletPublicKey(path: String): js.Promise[BitcoinAddress] = js.native
    def getWalletPublicKey(path: String, opts: Boolean): js.Promise[BitcoinAddress] = js.native
    def getWalletPublicKey(path: String, opts: Format): js.Promise[BitcoinAddress] = js.native
    
    def serializeTransactionOutputs(t: Transaction): Buffer = js.native
    
    def signMessageNew(path: String, messageHex: String): js.Promise[R] = js.native
    
    def signP2SHTransaction(arg: SignP2SHTransactionArg): js.Promise[js.Array[String]] = js.native
    
    def splitTransaction(transactionHex: String): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean, hasExtraData: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Boolean,
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Boolean,
      hasExtraData: Unit,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Unit, hasExtraData: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Unit,
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Unit,
      hasExtraData: Unit,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Unit, hasTimestamp: Boolean): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Unit, hasTimestamp: Boolean, hasExtraData: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Unit,
      hasTimestamp: Boolean,
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Unit,
      hasTimestamp: Boolean,
      hasExtraData: Unit,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Unit, hasTimestamp: Unit, hasExtraData: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Unit,
      hasTimestamp: Unit,
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Unit,
      hasTimestamp: Unit,
      hasExtraData: Unit,
      additionals: js.Array[String]
    ): Transaction = js.native
    
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String]
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Boolean,
      overwinter: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Boolean,
      overwinter: Boolean,
      useTrustedInputForSegwit: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Boolean,
      overwinter: Unit,
      useTrustedInputForSegwit: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Unit,
      overwinter: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Unit,
      overwinter: Boolean,
      useTrustedInputForSegwit: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: Unit,
      overwinter: Unit,
      useTrustedInputForSegwit: Boolean
    ): js.Promise[Unit] = js.native
    
    def startUntrustedHashTransactionInputRaw(
      newTransaction: Boolean,
      firstRound: Boolean,
      transactionData: Buffer,
      additionals: js.Array[String]
    ): js.Promise[Buffer] = js.native
    def startUntrustedHashTransactionInputRaw(
      newTransaction: Boolean,
      firstRound: Boolean,
      transactionData: Buffer,
      additionals: js.Array[String],
      bip143: Boolean
    ): js.Promise[Buffer] = js.native
    def startUntrustedHashTransactionInputRaw(
      newTransaction: Boolean,
      firstRound: Boolean,
      transactionData: Buffer,
      additionals: js.Array[String],
      bip143: Boolean,
      overwinter: Boolean
    ): js.Promise[Buffer] = js.native
    def startUntrustedHashTransactionInputRaw(
      newTransaction: Boolean,
      firstRound: Boolean,
      transactionData: Buffer,
      additionals: js.Array[String],
      bip143: Unit,
      overwinter: Boolean
    ): js.Promise[Buffer] = js.native
  }
  
  trait CreateTransactionArg extends StObject {
    
    var additionals: js.UndefOr[js.Array[String]] = js.undefined
    
    var associatedKeysets: js.Array[String]
    
    var changePath: js.UndefOr[String] = js.undefined
    
    var expiryHeight: js.UndefOr[Buffer] = js.undefined
    
    var initialTimestamp: js.UndefOr[Double] = js.undefined
    
    var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]
    
    var lockTime: js.UndefOr[Double] = js.undefined
    
    var onDeviceSignatureGranted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDeviceSignatureRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDeviceStreaming: js.UndefOr[js.Function1[/* param0 */ Index, Unit]] = js.undefined
    
    var outputScriptHex: String
    
    var segwit: js.UndefOr[Boolean] = js.undefined
    
    var sigHashType: js.UndefOr[Double] = js.undefined
    
    var useTrustedInputForSegwit: js.UndefOr[Boolean] = js.undefined
  }
  object CreateTransactionArg {
    
    inline def apply(
      associatedKeysets: js.Array[String],
      inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
      outputScriptHex: String
    ): CreateTransactionArg = {
      val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTransactionArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTransactionArg] (val x: Self) extends AnyVal {
      
      inline def setAdditionals(value: js.Array[String]): Self = StObject.set(x, "additionals", value.asInstanceOf[js.Any])
      
      inline def setAdditionalsUndefined: Self = StObject.set(x, "additionals", js.undefined)
      
      inline def setAdditionalsVarargs(value: String*): Self = StObject.set(x, "additionals", js.Array(value*))
      
      inline def setAssociatedKeysets(value: js.Array[String]): Self = StObject.set(x, "associatedKeysets", value.asInstanceOf[js.Any])
      
      inline def setAssociatedKeysetsVarargs(value: String*): Self = StObject.set(x, "associatedKeysets", js.Array(value*))
      
      inline def setChangePath(value: String): Self = StObject.set(x, "changePath", value.asInstanceOf[js.Any])
      
      inline def setChangePathUndefined: Self = StObject.set(x, "changePath", js.undefined)
      
      inline def setExpiryHeight(value: Buffer): Self = StObject.set(x, "expiryHeight", value.asInstanceOf[js.Any])
      
      inline def setExpiryHeightUndefined: Self = StObject.set(x, "expiryHeight", js.undefined)
      
      inline def setInitialTimestamp(value: Double): Self = StObject.set(x, "initialTimestamp", value.asInstanceOf[js.Any])
      
      inline def setInitialTimestampUndefined: Self = StObject.set(x, "initialTimestamp", js.undefined)
      
      inline def setInputs(value: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: (js.Tuple4[Transaction, Double, String | Null, Double | Null])*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
      
      inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
      
      inline def setOnDeviceSignatureGranted(value: () => Unit): Self = StObject.set(x, "onDeviceSignatureGranted", js.Any.fromFunction0(value))
      
      inline def setOnDeviceSignatureGrantedUndefined: Self = StObject.set(x, "onDeviceSignatureGranted", js.undefined)
      
      inline def setOnDeviceSignatureRequested(value: () => Unit): Self = StObject.set(x, "onDeviceSignatureRequested", js.Any.fromFunction0(value))
      
      inline def setOnDeviceSignatureRequestedUndefined: Self = StObject.set(x, "onDeviceSignatureRequested", js.undefined)
      
      inline def setOnDeviceStreaming(value: /* param0 */ Index => Unit): Self = StObject.set(x, "onDeviceStreaming", js.Any.fromFunction1(value))
      
      inline def setOnDeviceStreamingUndefined: Self = StObject.set(x, "onDeviceStreaming", js.undefined)
      
      inline def setOutputScriptHex(value: String): Self = StObject.set(x, "outputScriptHex", value.asInstanceOf[js.Any])
      
      inline def setSegwit(value: Boolean): Self = StObject.set(x, "segwit", value.asInstanceOf[js.Any])
      
      inline def setSegwitUndefined: Self = StObject.set(x, "segwit", js.undefined)
      
      inline def setSigHashType(value: Double): Self = StObject.set(x, "sigHashType", value.asInstanceOf[js.Any])
      
      inline def setSigHashTypeUndefined: Self = StObject.set(x, "sigHashType", js.undefined)
      
      inline def setUseTrustedInputForSegwit(value: Boolean): Self = StObject.set(x, "useTrustedInputForSegwit", value.asInstanceOf[js.Any])
      
      inline def setUseTrustedInputForSegwitUndefined: Self = StObject.set(x, "useTrustedInputForSegwit", js.undefined)
    }
  }
  
  trait SignP2SHTransactionArg extends StObject {
    
    var associatedKeysets: js.Array[String]
    
    // [transaction, output_index, redeem script, optional sequence]
    var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]
    
    var lockTime: js.UndefOr[Double] = js.undefined
    
    var outputScriptHex: String
    
    var segwit: js.UndefOr[Boolean] = js.undefined
    
    var sigHashType: js.UndefOr[Double] = js.undefined
    
    var transactionVersion: js.UndefOr[Double] = js.undefined
  }
  object SignP2SHTransactionArg {
    
    inline def apply(
      associatedKeysets: js.Array[String],
      inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
      outputScriptHex: String
    ): SignP2SHTransactionArg = {
      val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignP2SHTransactionArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignP2SHTransactionArg] (val x: Self) extends AnyVal {
      
      inline def setAssociatedKeysets(value: js.Array[String]): Self = StObject.set(x, "associatedKeysets", value.asInstanceOf[js.Any])
      
      inline def setAssociatedKeysetsVarargs(value: String*): Self = StObject.set(x, "associatedKeysets", js.Array(value*))
      
      inline def setInputs(value: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: (js.Tuple4[Transaction, Double, String | Null, Double | Null])*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
      
      inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
      
      inline def setOutputScriptHex(value: String): Self = StObject.set(x, "outputScriptHex", value.asInstanceOf[js.Any])
      
      inline def setSegwit(value: Boolean): Self = StObject.set(x, "segwit", value.asInstanceOf[js.Any])
      
      inline def setSegwitUndefined: Self = StObject.set(x, "segwit", js.undefined)
      
      inline def setSigHashType(value: Double): Self = StObject.set(x, "sigHashType", value.asInstanceOf[js.Any])
      
      inline def setSigHashTypeUndefined: Self = StObject.set(x, "sigHashType", js.undefined)
      
      inline def setTransactionVersion(value: Double): Self = StObject.set(x, "transactionVersion", value.asInstanceOf[js.Any])
      
      inline def setTransactionVersionUndefined: Self = StObject.set(x, "transactionVersion", js.undefined)
    }
  }
  
  trait Transaction extends StObject {
    
    var extraData: js.UndefOr[Buffer] = js.undefined
    
    var inputs: js.Array[TransactionInput]
    
    var locktime: js.UndefOr[Buffer] = js.undefined
    
    var nExpiryHeight: js.UndefOr[Buffer] = js.undefined
    
    var nVersionGroupId: js.UndefOr[Buffer] = js.undefined
    
    var outputs: js.UndefOr[js.Array[TransactionOutput]] = js.undefined
    
    var timestamp: js.UndefOr[Buffer] = js.undefined
    
    var version: Buffer
    
    var witness: js.UndefOr[Buffer] = js.undefined
  }
  object Transaction {
    
    inline def apply(inputs: js.Array[TransactionInput], version: Buffer): Transaction = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      inline def setExtraData(value: Buffer): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setInputs(value: js.Array[TransactionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: TransactionInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setLocktime(value: Buffer): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      inline def setLocktimeUndefined: Self = StObject.set(x, "locktime", js.undefined)
      
      inline def setNExpiryHeight(value: Buffer): Self = StObject.set(x, "nExpiryHeight", value.asInstanceOf[js.Any])
      
      inline def setNExpiryHeightUndefined: Self = StObject.set(x, "nExpiryHeight", js.undefined)
      
      inline def setNVersionGroupId(value: Buffer): Self = StObject.set(x, "nVersionGroupId", value.asInstanceOf[js.Any])
      
      inline def setNVersionGroupIdUndefined: Self = StObject.set(x, "nVersionGroupId", js.undefined)
      
      inline def setOutputs(value: js.Array[TransactionOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: TransactionOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setTimestamp(value: Buffer): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: Buffer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWitness(value: Buffer): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      inline def setWitnessUndefined: Self = StObject.set(x, "witness", js.undefined)
    }
  }
  
  trait TransactionInput extends StObject {
    
    var prevout: Buffer
    
    var script: Buffer
    
    var sequence: Buffer
    
    var tree: js.UndefOr[Buffer] = js.undefined
  }
  object TransactionInput {
    
    inline def apply(prevout: Buffer, script: Buffer, sequence: Buffer): TransactionInput = {
      val __obj = js.Dynamic.literal(prevout = prevout.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionInput] (val x: Self) extends AnyVal {
      
      inline def setPrevout(value: Buffer): Self = StObject.set(x, "prevout", value.asInstanceOf[js.Any])
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Buffer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTree(value: Buffer): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  trait TransactionOutput extends StObject {
    
    var amount: Buffer
    
    var script: Buffer
  }
  object TransactionOutput {
    
    inline def apply(amount: Buffer, script: Buffer): TransactionOutput = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionOutput] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Buffer): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
}
