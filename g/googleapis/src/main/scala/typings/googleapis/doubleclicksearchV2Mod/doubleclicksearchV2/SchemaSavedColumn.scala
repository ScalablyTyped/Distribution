package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A saved column
  */
trait SchemaSavedColumn extends StObject {
  
  /**
    * Identifies this as a SavedColumn resource. Value: the fixed string
    * doubleclicksearch#savedColumn.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the saved column.
    */
  var savedColumnName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data this saved column will produce.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSavedColumn {
  
  inline def apply(): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumn]
  }
  
  extension [Self <: SchemaSavedColumn](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
    
    inline def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
