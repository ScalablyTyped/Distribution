package typings.matrixBotSdk

import typings.matrixBotSdk.libIfilterMod.IFilterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageIstorageproviderMod {
  
  @js.native
  trait IStorageProvider extends StObject {
    
    /**
      * Gets the last preferred filter for this client
      * @returns {IFilterInfo|Promise<IFilterInfo>} The last saved filter, or null.
      * This can also be a promise for the filter.
      */
    def getFilter(): IFilterInfo | js.Promise[IFilterInfo] = js.native
    
    /**
      * Gets the last saved sync token, or null if none has been persisted.
      * @returns {String|Promise<String>} The last sync token, or null. This can
      * also be a promise for the value.
      */
    def getSyncToken(): String | (js.Promise[String | Null]) | Null = js.native
    
    /**
      * Reads a previously stored value under the given key. If the
      * key does not exist, null or undefined is returned.
      * @param {string} key The key to read.
      * @returns {string|Promise<string|null|undefined>|null|undefined} The
      * value, or null/undefined if not found. This may also return a promise
      * of those same values.
      */
    def readValue(key: String): js.UndefOr[String | (js.Promise[js.UndefOr[String | Null]]) | Null] = js.native
    
    /**
      * Sets the filter to be used by future clients
      * @param {IFilterInfo} filter The filter to store
      * @returns {Promise<any>|void} Resolves when complete.
      */
    def setFilter(filter: IFilterInfo): js.Promise[Any] | Unit = js.native
    
    /**
      * Sets the sync token, saving it for later retrieval
      * @param {string} token The token to save
      * @returns {Promise<any>|void} Resolves when complete.
      */
    def setSyncToken(): js.Promise[Any] | Unit = js.native
    def setSyncToken(token: String): js.Promise[Any] | Unit = js.native
    
    /**
      * Store a simple string value into the provided key.
      * @param {string} key The key to store the value under.
      * @param {string} value The value to store.
      * @returns {Promise<any> | void} Resolves when complete.
      */
    def storeValue(key: String, value: String): js.Promise[Any] | Unit = js.native
  }
}
