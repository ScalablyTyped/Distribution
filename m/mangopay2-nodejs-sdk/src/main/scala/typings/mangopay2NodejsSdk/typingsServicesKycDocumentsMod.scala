package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsKycDocumentMod.kycDocument.KycDocumentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesKycDocumentsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/KycDocuments", "KycDocuments")
  @js.native
  open class KycDocuments () extends StObject {
    
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createKycDocumentConsult(data: String): js.Promise[Any] = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createKycDocumentConsult(data: String, callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createKycDocumentConsult(
      data: String,
      callback: js.Function1[/* data */ WithResponse[Any], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createKycDocumentConsult(data: String, callback: js.Function1[/* data */ Any, Unit], options: MethodOptionWithoutResponse): Unit = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    def createKycDocumentConsult(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[Any]] = js.native
    def createKycDocumentConsult(data: String, options: MethodOptionWithoutResponse): js.Promise[Any] = js.native
    /**
      * Creates temporary URLs where each page of a KYC document can be viewed.
      * @param documentId
      */
    @JSName("createKycDocumentConsult")
    var createKycDocumentConsult_Original: MethodOverload[String, Any] = js.native
    
    /**
      * Get KycDocument
      * @param kycDocumentId
      * @param options
      */
    def get(data: String): js.Promise[KycDocumentData] = js.native
    /**
      * Get KycDocument
      * @param kycDocumentId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ KycDocumentData, Unit]): Unit = js.native
    /**
      * Get KycDocument
      * @param kycDocumentId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[KycDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ KycDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get KycDocument
      * @param kycDocumentId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[KycDocumentData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[KycDocumentData] = js.native
    
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(): js.Promise[js.Array[KycDocumentData]] = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[KycDocumentData]) | (/* data */ WithResponse[js.Array[KycDocumentData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[KycDocumentData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ js.Array[KycDocumentData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[KycDocumentData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[KycDocumentData]] = js.native
    /**
      * Get all KycDocuments
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[KycDocumentData]] = js.native
    
    /**
      * Get KycDocument
      * @param kycDocumentId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, KycDocumentData] = js.native
  }
}
