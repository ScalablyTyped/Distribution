package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DumpFlags extends StObject {
  
  /** The flags for the initial dump. */
  var dumpFlags: js.UndefOr[js.Array[DumpFlag]] = js.undefined
}
object DumpFlags {
  
  inline def apply(): DumpFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DumpFlags] (val x: Self) extends AnyVal {
    
    inline def setDumpFlags(value: js.Array[DumpFlag]): Self = StObject.set(x, "dumpFlags", value.asInstanceOf[js.Any])
    
    inline def setDumpFlagsUndefined: Self = StObject.set(x, "dumpFlags", js.undefined)
    
    inline def setDumpFlagsVarargs(value: DumpFlag*): Self = StObject.set(x, "dumpFlags", js.Array(value*))
  }
}
