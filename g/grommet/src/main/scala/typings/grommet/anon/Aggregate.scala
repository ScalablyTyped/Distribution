package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregate extends StObject {
  
  var aggregate: js.UndefOr[Boolean] = js.undefined
}
object Aggregate {
  
  inline def apply(): Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregate]
  }
  
  extension [Self <: Aggregate](x: Self) {
    
    inline def setAggregate(value: Boolean): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
  }
}
