package typings.ionicStorage

import typings.angularCore.mod.InjectionToken
import typings.ionicStorage.anon.DbKey
import typings.localforage.LocalForage
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("@ionic/storage/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/storage/storage", "Storage")
  @js.native
  class Storage protected () extends StObject {
    /**
      * Create a new Storage instance using the order of drivers and any additional config
      * options to pass to LocalForage.
      *
      * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
      * default is that exact ordering.
      */
    def this(config: StorageConfig, platformId: js.Object) = this()
    
    /* private */ var _dbPromise: js.Any = js.native
    
    /* private */ var _driver: js.Any = js.native
    
    /** @hidden */
    /* private */ var _getDriverOrder: js.Any = js.native
    
    /**
      * Clear the entire key value store. WARNING: HOT!
      * @returns Returns a promise that resolves when the store is cleared
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Get the name of the driver being used.
      * @returns Name of the driver
      */
    def driver: String | Null = js.native
    
    /**
      * Iterate through each key,value pair.
      * @param iteratorCallback a callback of the form (value, key, iterationNumber)
      * @returns Returns a promise that resolves when the iteration has finished.
      */
    def forEach(
      iteratorCallback: js.Function3[/* value */ js.Any, /* key */ String, /* iterationNumber */ Number, js.Any]
    ): js.Promise[Unit] = js.native
    
    /**
      * Get the value associated with the given key.
      * @param key the key to identify this value
      * @returns Returns a promise with the value of the given key
      */
    def get(key: String): js.Promise[js.Any] = js.native
    
    /**
      * @returns Returns a promise that resolves with the keys in the store.
      */
    def keys(): js.Promise[js.Array[String]] = js.native
    
    /**
      * @returns Returns a promise that resolves with the number of keys stored.
      */
    def length(): js.Promise[Double] = js.native
    
    /* private */ var platformId: js.Any = js.native
    
    /**
      * Reflect the readiness of the store.
      * @returns Returns a promise that resolves when the store is ready
      */
    def ready(): js.Promise[LocalForage] = js.native
    
    /**
      * Remove any value associated with this key.
      * @param key the key to identify this value
      * @returns Returns a promise that resolves when the value is removed
      */
    def remove(key: String): js.Promise[js.Any] = js.native
    
    /**
      * Set the value for the given key.
      * @param key the key to identify this value
      * @param value the value for this key
      * @returns Returns a promise that resolves when the key and value are set
      */
    def set(key: String, value: js.Any): js.Promise[js.Any] = js.native
  }
  
  @JSImport("@ionic/storage/storage", "StorageConfigToken")
  @js.native
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  
  inline def getDefaultConfig(): DbKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConfig")().asInstanceOf[DbKey]
  
  inline def provideStorage(storageConfig: StorageConfig, platformID: js.Object): Storage = (^.asInstanceOf[js.Dynamic].applyDynamic("provideStorage")(storageConfig.asInstanceOf[js.Any], platformID.asInstanceOf[js.Any])).asInstanceOf[Storage]
  
  trait StorageConfig extends StObject {
    
    var dbKey: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var driverOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var storeName: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object StorageConfig {
    
    inline def apply(): StorageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageConfig]
    }
    
    extension [Self <: StorageConfig](x: Self) {
      
      inline def setDbKey(value: String): Self = StObject.set(x, "dbKey", value.asInstanceOf[js.Any])
      
      inline def setDbKeyUndefined: Self = StObject.set(x, "dbKey", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDriverOrder(value: js.Array[String]): Self = StObject.set(x, "driverOrder", value.asInstanceOf[js.Any])
      
      inline def setDriverOrderUndefined: Self = StObject.set(x, "driverOrder", js.undefined)
      
      inline def setDriverOrderVarargs(value: String*): Self = StObject.set(x, "driverOrder", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
