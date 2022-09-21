package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedColumn extends StObject {
  
  /**
    * Identifies this as a SavedColumn resource. Value: the fixed string doubleclicksearch#savedColumn.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the saved column.
    */
  var savedColumnName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of data this saved column will produce.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedColumn {
  
  inline def apply(): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumn]
  }
  
  extension [Self <: SchemaSavedColumn](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
    
    inline def setSavedColumnNameNull: Self = StObject.set(x, "savedColumnName", null)
    
    inline def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
