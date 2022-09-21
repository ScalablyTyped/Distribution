package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDumpFlags extends StObject {
  
  /**
    * The flags for the initial dump.
    */
  var dumpFlags: js.UndefOr[js.Array[SchemaDumpFlag]] = js.undefined
}
object SchemaDumpFlags {
  
  inline def apply(): SchemaDumpFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDumpFlags]
  }
  
  extension [Self <: SchemaDumpFlags](x: Self) {
    
    inline def setDumpFlags(value: js.Array[SchemaDumpFlag]): Self = StObject.set(x, "dumpFlags", value.asInstanceOf[js.Any])
    
    inline def setDumpFlagsUndefined: Self = StObject.set(x, "dumpFlags", js.undefined)
    
    inline def setDumpFlagsVarargs(value: SchemaDumpFlag*): Self = StObject.set(x, "dumpFlags", js.Array(value*))
  }
}
