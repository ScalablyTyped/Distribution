package typings.idb.entryMod

import typings.idb.idbStrings.versionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDBCallbacks[DBTypes /* <: DBSchema | Any */] extends StObject {
  
  /**
    * Called if there are older versions of the database open on the origin, so this version cannot
    * open.
    */
  var blocked: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called if this connection is blocking a future version of the database from opening.
    */
  var blocking: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
    * @param transaction The transaction for this upgrade. This is useful if you need to get data
    * from other stores as part of a migration.
    */
  var upgrade: js.UndefOr[
    js.Function4[
      /* database */ IDBPDatabase[DBTypes], 
      /* oldVersion */ Double, 
      /* newVersion */ Double | Null, 
      /* transaction */ IDBPTransaction[DBTypes, js.Array[StoreNames[DBTypes]], versionchange], 
      Unit
    ]
  ] = js.undefined
}
object OpenDBCallbacks {
  
  inline def apply[DBTypes /* <: DBSchema | Any */](): OpenDBCallbacks[DBTypes] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDBCallbacks[DBTypes]]
  }
  
  extension [Self <: OpenDBCallbacks[?], DBTypes /* <: DBSchema | Any */](x: Self & OpenDBCallbacks[DBTypes]) {
    
    inline def setBlocked(value: () => Unit): Self = StObject.set(x, "blocked", js.Any.fromFunction0(value))
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setBlocking(value: () => Unit): Self = StObject.set(x, "blocking", js.Any.fromFunction0(value))
    
    inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
    
    inline def setTerminated(value: () => Unit): Self = StObject.set(x, "terminated", js.Any.fromFunction0(value))
    
    inline def setTerminatedUndefined: Self = StObject.set(x, "terminated", js.undefined)
    
    inline def setUpgrade(
      value: (/* database */ IDBPDatabase[DBTypes], /* oldVersion */ Double, /* newVersion */ Double | Null, /* transaction */ IDBPTransaction[DBTypes, js.Array[StoreNames[DBTypes]], versionchange]) => Unit
    ): Self = StObject.set(x, "upgrade", js.Any.fromFunction4(value))
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
  }
}
