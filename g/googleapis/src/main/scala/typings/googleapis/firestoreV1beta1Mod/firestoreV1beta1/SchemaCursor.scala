package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position in a query result set.
  */
trait SchemaCursor extends StObject {
  
  /**
    * If the position is just before or just after the given values, relative
    * to the sort order defined by the query.
    */
  var before: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The values that represent a position, in the order they appear in the
    * order by clause of a query.  Can contain fewer values than specified in
    * the order by clause.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaCursor {
  
  inline def apply(): SchemaCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCursor]
  }
  
  extension [Self <: SchemaCursor](x: Self) {
    
    inline def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setValues(value: js.Array[SchemaValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
