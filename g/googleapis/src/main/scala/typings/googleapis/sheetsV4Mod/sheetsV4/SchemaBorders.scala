package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBorders extends StObject {
  
  /**
    * The bottom border of the cell.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The left border of the cell.
    */
  var left: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The right border of the cell.
    */
  var right: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The top border of the cell.
    */
  var top: js.UndefOr[SchemaBorder] = js.undefined
}
object SchemaBorders {
  
  inline def apply(): SchemaBorders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBorders]
  }
  
  extension [Self <: SchemaBorders](x: Self) {
    
    inline def setBottom(value: SchemaBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: SchemaBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: SchemaBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: SchemaBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
