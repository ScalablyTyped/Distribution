package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialStateConfig extends StObject {
  
  /** The Key Database (db). */
  var dbs: js.UndefOr[js.Array[FileContentBuffer]] = js.native
  
  /** The forbidden key database (dbx). */
  var dbxs: js.UndefOr[js.Array[FileContentBuffer]] = js.native
  
  /** The Key Exchange Key (KEK). */
  var keks: js.UndefOr[js.Array[FileContentBuffer]] = js.native
  
  /** The Platform Key (PK). */
  var pk: js.UndefOr[FileContentBuffer] = js.native
}
object InitialStateConfig {
  
  @scala.inline
  def apply(): InitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialStateConfig]
  }
  
  @scala.inline
  implicit class InitialStateConfigMutableBuilder[Self <: InitialStateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbs(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "dbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbsUndefined: Self = StObject.set(x, "dbs", js.undefined)
    
    @scala.inline
    def setDbsVarargs(value: FileContentBuffer*): Self = StObject.set(x, "dbs", js.Array(value :_*))
    
    @scala.inline
    def setDbxs(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "dbxs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbxsUndefined: Self = StObject.set(x, "dbxs", js.undefined)
    
    @scala.inline
    def setDbxsVarargs(value: FileContentBuffer*): Self = StObject.set(x, "dbxs", js.Array(value :_*))
    
    @scala.inline
    def setKeks(value: js.Array[FileContentBuffer]): Self = StObject.set(x, "keks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeksUndefined: Self = StObject.set(x, "keks", js.undefined)
    
    @scala.inline
    def setKeksVarargs(value: FileContentBuffer*): Self = StObject.set(x, "keks", js.Array(value :_*))
    
    @scala.inline
    def setPk(value: FileContentBuffer): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
  }
}
