package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.WithResponse
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.DisputeDocumentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disputeDocumentsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/DisputeDocuments", "DisputeDocuments")
  @js.native
  open class DisputeDocuments () extends StObject {
    
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createDisputeDocumentConsult(data: String): js.Promise[Any] = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createDisputeDocumentConsult(data: String, callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createDisputeDocumentConsult(
      data: String,
      callback: js.Function1[/* data */ WithResponse[Any], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createDisputeDocumentConsult(data: String, callback: js.Function1[/* data */ Any, Unit], options: MethodOptionWithoutResponse): Unit = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createDisputeDocumentConsult(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[Any]] = js.native
    def createDisputeDocumentConsult(data: String, options: MethodOptionWithoutResponse): js.Promise[Any] = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    @JSName("createDisputeDocumentConsult")
    var createDisputeDocumentConsult_Original: MethodOverload[String, Any] = js.native
    
    /**
      * Get KycDocument
      * @param documentId
      * @param options
      */
    def get(data: String): js.Promise[DisputeDocumentData] = js.native
    /**
      * Get KycDocument
      * @param documentId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ DisputeDocumentData, Unit]): Unit = js.native
    /**
      * Get KycDocument
      * @param documentId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DisputeDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ DisputeDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get KycDocument
      * @param documentId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeDocumentData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[DisputeDocumentData] = js.native
    
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(): js.Promise[js.Array[DisputeDocumentData]] = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[DisputeDocumentData]) | (/* data */ WithResponse[js.Array[DisputeDocumentData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeDocumentData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ js.Array[DisputeDocumentData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeDocumentData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeDocumentData]] = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[DisputeDocumentData]] = js.native
    
    /**
      * Get KycDocument
      * @param documentId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, DisputeDocumentData] = js.native
  }
}
