package typings.keyvSqlite

import typings.keyv.mod.Store
import typings.keyvSqlite.keyvSqliteBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keyv/sqlite", JSImport.Namespace)
  @js.native
  class ^ () extends KeyvSqlite {
    def this(options: Options) = this()
  }
  
  @js.native
  trait KeyvSqlite
    extends EventEmitter
       with Store[js.UndefOr[String]] {
    
    var namespace: js.UndefOr[String] = js.native
    
    def set(key: String): js.Promise[js.Any] = js.native
    def set(key: String, value: String): js.Promise[js.Any] = js.native
    
    val ttlSupport: `false` = js.native
  }
  
  trait Options extends StObject {
    
    var busyTimeout: js.UndefOr[Double] = js.undefined
    
    var keySize: js.UndefOr[Double] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBusyTimeout(value: Double): Self = StObject.set(x, "busyTimeout", value.asInstanceOf[js.Any])
      
      inline def setBusyTimeoutUndefined: Self = StObject.set(x, "busyTimeout", js.undefined)
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      inline def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
