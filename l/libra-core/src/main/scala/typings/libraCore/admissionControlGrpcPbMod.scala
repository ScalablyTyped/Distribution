package typings.libraCore

import typings.grpc.mod.ChannelCredentials
import typings.grpc.mod.Client
import typings.grpc.mod.ClientUnaryCall
import typings.grpc.mod.Metadata
import typings.grpc.mod.MethodDefinition
import typings.grpc.mod.ServerUnaryCall
import typings.grpc.mod.ServiceError
import typings.grpc.mod.handleUnaryCall
import typings.grpc.mod.sendUnaryData
import typings.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typings.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typings.libraCore.anon.PartialCallOptions
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admissionControlGrpcPbMod {
  
  @JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlClient")
  @js.native
  class AdmissionControlClient protected ()
    extends Client
       with IAdmissionControlClient {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
  }
  
  @JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlService")
  @js.native
  val AdmissionControlService: IAdmissionControlService = js.native
  
  @js.native
  trait IAdmissionControlClient extends StObject {
    
    def submitTransaction(
      request: SubmitTransactionRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    def submitTransaction(
      request: SubmitTransactionRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    def submitTransaction(
      request: SubmitTransactionRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
    def updateToLatestLedger(
      request: UpdateToLatestLedgerRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
    ): ClientUnaryCall = js.native
  }
  
  @js.native
  trait IAdmissionControlServer extends StObject {
    
    def submitTransaction(
      call: ServerUnaryCall[SubmitTransactionRequest],
      callback: sendUnaryData[SubmitTransactionResponse]
    ): Unit = js.native
    @JSName("submitTransaction")
    var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse] = js.native
    
    def updateToLatestLedger(
      call: ServerUnaryCall[UpdateToLatestLedgerRequest],
      callback: sendUnaryData[UpdateToLatestLedgerResponse]
    ): Unit = js.native
    @JSName("updateToLatestLedger")
    var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse] = js.native
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  @js.native
  trait IAdmissionControlService extends StObject {
    
    var submitTransaction: IAdmissionControlServiceISubmitTransaction = js.native
    
    var updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger = js.native
  }
  object IAdmissionControlService {
    
    @scala.inline
    def apply(
      submitTransaction: IAdmissionControlServiceISubmitTransaction,
      updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
    ): IAdmissionControlService = {
      val __obj = js.Dynamic.literal(submitTransaction = submitTransaction.asInstanceOf[js.Any], updateToLatestLedger = updateToLatestLedger.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlService]
    }
    
    @scala.inline
    implicit class IAdmissionControlServiceMutableBuilder[Self <: IAdmissionControlService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubmitTransaction(value: IAdmissionControlServiceISubmitTransaction): Self = StObject.set(x, "submitTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateToLatestLedger(value: IAdmissionControlServiceIUpdateToLatestLedger): Self = StObject.set(x, "updateToLatestLedger", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAdmissionControlServiceISubmitTransaction extends MethodDefinition[SubmitTransactionRequest, SubmitTransactionResponse]
  
  @js.native
  trait IAdmissionControlServiceIUpdateToLatestLedger extends MethodDefinition[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse]
}
