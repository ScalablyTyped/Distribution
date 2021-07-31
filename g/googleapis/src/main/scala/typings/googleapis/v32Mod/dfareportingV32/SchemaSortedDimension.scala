package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a sorted dimension.
  */
trait SchemaSortedDimension extends StObject {
  
  /**
    * The kind of resource this is, in this case dfareporting#sortedDimension.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An optional sort order for the dimension column.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SchemaSortedDimension {
  
  @scala.inline
  def apply(): SchemaSortedDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortedDimension]
  }
  
  @scala.inline
  implicit class SchemaSortedDimensionMutableBuilder[Self <: SchemaSortedDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
