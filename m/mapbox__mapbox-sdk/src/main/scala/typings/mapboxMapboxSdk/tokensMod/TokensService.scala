package typings.mapboxMapboxSdk.tokensMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensService extends js.Object {
  /**
    * Create a new temporary access token.
    * @param request
    */
  def createTemporaryToken(request: TemporaryTokenRequest): MapiRequest
  /**
    * Create a new access token.
    * @param request
    */
  def createToken(request: CreateTokenRequest): MapiRequest
  /**
    * Delete an access token.
    * @param request
    */
  def deleteToken(request: UpdateDeleteTokenRequest): MapiRequest
  /**
    * Get data about the client's access token.
    */
  def getToken(): MapiRequest
  /**
    * List your available scopes. Each item is a metadata object about the scope, not just the string scope.
    */
  def listScopes(): MapiRequest
  /**
    * List your access tokens.
    */
  def listTokens(): MapiRequest
  /**
    * Update an access token.
    * @param request
    */
  def updateToken(request: UpdateDeleteTokenRequest): MapiRequest
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
}

