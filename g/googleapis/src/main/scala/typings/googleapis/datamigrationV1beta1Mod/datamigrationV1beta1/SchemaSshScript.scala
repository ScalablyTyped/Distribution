package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSshScript extends StObject {
  
  /**
    * The ssh configuration script.
    */
  var script: js.UndefOr[String | Null] = js.undefined
}
object SchemaSshScript {
  
  inline def apply(): SchemaSshScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSshScript]
  }
  
  extension [Self <: SchemaSshScript](x: Self) {
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
