package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDumpFlag extends StObject {
  
  /**
    * The name of the flag
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the flag.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaDumpFlag {
  
  inline def apply(): SchemaDumpFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDumpFlag]
  }
  
  extension [Self <: SchemaDumpFlag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
