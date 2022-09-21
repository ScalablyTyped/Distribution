package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollisionGroup extends StObject {
  
  var ID: Double
  
  var predicate: js.UndefOr[js.Function1[/* key */ FeatureKey, Boolean]] = js.undefined
}
object CollisionGroup {
  
  inline def apply(ID: Double): CollisionGroup = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionGroup]
  }
  
  extension [Self <: CollisionGroup](x: Self) {
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: /* key */ FeatureKey => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
  }
}
