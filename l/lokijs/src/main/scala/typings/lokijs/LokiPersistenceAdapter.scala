package typings.lokijs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*------------------+
| PERSISTENCE       |
-------------------*/
/** there are two build in persistence adapters for internal use
  * fs             for use in Nodejs type environments
  * localStorage   for use in browser environment
  * defined as helper classes here so its easy and clean to use
  */
@js.native
trait LokiPersistenceAdapter extends js.Object {
  
  var deleteDatabase: js.UndefOr[
    js.Function2[
      /* dbnameOrOptions */ js.Any, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  
  var exportDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbref */ Loki, 
      /* callback */ js.Function1[/* err */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  
  def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var saveDatabase: js.UndefOr[
    js.Function3[
      /* dbname */ String, 
      /* dbstring */ js.Any, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}
object LokiPersistenceAdapter {
  
  @scala.inline
  def apply(loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): LokiPersistenceAdapter = {
    val __obj = js.Dynamic.literal(loadDatabase = js.Any.fromFunction2(loadDatabase))
    __obj.asInstanceOf[LokiPersistenceAdapter]
  }
  
  @scala.inline
  implicit class LokiPersistenceAdapterOps[Self <: LokiPersistenceAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadDatabase(value: (String, js.Function1[/* value */ js.Any, Unit]) => Unit): Self = this.set("loadDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteDatabase(
      value: (/* dbnameOrOptions */ js.Any, /* callback */ js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("deleteDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeleteDatabase: Self = this.set("deleteDatabase", js.undefined)
    
    @scala.inline
    def setExportDatabase(
      value: (/* dbname */ String, /* dbref */ Loki, /* callback */ js.Function1[/* err */ Error | Null, Unit]) => Unit
    ): Self = this.set("exportDatabase", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExportDatabase: Self = this.set("exportDatabase", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSaveDatabase(
      value: (/* dbname */ String, /* dbstring */ js.Any, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("saveDatabase", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSaveDatabase: Self = this.set("saveDatabase", js.undefined)
  }
}
