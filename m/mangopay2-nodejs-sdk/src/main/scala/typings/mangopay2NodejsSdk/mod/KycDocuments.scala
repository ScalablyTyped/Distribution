package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You need to create document in order to upload pages on this document.
  *
  * 1. The KYC Document Object is a request to validate a required document. There is one request for one Type of document
  * 2. Upload a file through a Page. A document should get several pages
  * 3. Edit the object Document and set the Status field to "VALIDATION_ASKED" (instead of "CREATED")
  * 4. The demand is received by our team. The object is waiting for a "VALIDATED" status
  *
  * Note that you are not allowed to store KYC documents on your side unless you have permission from the approriate authorities in your country
  */
@JSImport("mangopay2-nodejs-sdk", "KycDocuments")
@js.native
class KycDocuments () extends StObject {
  
  /**
    * Creates temporary URLs where each page of a KYC document can be viewed.
    * @param documentId
    */
  def createKycDocumentConsult(data: String): js.Promise[_] = js.native
  /**
    * Creates temporary URLs where each page of a KYC document can be viewed.
    * @param documentId
    */
  def createKycDocumentConsult(data: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  /**
    * Creates temporary URLs where each page of a KYC document can be viewed.
    * @param documentId
    */
  def createKycDocumentConsult(
    data: String,
    callback: js.Function1[/* data */ WithResponse[_], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def createKycDocumentConsult(
    data: String,
    callback: js.Function1[/* data */ js.Any, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Creates temporary URLs where each page of a KYC document can be viewed.
    * @param documentId
    */
  def createKycDocumentConsult(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[_]] = js.native
  def createKycDocumentConsult(data: String, options: MethodOptionWithoutResponse): js.Promise[_] = js.native
  /**
    * Creates temporary URLs where each page of a KYC document can be viewed.
    * @param documentId
    */
  @JSName("createKycDocumentConsult")
  var createKycDocumentConsult_Original: MethodOverload[String, _] = js.native
  
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
