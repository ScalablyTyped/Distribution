package typings.lokijs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*------------------+
| PERSISTENCE       |
-------------------*/
/** there are two build in persistence adapters for internal use
  * fs             for use in Nodejs type environments
  * localStorage   for use in browser environment
  * defined as helper classes here so its easy and clean to use
  */
trait LokiPersistenceAdapter extends StObject {
  
  var deleteDatabase: js.UndefOr[
    js.Function2[
      /* dbnameOrOptions */ js.Any, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var exportDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbref */ Loki, 
      /* callback */ js.Function1[/* err */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  
  def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit
  
  var mode: js.UndefOr[String] = js.undefined
  
  var saveDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbstring */ js.Any, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}
object LokiPersistenceAdapter {
  
  inline def apply(loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): LokiPersistenceAdapter = {
    val __obj = js.Dynamic.literal(loadDatabase = js.Any.fromFunction2(loadDatabase))
    __obj.asInstanceOf[LokiPersistenceAdapter]
  }
  
  extension [Self <: LokiPersistenceAdapter](x: Self) {
    
    inline def setDeleteDatabase(
      value: (/* dbnameOrOptions */ js.Any, /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2(value))
    
    inline def setDeleteDatabaseUndefined: Self = StObject.set(x, "deleteDatabase", js.undefined)
    
    inline def setExportDatabase(
      value: (/* dbname */ String, /* dbref */ Loki, /* callback */ js.Function1[/* err */ Error | Null, Unit]) => Unit
    ): Self = StObject.set(x, "exportDatabase", js.Any.fromFunction3(value))
    
    inline def setExportDatabaseUndefined: Self = StObject.set(x, "exportDatabase", js.undefined)
    
    inline def setLoadDatabase(value: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction2(value))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSaveDatabase(
      value: (/* dbname */ String, /* dbstring */ js.Any, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3(value))
    
    inline def setSaveDatabaseUndefined: Self = StObject.set(x, "saveDatabase", js.undefined)
  }
}
