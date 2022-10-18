package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyFooter extends StObject {
  
  var body: js.UndefOr[AlignBackground] = js.undefined
  
  var footer: js.UndefOr[ExtendFill] = js.undefined
  
  var header: js.UndefOr[VerticalAlign] = js.undefined
  
  var row: js.UndefOr[`36`] = js.undefined
}
object BodyFooter {
  
  inline def apply(): BodyFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyFooter]
  }
  
  extension [Self <: BodyFooter](x: Self) {
    
    inline def setBody(value: AlignBackground): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFooter(value: ExtendFill): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: VerticalAlign): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRow(value: `36`): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
