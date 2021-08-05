package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase
import typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
import typings.libraCore.transactionPbMod.SignedTransaction
import typings.libraCore.vmErrorsPbMod.VMStatus
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionControlPbMod {
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
  @js.native
  class AdmissionControlStatus () extends Message {
    
    def getCode(): AdmissionControlStatusCode = js.native
    
    def getMessage(): String = js.native
    
    def setCode(value: AdmissionControlStatusCode): Unit = js.native
    
    def setMessage(value: String): Unit = js.native
  }
  /* static members */
  object AdmissionControlStatus {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: Uint8Array): AdmissionControlStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AdmissionControlStatus]
    
    inline def deserializeBinaryFromReader(message: AdmissionControlStatus, reader: BinaryReader): AdmissionControlStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AdmissionControlStatus]
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AdmissionControlStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AdmissionControlStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var code: AdmissionControlStatusCode
      
      var message: String
    }
    object AsObject {
      
      inline def apply(code: AdmissionControlStatusCode, message: String): AsObject = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setCode(value: AdmissionControlStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  sealed trait AdmissionControlStatusCode extends StObject
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatusCode")
  @js.native
  object AdmissionControlStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AdmissionControlStatusCode & Double] = js.native
    
    @js.native
    sealed trait ACCEPTED
      extends StObject
         with AdmissionControlStatusCode
    /* 0 */ val ACCEPTED: typings.libraCore.admissionControlPbMod.AdmissionControlStatusCode.ACCEPTED & Double = js.native
    
    @js.native
    sealed trait BLACKLISTED
      extends StObject
         with AdmissionControlStatusCode
    /* 1 */ val BLACKLISTED: typings.libraCore.admissionControlPbMod.AdmissionControlStatusCode.BLACKLISTED & Double = js.native
    
    @js.native
    sealed trait REJECTED
      extends StObject
         with AdmissionControlStatusCode
    /* 2 */ val REJECTED: typings.libraCore.admissionControlPbMod.AdmissionControlStatusCode.REJECTED & Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest")
  @js.native
  class SubmitTransactionRequest () extends Message {
    
    def clearSignedTxn(): Unit = js.native
    
    def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
    
    def hasSignedTxn(): Boolean = js.native
    
    def setSignedTxn(): Unit = js.native
    def setSignedTxn(value: SignedTransaction): Unit = js.native
  }
  /* static members */
  object SubmitTransactionRequest {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: Uint8Array): SubmitTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SubmitTransactionRequest]
    
    inline def deserializeBinaryFromReader(message: SubmitTransactionRequest, reader: BinaryReader): SubmitTransactionRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SubmitTransactionRequest]
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: SubmitTransactionRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: SubmitTransactionRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
    }
    object AsObject {
      
      inline def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setSignedTxn(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTxn", value.asInstanceOf[js.Any])
        
        inline def setSignedTxnUndefined: Self = StObject.set(x, "signedTxn", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
  @js.native
  class SubmitTransactionResponse () extends Message {
    
    def clearAcStatus(): Unit = js.native
    
    def clearMempoolStatus(): Unit = js.native
    
    def clearVmStatus(): Unit = js.native
    
    def getAcStatus(): js.UndefOr[AdmissionControlStatus] = js.native
    
    def getMempoolStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
    
    def getStatusCase(): StatusCase = js.native
    
    def getValidatorId(): Uint8Array | String = js.native
    
    def getValidatorId_asB64(): String = js.native
    
    def getValidatorId_asU8(): Uint8Array = js.native
    
    def getVmStatus(): js.UndefOr[VMStatus] = js.native
    
    def hasAcStatus(): Boolean = js.native
    
    def hasMempoolStatus(): Boolean = js.native
    
    def hasVmStatus(): Boolean = js.native
    
    def setAcStatus(): Unit = js.native
    def setAcStatus(value: AdmissionControlStatus): Unit = js.native
    
    def setMempoolStatus(): Unit = js.native
    def setMempoolStatus(value: MempoolAddTransactionStatus): Unit = js.native
    
    def setValidatorId(value: String): Unit = js.native
    def setValidatorId(value: Uint8Array): Unit = js.native
    
    def setVmStatus(): Unit = js.native
    def setVmStatus(value: VMStatus): Unit = js.native
  }
  /* static members */
  object SubmitTransactionResponse {
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait StatusCase extends StObject
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.StatusCase")
    @js.native
    object StatusCase extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[StatusCase & Double] = js.native
      
      @js.native
      sealed trait AC_STATUS
        extends StObject
           with StatusCase
      /* 2 */ val AC_STATUS: typings.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.AC_STATUS & Double = js.native
      
      @js.native
      sealed trait MEMPOOL_STATUS
        extends StObject
           with StatusCase
      /* 3 */ val MEMPOOL_STATUS: typings.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.MEMPOOL_STATUS & Double = js.native
      
      @js.native
      sealed trait STATUS_NOT_SET
        extends StObject
           with StatusCase
      /* 0 */ val STATUS_NOT_SET: typings.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.STATUS_NOT_SET & Double = js.native
      
      @js.native
      sealed trait VM_STATUS
        extends StObject
           with StatusCase
      /* 1 */ val VM_STATUS: typings.libraCore.admissionControlPbMod.SubmitTransactionResponse.StatusCase.VM_STATUS & Double = js.native
    }
    
    inline def deserializeBinary(bytes: Uint8Array): SubmitTransactionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SubmitTransactionResponse]
    
    inline def deserializeBinaryFromReader(message: SubmitTransactionResponse, reader: BinaryReader): SubmitTransactionResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SubmitTransactionResponse]
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: SubmitTransactionResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: SubmitTransactionResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var acStatus: js.UndefOr[typings.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject] = js.undefined
      
      var mempoolStatus: js.UndefOr[typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.undefined
      
      var validatorId: Uint8Array | String
      
      var vmStatus: js.UndefOr[typings.libraCore.vmErrorsPbMod.VMStatus.AsObject] = js.undefined
    }
    object AsObject {
      
      inline def apply(validatorId: Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(validatorId = validatorId.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setAcStatus(value: typings.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject): Self = StObject.set(x, "acStatus", value.asInstanceOf[js.Any])
        
        inline def setAcStatusUndefined: Self = StObject.set(x, "acStatus", js.undefined)
        
        inline def setMempoolStatus(value: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = StObject.set(x, "mempoolStatus", value.asInstanceOf[js.Any])
        
        inline def setMempoolStatusUndefined: Self = StObject.set(x, "mempoolStatus", js.undefined)
        
        inline def setValidatorId(value: Uint8Array | String): Self = StObject.set(x, "validatorId", value.asInstanceOf[js.Any])
        
        inline def setVmStatus(value: typings.libraCore.vmErrorsPbMod.VMStatus.AsObject): Self = StObject.set(x, "vmStatus", value.asInstanceOf[js.Any])
        
        inline def setVmStatusUndefined: Self = StObject.set(x, "vmStatus", js.undefined)
      }
    }
  }
}
