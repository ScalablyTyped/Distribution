package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var text: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in grommet.grommet/themes/base.DigitalTexts ]: {  size :string | undefined,   height :number | undefined}} */ js.Any
  ] = js.undefined
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setText(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in grommet.grommet/themes/base.DigitalTexts ]: {  size :string | undefined,   height :number | undefined}} */ js.Any
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
