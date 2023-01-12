package typings.idb.buildEntryMod

import typings.idb.idbStrings.versionchange
import typings.std.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDBCallbacks[DBTypes /* <: DBSchema | Any */] extends StObject {
  
  /**
    * Called if there are older versions of the database open on the origin, so this version cannot
    * open.
    *
    * @param currentVersion Version of the database that's blocking this one.
    * @param blockedVersion The version of the database being blocked (whatever version you provided to `openDB`).
    * @param event The event object for the associated `blocked` event.
    */
  var blocked: js.UndefOr[
    js.Function3[
      /* currentVersion */ Double, 
      /* blockedVersion */ Double | Null, 
      /* event */ IDBVersionChangeEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Called if this connection is blocking a future version of the database from opening.
    *
    * @param currentVersion Version of the open database (whatever version you provided to `openDB`).
    * @param blockedVersion The version of the database that's being blocked.
    * @param event The event object for the associated `versionchange` event.
    */
  var blocking: js.UndefOr[
    js.Function3[
      /* currentVersion */ Double, 
      /* blockedVersion */ Double | Null, 
      /* event */ IDBVersionChangeEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Called if the browser abnormally terminates the connection.
    * This is not called when `db.close()` is called.
    */
  var terminated: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called if this version of the database has never been opened before. Use it to specify the
    * schema for the database.
    *
    * @param database A database instance that you can use to add/remove stores and indexes.
    * @param oldVersion Last version of the database opened by the user.
    * @param newVersion Whatever new version you provided.
    * @param transaction The transaction for this upgrade.
    * This is useful if you need to get data from other stores as part of a migration.
    * @param event The event object for the associated 'upgradeneeded' event.
    */
  var upgrade: js.UndefOr[
    js.Function5[
      /* database */ IDBPDatabase[DBTypes], 
      /* oldVersion */ Double, 
      /* newVersion */ Double | Null, 
      /* transaction */ IDBPTransaction[DBTypes, js.Array[StoreNames[DBTypes]], versionchange], 
      /* event */ IDBVersionChangeEvent, 
      Unit
    ]
  ] = js.undefined
}
object OpenDBCallbacks {
  
  inline def apply[DBTypes /* <: DBSchema | Any */](): OpenDBCallbacks[DBTypes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDBCallbacks[DBTypes]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenDBCallbacks[?], DBTypes /* <: DBSchema | Any */] (val x: Self & OpenDBCallbacks[DBTypes]) extends AnyVal {
    
    inline def setBlocked(
      value: (/* currentVersion */ Double, /* blockedVersion */ Double | Null, /* event */ IDBVersionChangeEvent) => Unit
    ): Self = StObject.set(x, "blocked", js.Any.fromFunction3(value))
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setBlocking(
      value: (/* currentVersion */ Double, /* blockedVersion */ Double | Null, /* event */ IDBVersionChangeEvent) => Unit
    ): Self = StObject.set(x, "blocking", js.Any.fromFunction3(value))
    
    inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
    
    inline def setTerminated(value: () => Unit): Self = StObject.set(x, "terminated", js.Any.fromFunction0(value))
    
    inline def setTerminatedUndefined: Self = StObject.set(x, "terminated", js.undefined)
    
    inline def setUpgrade(
      value: (/* database */ IDBPDatabase[DBTypes], /* oldVersion */ Double, /* newVersion */ Double | Null, /* transaction */ IDBPTransaction[DBTypes, js.Array[StoreNames[DBTypes]], versionchange], /* event */ IDBVersionChangeEvent) => Unit
    ): Self = StObject.set(x, "upgrade", js.Any.fromFunction5(value))
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
  }
}
