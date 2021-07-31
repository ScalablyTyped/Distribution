package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a list of integers.
  */
trait SchemaIntegerList extends StObject {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[SchemaSplitInt64]] = js.undefined
}
object SchemaIntegerList {
  
  @scala.inline
  def apply(): SchemaIntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerList]
  }
  
  @scala.inline
  implicit class SchemaIntegerListMutableBuilder[Self <: SchemaIntegerList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[SchemaSplitInt64]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: SchemaSplitInt64*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
