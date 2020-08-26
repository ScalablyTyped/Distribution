package typings.mapboxMapboxSdk.tokensMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensService extends js.Object {
  /**
    * Create a new temporary access token.
    * @param request
    */
  def createTemporaryToken(request: TemporaryTokenRequest): MapiRequest = js.native
  /**
    * Create a new access token.
    * @param request
    */
  def createToken(request: CreateTokenRequest): MapiRequest = js.native
  /**
    * Delete an access token.
    * @param request
    */
  def deleteToken(request: UpdateDeleteTokenRequest): MapiRequest = js.native
  /**
    * Get data about the client's access token.
    */
  def getToken(): MapiRequest = js.native
  /**
    * List your available scopes. Each item is a metadata object about the scope, not just the string scope.
    */
  def listScopes(): MapiRequest = js.native
  /**
    * List your access tokens.
    */
  def listTokens(): MapiRequest = js.native
  /**
    * Update an access token.
    * @param request
    */
  def updateToken(request: UpdateDeleteTokenRequest): MapiRequest = js.native
}

object TokensService {
  @scala.inline
  def apply(
    createTemporaryToken: TemporaryTokenRequest => MapiRequest,
    createToken: CreateTokenRequest => MapiRequest,
    deleteToken: UpdateDeleteTokenRequest => MapiRequest,
    getToken: () => MapiRequest,
    listScopes: () => MapiRequest,
    listTokens: () => MapiRequest,
    updateToken: UpdateDeleteTokenRequest => MapiRequest
  ): TokensService = {
    val __obj = js.Dynamic.literal(createTemporaryToken = js.Any.fromFunction1(createTemporaryToken), createToken = js.Any.fromFunction1(createToken), deleteToken = js.Any.fromFunction1(deleteToken), getToken = js.Any.fromFunction0(getToken), listScopes = js.Any.fromFunction0(listScopes), listTokens = js.Any.fromFunction0(listTokens), updateToken = js.Any.fromFunction1(updateToken))
    __obj.asInstanceOf[TokensService]
  }
  @scala.inline
  implicit class TokensServiceOps[Self <: TokensService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateTemporaryToken(value: TemporaryTokenRequest => MapiRequest): Self = this.set("createTemporaryToken", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateToken(value: CreateTokenRequest => MapiRequest): Self = this.set("createToken", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteToken(value: UpdateDeleteTokenRequest => MapiRequest): Self = this.set("deleteToken", js.Any.fromFunction1(value))
    @scala.inline
    def setGetToken(value: () => MapiRequest): Self = this.set("getToken", js.Any.fromFunction0(value))
    @scala.inline
    def setListScopes(value: () => MapiRequest): Self = this.set("listScopes", js.Any.fromFunction0(value))
    @scala.inline
    def setListTokens(value: () => MapiRequest): Self = this.set("listTokens", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateToken(value: UpdateDeleteTokenRequest => MapiRequest): Self = this.set("updateToken", js.Any.fromFunction1(value))
  }
  
}

