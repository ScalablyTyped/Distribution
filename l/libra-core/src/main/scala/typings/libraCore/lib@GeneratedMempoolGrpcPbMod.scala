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
import typings.libraCore.`lib@GeneratedMempoolPbMod`.AddTransactionWithValidationRequest
import typings.libraCore.`lib@GeneratedMempoolPbMod`.AddTransactionWithValidationResponse
import typings.libraCore.`lib@GeneratedMempoolPbMod`.CommitTransactionsRequest
import typings.libraCore.`lib@GeneratedMempoolPbMod`.CommitTransactionsResponse
import typings.libraCore.`lib@GeneratedMempoolPbMod`.GetBlockRequest
import typings.libraCore.`lib@GeneratedMempoolPbMod`.GetBlockResponse
import typings.libraCore.`lib@GeneratedMempoolPbMod`.HealthCheckRequest
import typings.libraCore.`lib@GeneratedMempoolPbMod`.HealthCheckResponse
import typings.libraCore.anon.PartialCallOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedMempoolGrpcPbMod` {
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolClient")
  @js.native
  open class MempoolClient protected ()
    extends Client
       with IMempoolClient {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
  }
  
  @JSImport("libra-core/lib/@/generated/mempool_grpc_pb", "MempoolService")
  @js.native
  val MempoolService: IMempoolService = js.native
  
  @js.native
  trait IMempoolClient extends StObject {
    
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      metadata: Metadata,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    def addTransactionWithValidation(
      request: AddTransactionWithValidationRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[
          /* error */ ServiceError | Null, 
          /* response */ AddTransactionWithValidationResponse, 
          Unit
        ]
    ): ClientUnaryCall = js.native
    
    def commitTransactions(
      request: CommitTransactionsRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    def commitTransactions(
      request: CommitTransactionsRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    def commitTransactions(
      request: CommitTransactionsRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def getBlock(
      request: GetBlockRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    def getBlock(
      request: GetBlockRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    def getBlock(
      request: GetBlockRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
    ): ClientUnaryCall = js.native
    
    def healthCheck(
      request: HealthCheckRequest,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
    def healthCheck(
      request: HealthCheckRequest,
      metadata: Metadata,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
    def healthCheck(
      request: HealthCheckRequest,
      metadata: Metadata,
      options: PartialCallOptions,
      callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
    ): ClientUnaryCall = js.native
  }
  
  trait IMempoolServer extends StObject {
    
    def addTransactionWithValidation(
      call: ServerUnaryCall[AddTransactionWithValidationRequest],
      callback: sendUnaryData[AddTransactionWithValidationResponse]
    ): Unit
    @JSName("addTransactionWithValidation")
    var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse]
    
    def commitTransactions(
      call: ServerUnaryCall[CommitTransactionsRequest],
      callback: sendUnaryData[CommitTransactionsResponse]
    ): Unit
    @JSName("commitTransactions")
    var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse]
    
    def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit
    @JSName("getBlock")
    var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse]
    
    def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit
    @JSName("healthCheck")
    var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse]
  }
  object IMempoolServer {
    
    inline def apply(
      addTransactionWithValidation: (/* call */ ServerUnaryCall[AddTransactionWithValidationRequest], /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => Unit,
      commitTransactions: (/* call */ ServerUnaryCall[CommitTransactionsRequest], /* callback */ sendUnaryData[CommitTransactionsResponse]) => Unit,
      getBlock: (/* call */ ServerUnaryCall[GetBlockRequest], /* callback */ sendUnaryData[GetBlockResponse]) => Unit,
      healthCheck: (/* call */ ServerUnaryCall[HealthCheckRequest], /* callback */ sendUnaryData[HealthCheckResponse]) => Unit
    ): IMempoolServer = {
      val __obj = js.Dynamic.literal(addTransactionWithValidation = js.Any.fromFunction2(addTransactionWithValidation), commitTransactions = js.Any.fromFunction2(commitTransactions), getBlock = js.Any.fromFunction2(getBlock), healthCheck = js.Any.fromFunction2(healthCheck))
      __obj.asInstanceOf[IMempoolServer]
    }
    
    extension [Self <: IMempoolServer](x: Self) {
      
      inline def setAddTransactionWithValidation(
        value: (/* call */ ServerUnaryCall[AddTransactionWithValidationRequest], /* callback */ sendUnaryData[AddTransactionWithValidationResponse]) => Unit
      ): Self = StObject.set(x, "addTransactionWithValidation", js.Any.fromFunction2(value))
      
      inline def setCommitTransactions(
        value: (/* call */ ServerUnaryCall[CommitTransactionsRequest], /* callback */ sendUnaryData[CommitTransactionsResponse]) => Unit
      ): Self = StObject.set(x, "commitTransactions", js.Any.fromFunction2(value))
      
      inline def setGetBlock(
        value: (/* call */ ServerUnaryCall[GetBlockRequest], /* callback */ sendUnaryData[GetBlockResponse]) => Unit
      ): Self = StObject.set(x, "getBlock", js.Any.fromFunction2(value))
      
      inline def setHealthCheck(
        value: (/* call */ ServerUnaryCall[HealthCheckRequest], /* callback */ sendUnaryData[HealthCheckResponse]) => Unit
      ): Self = StObject.set(x, "healthCheck", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
  trait IMempoolService extends StObject {
    
    var addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation
    
    var commitTransactions: IMempoolServiceICommitTransactions
    
    var getBlock: IMempoolServiceIGetBlock
    
    var healthCheck: IMempoolServiceIHealthCheck
  }
  object IMempoolService {
    
    inline def apply(
      addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation,
      commitTransactions: IMempoolServiceICommitTransactions,
      getBlock: IMempoolServiceIGetBlock,
      healthCheck: IMempoolServiceIHealthCheck
    ): IMempoolService = {
      val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolService]
    }
    
    extension [Self <: IMempoolService](x: Self) {
      
      inline def setAddTransactionWithValidation(value: IMempoolServiceIAddTransactionWithValidation): Self = StObject.set(x, "addTransactionWithValidation", value.asInstanceOf[js.Any])
      
      inline def setCommitTransactions(value: IMempoolServiceICommitTransactions): Self = StObject.set(x, "commitTransactions", value.asInstanceOf[js.Any])
      
      inline def setGetBlock(value: IMempoolServiceIGetBlock): Self = StObject.set(x, "getBlock", value.asInstanceOf[js.Any])
      
      inline def setHealthCheck(value: IMempoolServiceIHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMempoolServiceIAddTransactionWithValidation
    extends StObject
       with MethodDefinition[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse]
  object IMempoolServiceIAddTransactionWithValidation {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => AddTransactionWithValidationRequest,
      requestSerialize: AddTransactionWithValidationRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => AddTransactionWithValidationResponse,
      responseSerialize: AddTransactionWithValidationResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIAddTransactionWithValidation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIAddTransactionWithValidation]
    }
  }
  
  trait IMempoolServiceICommitTransactions
    extends StObject
       with MethodDefinition[CommitTransactionsRequest, CommitTransactionsResponse]
  object IMempoolServiceICommitTransactions {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => CommitTransactionsRequest,
      requestSerialize: CommitTransactionsRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => CommitTransactionsResponse,
      responseSerialize: CommitTransactionsResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceICommitTransactions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceICommitTransactions]
    }
  }
  
  trait IMempoolServiceIGetBlock
    extends StObject
       with MethodDefinition[GetBlockRequest, GetBlockResponse]
  object IMempoolServiceIGetBlock {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => GetBlockRequest,
      requestSerialize: GetBlockRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => GetBlockResponse,
      responseSerialize: GetBlockResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIGetBlock = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIGetBlock]
    }
  }
  
  trait IMempoolServiceIHealthCheck
    extends StObject
       with MethodDefinition[HealthCheckRequest, HealthCheckResponse]
  object IMempoolServiceIHealthCheck {
    
    inline def apply(
      path: String,
      requestDeserialize: /* data */ Buffer => HealthCheckRequest,
      requestSerialize: HealthCheckRequest => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* data */ Buffer => HealthCheckResponse,
      responseSerialize: HealthCheckResponse => Buffer,
      responseStream: Boolean
    ): IMempoolServiceIHealthCheck = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMempoolServiceIHealthCheck]
    }
  }
}
