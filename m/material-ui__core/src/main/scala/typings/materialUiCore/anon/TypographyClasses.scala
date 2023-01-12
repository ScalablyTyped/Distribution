package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.always
import typings.materialUiCore.materialUiCoreStrings.hover
import typings.materialUiCore.materialUiCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyClasses extends StObject {
  
  var TypographyClasses: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps<'span', {}>['classes'] */ js.Any
  ] = js.undefined
  
  var underline: js.UndefOr[none | hover | always] = js.undefined
}
object TypographyClasses {
  
  inline def apply(): TypographyClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypographyClasses] (val x: Self) extends AnyVal {
    
    inline def setTypographyClasses(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/Typography/Typography.TypographyProps<'span', {}>['classes'] */ js.Any
    ): Self = StObject.set(x, "TypographyClasses", value.asInstanceOf[js.Any])
    
    inline def setTypographyClassesUndefined: Self = StObject.set(x, "TypographyClasses", js.undefined)
    
    inline def setUnderline(value: none | hover | always): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
