package typings.matrixBotSdk

import typings.matrixBotSdk.libStorageIappservicestorageproviderMod.IAppserviceStorageProvider
import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageSimpleFsStorageProviderMod {
  
  @JSImport("matrix-bot-sdk/lib/storage/SimpleFsStorageProvider", "SimpleFsStorageProvider")
  @js.native
  open class SimpleFsStorageProvider protected ()
    extends StObject
       with IStorageProvider
       with IAppserviceStorageProvider {
    /**
      * Creates a new simple file system storage provider.
      * @param {string} filename The file name (typically 'storage.json') to store data within.
      * @param {boolean} trackTransactionsInMemory True (default) to track all received appservice transactions rather than on disk.
      * @param {int} maxInMemoryTransactions The maximum number of transactions to hold in memory before rotating the oldest out. Defaults to 20.
      */
    def this(filename: String) = this()
    def this(filename: String, trackTransactionsInMemory: Boolean) = this()
    def this(filename: String, trackTransactionsInMemory: Boolean, maxInMemoryTransactions: Double) = this()
    def this(filename: String, trackTransactionsInMemory: Unit, maxInMemoryTransactions: Double) = this()
    
    /**
      * Tracks a user ID as "registered".
      * @returns {Promise<any>|void} Resolves when complete.
      */
    /* CompleteClass */
    override def addRegisteredUser(userId: String): js.Promise[Any] | Unit = js.native
    
    /* private */ var completedTransactions: Any = js.native
    
    /* private */ var db: Any = js.native
    
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
    
    /* private */ var maxInMemoryTransactions: Any = js.native
    
    /**
      * Flags a transaction as completed.
      * @param {string} transactionId The transaction ID.
      * @returns {Promise<any>|void} Resolves when complete.
      */
    /* CompleteClass */
    override def setTransactionCompleted(transactionId: String): js.Promise[Any] | Unit = js.native
    
    @JSName("storageForUser")
    def storageForUser_MSimpleFsStorageProvider(userId: String): IStorageProvider = js.native
    
    /* private */ var trackTransactionsInMemory: Any = js.native
  }
}
