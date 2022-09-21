package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DumpFlag extends StObject {
  
  /** The name of the flag */
  var name: js.UndefOr[String] = js.undefined
  
  /** The value of the flag. */
  var value: js.UndefOr[String] = js.undefined
}
object DumpFlag {
  
  inline def apply(): DumpFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpFlag]
  }
  
  extension [Self <: DumpFlag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
