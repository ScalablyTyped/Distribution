package typings.ionicStorage

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Drivers {
    
    @JSImport("@ionic/storage", "Drivers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/storage", "Drivers.IndexedDB")
    @js.native
    def IndexedDB: String = js.native
    inline def IndexedDB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/storage", "Drivers.LocalStorage")
    @js.native
    def LocalStorage: String = js.native
    inline def LocalStorage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/storage", "Drivers.SecureStorage")
    @js.native
    def SecureStorage: String = js.native
    inline def SecureStorage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureStorage")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/storage", "Storage")
  @js.native
  /**
    * Create a new Storage instance using the order of drivers and any additional config
    * options to pass to LocalForage.
    *
    * Possible default driverOrder options are: ['indexeddb', 'localstorage'] and the
    * default is that exact ordering.
    *
    * When using Ionic Secure Storage (enterprise only), use ['ionicSecureStorage', 'indexeddb', 'localstorage'] to ensure
    * Secure Storage is used when available, or fall back to IndexedDB or LocalStorage on the web.
    */
  open class Storage () extends StObject {
    def this(config: StorageConfig) = this()
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _db: Any = js.native
    
    /* private */ var _secureStorageDriver: Any = js.native
    
    /* private */ var assertDb: Any = js.native
    
    /**
      * Clear the entire key value store. WARNING: HOT!
      * @returns Returns a promise that resolves when the store is cleared
      */
    def clear(): js.Promise[Unit] = js.native
    
    def create(): js.Promise[Storage] = js.native
    
    /**
      * Define a new Driver. Must be called before
      * initializing the database. Example:
      *
      * await storage.defineDriver(myDriver);
      * await storage.create();
      */
    def defineDriver(driver: Driver): js.Promise[Unit] = js.native
    
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
      iteratorCallback: js.Function3[/* value */ Any, /* key */ String, /* iterationNumber */ Number, Any]
    ): js.Promise[Unit] = js.native
    
    /**
      * Get the value associated with the given key.
      * @param key the key to identify this value
      * @returns Returns a promise with the value of the given key
      */
    def get(key: String): js.Promise[Any] = js.native
    
    /**
      * @returns Returns a promise that resolves with the keys in the store.
      */
    def keys(): js.Promise[js.Array[String]] = js.native
    
    /**
      * @returns Returns a promise that resolves with the number of keys stored.
      */
    def length(): js.Promise[Double] = js.native
    
    /**
      * Remove any value associated with this key.
      * @param key the key to identify this value
      * @returns Returns a promise that resolves when the value is removed
      */
    def remove(key: String): js.Promise[Any] = js.native
    
    /**
      * Set the value for the given key.
      * @param key the key to identify this value
      * @param value the value for this key
      * @returns Returns a promise that resolves when the key and value are set
      */
    def set(key: String, value: Any): js.Promise[Any] = js.native
    
    def setEncryptionKey(key: String): Unit = js.native
  }
  
  type Database = Any
  
  type Driver = Any
  
  trait StorageConfig extends StObject {
    
    var dbKey: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var driverOrder: js.UndefOr[js.Array[Driver]] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageConfig] (val x: Self) extends AnyVal {
      
      inline def setDbKey(value: String): Self = StObject.set(x, "dbKey", value.asInstanceOf[js.Any])
      
      inline def setDbKeyUndefined: Self = StObject.set(x, "dbKey", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDriverOrder(value: js.Array[Driver]): Self = StObject.set(x, "driverOrder", value.asInstanceOf[js.Any])
      
      inline def setDriverOrderUndefined: Self = StObject.set(x, "driverOrder", js.undefined)
      
      inline def setDriverOrderVarargs(value: Driver*): Self = StObject.set(x, "driverOrder", js.Array(value*))
      
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
