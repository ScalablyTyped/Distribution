package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.uboDeclaration.UboDeclarationData
import typings.mangopay2NodejsSdk.mod.uboDeclaration.UpdateUboDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An UBO Declaration is an electronic version of the previous KYC document "Shareholder Declaration", in order to declare all the Ultimate Beneficial Owners of a BUSINESS-typed legal User
  * (ie the shareholders with >25% of capital or voting rights).
  *
  * 1. Create each Ultimate Beneficial Owner as a Natural User, who must have a "DECLARATIVE" Capacity.
  * 2. Create a new UBO Declaration for your legal user, and link every Ultimate Beneficial Owners created previously thanks to DeclaredUBOs.
  *  - This list can be empty if your legal user has no Ultimate Beneficial Owner, or no eligible one (ie. no Ultimate Beneficial Owner that owns more than 25% of this company).
  * 3. Edit the UBODeclaration object and set the Status field to "VALIDATION_ASKED" (instead of "CREATED")
  * 4. The demand is received by our team and once processed, it will either get a "VALIDATED" status, or "REFUSED" with more information provided in the RefusedReasonTypes parameter
  *
  * Note that UBO declarations are not yet a requirement for your user to be KYC verified and are optional at this stage
  */
@JSImport("mangopay2-nodejs-sdk", "UboDeclarations")
@js.native
class UboDeclarations () extends js.Object {
  /**
    * Retrieves a UBO declaration object from the API.
    * @param id
    * @param options
    */
  @JSName("get")
  var get_Original: MethodOverload[String, UboDeclarationData] = js.native
  /**
    * Updates a UBO declaration entity.
    * @param uboDeclaration Updated UBO declaration entity - must have ID
    * @param options
    */
  @JSName("update")
  var update_Original: MethodOverload[UpdateUboDeclaration, UboDeclarationData] = js.native
  /**
    * Retrieves a UBO declaration object from the API.
    * @param id
    * @param options
    */
  def get(data: String): js.Promise[UboDeclarationData] = js.native
  /**
    * Retrieves a UBO declaration object from the API.
    * @param id
    * @param options
    */
  def get(data: String, callback: js.Function1[/* data */ UboDeclarationData, Unit]): Unit = js.native
  /**
    * Retrieves a UBO declaration object from the API.
    * @param id
    * @param options
    */
  def get(
    data: String,
    callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def get(
    data: String,
    callback: js.Function1[/* data */ UboDeclarationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Retrieves a UBO declaration object from the API.
    * @param id
    * @param options
    */
  def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
  def get(data: String, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
  /**
    * Updates a UBO declaration entity.
    * @param uboDeclaration Updated UBO declaration entity - must have ID
    * @param options
    */
  def update(data: UpdateUboDeclaration): js.Promise[UboDeclarationData] = js.native
  /**
    * Updates a UBO declaration entity.
    * @param uboDeclaration Updated UBO declaration entity - must have ID
    * @param options
    */
  def update(data: UpdateUboDeclaration, callback: js.Function1[/* data */ UboDeclarationData, Unit]): Unit = js.native
  /**
    * Updates a UBO declaration entity.
    * @param uboDeclaration Updated UBO declaration entity - must have ID
    * @param options
    */
  def update(
    data: UpdateUboDeclaration,
    callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def update(
    data: UpdateUboDeclaration,
    callback: js.Function1[/* data */ UboDeclarationData, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  /**
    * Updates a UBO declaration entity.
    * @param uboDeclaration Updated UBO declaration entity - must have ID
    * @param options
    */
  def update(data: UpdateUboDeclaration, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
  def update(data: UpdateUboDeclaration, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
}

