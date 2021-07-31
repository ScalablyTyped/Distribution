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
  
  @scala.inline
  def apply(): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumn]
  }
  
  @scala.inline
  implicit class SchemaSavedColumnMutableBuilder[Self <: SchemaSavedColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSavedColumnName(value: String): Self = StObject.set(x, "savedColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedColumnNameUndefined: Self = StObject.set(x, "savedColumnName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
