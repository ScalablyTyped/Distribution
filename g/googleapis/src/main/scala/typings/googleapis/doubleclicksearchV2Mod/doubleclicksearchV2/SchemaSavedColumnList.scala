package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of saved columns. Advertisers create saved columns to report on
  * Floodlight activities, Google Analytics goals, or custom KPIs. To request
  * reports with saved columns, you&#39;ll need the saved column names that are
  * available from this list.
  */
trait SchemaSavedColumnList extends StObject {
  
  /**
    * The saved columns being requested.
    */
  var items: js.UndefOr[js.Array[SchemaSavedColumn]] = js.undefined
  
  /**
    * Identifies this as a SavedColumnList resource. Value: the fixed string
    * doubleclicksearch#savedColumnList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaSavedColumnList {
  
  inline def apply(): SchemaSavedColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumnList]
  }
  
  extension [Self <: SchemaSavedColumnList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaSavedColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSavedColumn*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
