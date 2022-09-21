package typings.grommet.anon

import typings.grommet.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnName extends StObject {
  
  var column: js.UndefOr[`7`] = js.undefined
  
  var name: js.UndefOr[TextProps] = js.undefined
  
  var value: js.UndefOr[TextProps] = js.undefined
}
object ColumnName {
  
  inline def apply(): ColumnName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnName]
  }
  
  extension [Self <: ColumnName](x: Self) {
    
    inline def setColumn(value: `7`): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setName(value: TextProps): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: TextProps): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
