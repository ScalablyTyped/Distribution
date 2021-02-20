package typings.ledgerhqHwAppBtc

import typings.ledgerhqHwAppBtc.anon.BitcoinAddress
import typings.ledgerhqHwAppBtc.anon.Format
import typings.ledgerhqHwAppBtc.anon.Index
import typings.ledgerhqHwAppBtc.anon.R
import typings.ledgerhqHwAppBtc.anon.TrustedInput
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ledgerhq/hw-app-btc", JSImport.Default)
  @js.native
  class default protected () extends AppBtc {
    def this(transport: typings.ledgerhqHwTransport.mod.default[String]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh
    - typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32
  */
  trait AddressFormat extends StObject
  object AddressFormat {
    
    @scala.inline
    def bech32: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32 = "bech32".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.bech32]
    
    @scala.inline
    def legacy: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy = "legacy".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.legacy]
    
    @scala.inline
    def p2sh: typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh = "p2sh".asInstanceOf[typings.ledgerhqHwAppBtc.ledgerhqHwAppBtcStrings.p2sh]
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
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: js.UndefOr[scala.Nothing],
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: Boolean
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: js.UndefOr[scala.Nothing], hasTimestamp: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: Boolean,
      hasExtraData: js.UndefOr[scala.Nothing],
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: Boolean,
      hasExtraData: Boolean
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: js.UndefOr[scala.Nothing],
      hasTimestamp: Boolean,
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: js.UndefOr[scala.Nothing],
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: Boolean
    ): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: js.UndefOr[scala.Nothing],
      hasExtraData: Boolean,
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Boolean,
      hasExtraData: js.UndefOr[scala.Nothing],
      additionals: js.Array[String]
    ): Transaction = js.native
    def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean, hasExtraData: Boolean): Transaction = js.native
    def splitTransaction(
      transactionHex: String,
      isSegwitSupported: Boolean,
      hasTimestamp: Boolean,
      hasExtraData: Boolean,
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
      bip143: js.UndefOr[scala.Nothing],
      overwinter: js.UndefOr[scala.Nothing],
      useTrustedInputForSegwit: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: js.UndefOr[scala.Nothing],
      overwinter: Boolean
    ): js.Promise[Unit] = js.native
    def startUntrustedHashTransactionInput(
      newTransaction: Boolean,
      transaction: Transaction,
      inputs: js.Array[TrustedInput],
      additionals: js.Array[String],
      bip143: js.UndefOr[scala.Nothing],
      overwinter: Boolean,
      useTrustedInputForSegwit: Boolean
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
      overwinter: js.UndefOr[scala.Nothing],
      useTrustedInputForSegwit: Boolean
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
      bip143: js.UndefOr[scala.Nothing],
      overwinter: Boolean
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
  }
  
  @js.native
  trait CreateTransactionArg extends StObject {
    
    var additionals: js.UndefOr[js.Array[String]] = js.native
    
    var associatedKeysets: js.Array[String] = js.native
    
    var changePath: js.UndefOr[String] = js.native
    
    var expiryHeight: js.UndefOr[Buffer] = js.native
    
    var initialTimestamp: js.UndefOr[Double] = js.native
    
    var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]] = js.native
    
    var lockTime: js.UndefOr[Double] = js.native
    
    var onDeviceSignatureGranted: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDeviceSignatureRequested: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onDeviceStreaming: js.UndefOr[js.Function1[/* hasProgressTotalIndex */ Index, Unit]] = js.native
    
    var outputScriptHex: String = js.native
    
    var segwit: js.UndefOr[Boolean] = js.native
    
    var sigHashType: js.UndefOr[Double] = js.native
    
    var useTrustedInputForSegwit: js.UndefOr[Boolean] = js.native
  }
  object CreateTransactionArg {
    
    @scala.inline
    def apply(
      associatedKeysets: js.Array[String],
      inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
      outputScriptHex: String
    ): CreateTransactionArg = {
      val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTransactionArg]
    }
    
    @scala.inline
    implicit class CreateTransactionArgMutableBuilder[Self <: CreateTransactionArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionals(value: js.Array[String]): Self = StObject.set(x, "additionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalsUndefined: Self = StObject.set(x, "additionals", js.undefined)
      
      @scala.inline
      def setAdditionalsVarargs(value: String*): Self = StObject.set(x, "additionals", js.Array(value :_*))
      
      @scala.inline
      def setAssociatedKeysets(value: js.Array[String]): Self = StObject.set(x, "associatedKeysets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedKeysetsVarargs(value: String*): Self = StObject.set(x, "associatedKeysets", js.Array(value :_*))
      
      @scala.inline
      def setChangePath(value: String): Self = StObject.set(x, "changePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangePathUndefined: Self = StObject.set(x, "changePath", js.undefined)
      
      @scala.inline
      def setExpiryHeight(value: Buffer): Self = StObject.set(x, "expiryHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryHeightUndefined: Self = StObject.set(x, "expiryHeight", js.undefined)
      
      @scala.inline
      def setInitialTimestamp(value: Double): Self = StObject.set(x, "initialTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTimestampUndefined: Self = StObject.set(x, "initialTimestamp", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: (js.Tuple4[Transaction, Double, String | Null, Double | Null])*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
      
      @scala.inline
      def setOnDeviceSignatureGranted(value: () => Unit): Self = StObject.set(x, "onDeviceSignatureGranted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeviceSignatureGrantedUndefined: Self = StObject.set(x, "onDeviceSignatureGranted", js.undefined)
      
      @scala.inline
      def setOnDeviceSignatureRequested(value: () => Unit): Self = StObject.set(x, "onDeviceSignatureRequested", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeviceSignatureRequestedUndefined: Self = StObject.set(x, "onDeviceSignatureRequested", js.undefined)
      
      @scala.inline
      def setOnDeviceStreaming(value: /* hasProgressTotalIndex */ Index => Unit): Self = StObject.set(x, "onDeviceStreaming", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeviceStreamingUndefined: Self = StObject.set(x, "onDeviceStreaming", js.undefined)
      
      @scala.inline
      def setOutputScriptHex(value: String): Self = StObject.set(x, "outputScriptHex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegwit(value: Boolean): Self = StObject.set(x, "segwit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegwitUndefined: Self = StObject.set(x, "segwit", js.undefined)
      
      @scala.inline
      def setSigHashType(value: Double): Self = StObject.set(x, "sigHashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigHashTypeUndefined: Self = StObject.set(x, "sigHashType", js.undefined)
      
      @scala.inline
      def setUseTrustedInputForSegwit(value: Boolean): Self = StObject.set(x, "useTrustedInputForSegwit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTrustedInputForSegwitUndefined: Self = StObject.set(x, "useTrustedInputForSegwit", js.undefined)
    }
  }
  
  @js.native
  trait SignP2SHTransactionArg extends StObject {
    
    var associatedKeysets: js.Array[String] = js.native
    
    // [transaction, output_index, redeem script, optional sequence]
    var inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]] = js.native
    
    var lockTime: js.UndefOr[Double] = js.native
    
    var outputScriptHex: String = js.native
    
    var segwit: js.UndefOr[Boolean] = js.native
    
    var sigHashType: js.UndefOr[Double] = js.native
    
    var transactionVersion: js.UndefOr[Double] = js.native
  }
  object SignP2SHTransactionArg {
    
    @scala.inline
    def apply(
      associatedKeysets: js.Array[String],
      inputs: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]],
      outputScriptHex: String
    ): SignP2SHTransactionArg = {
      val __obj = js.Dynamic.literal(associatedKeysets = associatedKeysets.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputScriptHex = outputScriptHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignP2SHTransactionArg]
    }
    
    @scala.inline
    implicit class SignP2SHTransactionArgMutableBuilder[Self <: SignP2SHTransactionArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociatedKeysets(value: js.Array[String]): Self = StObject.set(x, "associatedKeysets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedKeysetsVarargs(value: String*): Self = StObject.set(x, "associatedKeysets", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Array[js.Tuple4[Transaction, Double, String | Null, Double | Null]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: (js.Tuple4[Transaction, Double, String | Null, Double | Null])*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
      
      @scala.inline
      def setOutputScriptHex(value: String): Self = StObject.set(x, "outputScriptHex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegwit(value: Boolean): Self = StObject.set(x, "segwit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegwitUndefined: Self = StObject.set(x, "segwit", js.undefined)
      
      @scala.inline
      def setSigHashType(value: Double): Self = StObject.set(x, "sigHashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigHashTypeUndefined: Self = StObject.set(x, "sigHashType", js.undefined)
      
      @scala.inline
      def setTransactionVersion(value: Double): Self = StObject.set(x, "transactionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionVersionUndefined: Self = StObject.set(x, "transactionVersion", js.undefined)
    }
  }
  
  @js.native
  trait Transaction extends StObject {
    
    var extraData: js.UndefOr[Buffer] = js.native
    
    var inputs: js.Array[TransactionInput] = js.native
    
    var locktime: js.UndefOr[Buffer] = js.native
    
    var nExpiryHeight: js.UndefOr[Buffer] = js.native
    
    var nVersionGroupId: js.UndefOr[Buffer] = js.native
    
    var outputs: js.UndefOr[js.Array[TransactionOutput]] = js.native
    
    var timestamp: js.UndefOr[Buffer] = js.native
    
    var version: Buffer = js.native
    
    var witness: js.UndefOr[Buffer] = js.native
  }
  object Transaction {
    
    @scala.inline
    def apply(inputs: js.Array[TransactionInput], version: Buffer): Transaction = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraData(value: Buffer): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[TransactionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: TransactionInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setLocktime(value: Buffer): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocktimeUndefined: Self = StObject.set(x, "locktime", js.undefined)
      
      @scala.inline
      def setNExpiryHeight(value: Buffer): Self = StObject.set(x, "nExpiryHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNExpiryHeightUndefined: Self = StObject.set(x, "nExpiryHeight", js.undefined)
      
      @scala.inline
      def setNVersionGroupId(value: Buffer): Self = StObject.set(x, "nVersionGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNVersionGroupIdUndefined: Self = StObject.set(x, "nVersionGroupId", js.undefined)
      
      @scala.inline
      def setOutputs(value: js.Array[TransactionOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: TransactionOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: Buffer): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setVersion(value: Buffer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitness(value: Buffer): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessUndefined: Self = StObject.set(x, "witness", js.undefined)
    }
  }
  
  @js.native
  trait TransactionInput extends StObject {
    
    var prevout: Buffer = js.native
    
    var script: Buffer = js.native
    
    var sequence: Buffer = js.native
    
    var tree: js.UndefOr[Buffer] = js.native
  }
  object TransactionInput {
    
    @scala.inline
    def apply(prevout: Buffer, script: Buffer, sequence: Buffer): TransactionInput = {
      val __obj = js.Dynamic.literal(prevout = prevout.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionInput]
    }
    
    @scala.inline
    implicit class TransactionInputMutableBuilder[Self <: TransactionInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevout(value: Buffer): Self = StObject.set(x, "prevout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: Buffer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTree(value: Buffer): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  @js.native
  trait TransactionOutput extends StObject {
    
    var amount: Buffer = js.native
    
    var script: Buffer = js.native
  }
  object TransactionOutput {
    
    @scala.inline
    def apply(amount: Buffer, script: Buffer): TransactionOutput = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionOutput]
    }
    
    @scala.inline
    implicit class TransactionOutputMutableBuilder[Self <: TransactionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Buffer): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
}
