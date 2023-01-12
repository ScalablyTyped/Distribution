package typings.grommet.anon

import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xxlarge extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var large: js.UndefOr[MaxWidth] = js.undefined
  
  var medium: js.UndefOr[MaxWidth] = js.undefined
  
  var small: js.UndefOr[MaxWidth] = js.undefined
  
  var xlarge: js.UndefOr[MaxWidth] = js.undefined
  
  var xxlarge: js.UndefOr[MaxWidth] = js.undefined
}
object Xxlarge {
  
  inline def apply(): Xxlarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xxlarge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xxlarge] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setLarge(value: MaxWidth): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: MaxWidth): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: MaxWidth): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: MaxWidth): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    inline def setXxlarge(value: MaxWidth): Self = StObject.set(x, "xxlarge", value.asInstanceOf[js.Any])
    
    inline def setXxlargeUndefined: Self = StObject.set(x, "xxlarge", js.undefined)
  }
}
