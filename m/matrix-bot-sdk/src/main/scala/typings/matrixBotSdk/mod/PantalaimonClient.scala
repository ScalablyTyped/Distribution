package typings.matrixBotSdk.mod

import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "PantalaimonClient")
@js.native
open class PantalaimonClient protected ()
  extends typings.matrixBotSdk.libPantalaimonClientMod.PantalaimonClient {
  /**
    * Creates a new PantalaimonClient class for interacting with Pantalaimon. The storage
    * provider given will also be used in the client.
    * @param {string} homeserverUrl The homeserver (Pantalaimon) URL to interact with.
    * @param {IStorageProvider} storageProvider The storage provider to back the client with.
    */
  def this(homeserverUrl: String, storageProvider: IStorageProvider) = this()
}
