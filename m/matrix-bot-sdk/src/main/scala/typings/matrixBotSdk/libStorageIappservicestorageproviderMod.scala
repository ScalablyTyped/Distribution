package typings.matrixBotSdk

import typings.matrixBotSdk.libStorageIcryptostorageproviderMod.ICryptoStorageProvider
import typings.matrixBotSdk.libStorageIstorageproviderMod.IStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageIappservicestorageproviderMod {
  
  trait IAppserviceCryptoStorageProvider extends StObject {
    
    /**
      * Gets a storage provider to use for the given user ID.
      * @param {string} userId The user ID.
      * @returns {ICryptoStorageProvider} The storage provider.
      */
    def storageForUser(userId: String): ICryptoStorageProvider
  }
  object IAppserviceCryptoStorageProvider {
    
    inline def apply(storageForUser: String => ICryptoStorageProvider): IAppserviceCryptoStorageProvider = {
      val __obj = js.Dynamic.literal(storageForUser = js.Any.fromFunction1(storageForUser))
      __obj.asInstanceOf[IAppserviceCryptoStorageProvider]
    }
    
    extension [Self <: IAppserviceCryptoStorageProvider](x: Self) {
      
      inline def setStorageForUser(value: String => ICryptoStorageProvider): Self = StObject.set(x, "storageForUser", js.Any.fromFunction1(value))
    }
  }
  
  trait IAppserviceStorageProvider extends StObject {
    
    /**
      * Tracks a user ID as "registered".
      * @returns {Promise<any>|void} Resolves when complete.
      */
    def addRegisteredUser(userId: String): js.Promise[Any] | Unit
    
    /**
      * Determines if a transaction has been flagged as completed.
      * @param {string} transactionId The transaction ID to check.
      * @returns {boolean} True if the transaction has been completed. This may be a promise.
      */
    def isTransactionCompleted(transactionId: String): Boolean | js.Promise[Boolean]
    
    /**
      * Determines if a user ID is registered or not.
      * @returns {boolean|Promise<boolean>} True if registered. This may be a promise.
      */
    def isUserRegistered(userId: String): Boolean | js.Promise[Boolean]
    
    /**
      * Flags a transaction as completed.
      * @param {string} transactionId The transaction ID.
      * @returns {Promise<any>|void} Resolves when complete.
      */
    def setTransactionCompleted(transactionId: String): js.Promise[Any] | Unit
    
    /**
      * Gets a storage provider to use for the given user ID.
      * @param {string} userId The user ID.
      * @returns {ICryptoStorageProvider} The storage provider.
      */
    var storageForUser: js.UndefOr[js.Function1[/* userId */ String, IStorageProvider]] = js.undefined
  }
  object IAppserviceStorageProvider {
    
    inline def apply(
      addRegisteredUser: String => js.Promise[Any] | Unit,
      isTransactionCompleted: String => Boolean | js.Promise[Boolean],
      isUserRegistered: String => Boolean | js.Promise[Boolean],
      setTransactionCompleted: String => js.Promise[Any] | Unit
    ): IAppserviceStorageProvider = {
      val __obj = js.Dynamic.literal(addRegisteredUser = js.Any.fromFunction1(addRegisteredUser), isTransactionCompleted = js.Any.fromFunction1(isTransactionCompleted), isUserRegistered = js.Any.fromFunction1(isUserRegistered), setTransactionCompleted = js.Any.fromFunction1(setTransactionCompleted))
      __obj.asInstanceOf[IAppserviceStorageProvider]
    }
    
    extension [Self <: IAppserviceStorageProvider](x: Self) {
      
      inline def setAddRegisteredUser(value: String => js.Promise[Any] | Unit): Self = StObject.set(x, "addRegisteredUser", js.Any.fromFunction1(value))
      
      inline def setIsTransactionCompleted(value: String => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "isTransactionCompleted", js.Any.fromFunction1(value))
      
      inline def setIsUserRegistered(value: String => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "isUserRegistered", js.Any.fromFunction1(value))
      
      inline def setSetTransactionCompleted(value: String => js.Promise[Any] | Unit): Self = StObject.set(x, "setTransactionCompleted", js.Any.fromFunction1(value))
      
      inline def setStorageForUser(value: /* userId */ String => IStorageProvider): Self = StObject.set(x, "storageForUser", js.Any.fromFunction1(value))
      
      inline def setStorageForUserUndefined: Self = StObject.set(x, "storageForUser", js.undefined)
    }
  }
}
