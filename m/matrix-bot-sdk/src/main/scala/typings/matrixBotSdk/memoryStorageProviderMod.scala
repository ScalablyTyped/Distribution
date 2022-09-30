package typings.matrixBotSdk

import typings.matrixBotSdk.iappservicestorageproviderMod.IAppserviceStorageProvider
import typings.matrixBotSdk.istorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStorageProviderMod {
  
  @JSImport("matrix-bot-sdk/lib/storage/MemoryStorageProvider", "MemoryStorageProvider")
  @js.native
  open class MemoryStorageProvider ()
    extends StObject
       with IStorageProvider
       with IAppserviceStorageProvider {
    
    /**
      * Tracks a user ID as "registered".
      * @returns {Promise<any>|void} Resolves when complete.
      */
    /* CompleteClass */
    override def addRegisteredUser(userId: String): js.Promise[Any] | Unit = js.native
    
    /* private */ var appserviceTransactions: Any = js.native
    
    /* private */ var appserviceUsers: Any = js.native
    
    /* private */ var filter: Any = js.native
    
    /**
      * Determines if a transaction has been flagged as completed.
      * @param {string} transactionId The transaction ID to check.
      * @returns {boolean} True if the transaction has been completed. This may be a promise.
      */
    /* CompleteClass */
    override def isTransactionCompleted(transactionId: String): Boolean | js.Promise[Boolean] = js.native
    
    /**
      * Determines if a user ID is registered or not.
      * @returns {boolean|Promise<boolean>} True if registered. This may be a promise.
      */
    /* CompleteClass */
    override def isUserRegistered(userId: String): Boolean | js.Promise[Boolean] = js.native
    
    /* private */ var kvStore: Any = js.native
    
    /* private */ var namespaced: Any = js.native
    
    /**
      * Flags a transaction as completed.
      * @param {string} transactionId The transaction ID.
      * @returns {Promise<any>|void} Resolves when complete.
      */
    /* CompleteClass */
    override def setTransactionCompleted(transactionId: String): js.Promise[Any] | Unit = js.native
    
    @JSName("storageForUser")
    def storageForUser_MMemoryStorageProvider(userId: String): IStorageProvider = js.native
    
    /* private */ var syncToken: Any = js.native
  }
}
