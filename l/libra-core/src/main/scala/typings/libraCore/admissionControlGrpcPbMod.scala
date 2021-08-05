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
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait IAdmissionControlServer extends StObject {
    
    def submitTransaction(
      call: ServerUnaryCall[SubmitTransactionRequest],
      callback: sendUnaryData[SubmitTransactionResponse]
    ): Unit
    @JSName("submitTransaction")
    var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse]
    
    def updateToLatestLedger(
      call: ServerUnaryCall[UpdateToLatestLedgerRequest],
      callback: sendUnaryData[UpdateToLatestLedgerResponse]
    ): Unit
    @JSName("updateToLatestLedger")
    var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse]
  }
  object IAdmissionControlServer {
    
    inline def apply(
      submitTransaction: (/* call */ ServerUnaryCall[SubmitTransactionRequest], /* callback */ sendUnaryData[SubmitTransactionResponse]) => Unit,
      updateToLatestLedger: (/* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => Unit
    ): IAdmissionControlServer = {
      val __obj = js.Dynamic.literal(submitTransaction = js.Any.fromFunction2(submitTransaction), updateToLatestLedger = js.Any.fromFunction2(updateToLatestLedger))
      __obj.asInstanceOf[IAdmissionControlServer]
    }
    
    extension [Self <: IAdmissionControlServer](x: Self) {
      
      inline def setSubmitTransaction(
        value: (/* call */ ServerUnaryCall[SubmitTransactionRequest], /* callback */ sendUnaryData[SubmitTransactionResponse]) => Unit
      ): Self = StObject.set(x, "submitTransaction", js.Any.fromFunction2(value))
      
      inline def setUpdateToLatestLedger(
        value: (/* call */ ServerUnaryCall[UpdateToLatestLedgerRequest], /* callback */ sendUnaryData[UpdateToLatestLedgerResponse]) => Unit
      ): Self = StObject.set(x, "updateToLatestLedger", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  trait IAdmissionControlService extends StObject {
    
    var submitTransaction: IAdmissionControlServiceISubmitTransaction
    
    var updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
  }
  object IAdmissionControlService {
    
    inline def apply(
      submitTransaction: IAdmissionControlServiceISubmitTransaction,
      updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
    ): IAdmissionControlService = {
      val __obj = js.Dynamic.literal(submitTransaction = submitTransaction.asInstanceOf[js.Any], updateToLatestLedger = updateToLatestLedger.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlService]
    }
    
    extension [Self <: IAdmissionControlService](x: Self) {
      
      inline def setSubmitTransaction(value: IAdmissionControlServiceISubmitTransaction): Self = StObject.set(x, "submitTransaction", value.asInstanceOf[js.Any])
      
      inline def setUpdateToLatestLedger(value: IAdmissionControlServiceIUpdateToLatestLedger): Self = StObject.set(x, "updateToLatestLedger", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAdmissionControlServiceISubmitTransaction
    extends StObject
       with MethodDefinition[SubmitTransactionRequest, SubmitTransactionResponse]
  object IAdmissionControlServiceISubmitTransaction {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => SubmitTransactionRequest,
      requestSerialize: SubmitTransactionRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => SubmitTransactionResponse,
      responseSerialize: SubmitTransactionResponse => Buffer,
      responseStream: Boolean
    ): IAdmissionControlServiceISubmitTransaction = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlServiceISubmitTransaction]
    }
  }
  
  trait IAdmissionControlServiceIUpdateToLatestLedger
    extends StObject
       with MethodDefinition[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse]
  object IAdmissionControlServiceIUpdateToLatestLedger {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => UpdateToLatestLedgerRequest,
      requestSerialize: UpdateToLatestLedgerRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => UpdateToLatestLedgerResponse,
      responseSerialize: UpdateToLatestLedgerResponse => Buffer,
      responseStream: Boolean
    ): IAdmissionControlServiceIUpdateToLatestLedger = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAdmissionControlServiceIUpdateToLatestLedger]
    }
  }
}
