package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotGroupValueMetadata extends StObject {
  
  /**
    * True if the data corresponding to the value is collapsed.
    */
  var collapsed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The calculated value the metadata corresponds to. (Note that formulaValue is not valid, because the values will be calculated.)
    */
  var value: js.UndefOr[SchemaExtendedValue] = js.undefined
}
object SchemaPivotGroupValueMetadata {
  
  inline def apply(): SchemaPivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupValueMetadata]
  }
  
  extension [Self <: SchemaPivotGroupValueMetadata](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedNull: Self = StObject.set(x, "collapsed", null)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setValue(value: SchemaExtendedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
