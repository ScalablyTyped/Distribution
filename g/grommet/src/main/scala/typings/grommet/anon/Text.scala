package typings.grommet.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var text: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in grommet.grommet/themes/base.DigitalTexts ]: {  size :string | undefined,   height :number | undefined}}
    */ typings.grommet.grommetStrings.Text & TopLevel[Any]
  ] = js.undefined
}
object Text {
  
  inline def apply(): Text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setText(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in grommet.grommet/themes/base.DigitalTexts ]: {  size :string | undefined,   height :number | undefined}}
      */ typings.grommet.grommetStrings.Text & TopLevel[Any]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
