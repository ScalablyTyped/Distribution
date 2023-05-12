package typings.hyperformula.anon

import typings.hyperformula.hyperformulaStrings.asc
import typings.hyperformula.hyperformulaStrings.col
import typings.hyperformula.hyperformulaStrings.desc
import typings.hyperformula.hyperformulaStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchExactly extends StObject {
  
  var matchExactly: js.UndefOr[Boolean] = js.undefined
  
  var orderingDirection: asc | desc
  
  var searchCoordinate: row | col
}
object MatchExactly {
  
  inline def apply(orderingDirection: asc | desc, searchCoordinate: row | col): MatchExactly = {
    val __obj = js.Dynamic.literal(orderingDirection = orderingDirection.asInstanceOf[js.Any], searchCoordinate = searchCoordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchExactly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchExactly] (val x: Self) extends AnyVal {
    
    inline def setMatchExactly(value: Boolean): Self = StObject.set(x, "matchExactly", value.asInstanceOf[js.Any])
    
    inline def setMatchExactlyUndefined: Self = StObject.set(x, "matchExactly", js.undefined)
    
    inline def setOrderingDirection(value: asc | desc): Self = StObject.set(x, "orderingDirection", value.asInstanceOf[js.Any])
    
    inline def setSearchCoordinate(value: row | col): Self = StObject.set(x, "searchCoordinate", value.asInstanceOf[js.Any])
  }
}
