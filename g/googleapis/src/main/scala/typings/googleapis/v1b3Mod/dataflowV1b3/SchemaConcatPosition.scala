package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConcatPosition extends StObject {
  
  /**
    * Index of the inner source.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Position within the inner source.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
}
object SchemaConcatPosition {
  
  inline def apply(): SchemaConcatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConcatPosition]
  }
  
  extension [Self <: SchemaConcatPosition](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
