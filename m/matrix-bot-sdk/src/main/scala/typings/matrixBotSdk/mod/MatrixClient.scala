package typings.matrixBotSdk.mod

import typings.matrixBotSdk.libStorageIcryptostorageproviderMod.ICryptoStorageProvider
import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "MatrixClient")
@js.native
open class MatrixClient protected ()
  extends typings.matrixBotSdk.libMatrixClientMod.MatrixClient {
  /**
    * Creates a new matrix client
    * @param {string} homeserverUrl The homeserver's client-server API URL
    * @param {string} accessToken The access token for the homeserver
    * @param {IStorageProvider} storage The storage provider to use. Defaults to MemoryStorageProvider.
    * @param {ICryptoStorageProvider} cryptoStore Optional crypto storage provider to use. If not supplied,
    * end-to-end encryption will not be functional in this client.
    */
  def this(homeserverUrl: String, accessToken: String) = this()
  def this(homeserverUrl: String, accessToken: String, storage: IStorageProvider) = this()
  def this(homeserverUrl: String, accessToken: String, storage: Unit, cryptoStore: ICryptoStorageProvider) = this()
  def this(
    homeserverUrl: String,
    accessToken: String,
    storage: IStorageProvider,
    cryptoStore: ICryptoStorageProvider
  ) = this()
}
