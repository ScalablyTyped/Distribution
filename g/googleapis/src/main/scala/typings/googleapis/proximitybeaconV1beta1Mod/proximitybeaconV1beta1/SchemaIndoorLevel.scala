package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indoor level, a human-readable string as returned by Google Maps APIs,
  * useful to indicate which floor of a building a beacon is located on.
  */
trait SchemaIndoorLevel extends StObject {
  
  /**
    * The name of this level.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaIndoorLevel {
  
  inline def apply(): SchemaIndoorLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndoorLevel]
  }
  
  extension [Self <: SchemaIndoorLevel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
