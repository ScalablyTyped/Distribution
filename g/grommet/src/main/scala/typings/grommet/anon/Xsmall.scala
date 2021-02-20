package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xsmall extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var large: js.UndefOr[MaxWidth] = js.native
  
  var medium: js.UndefOr[MaxWidth] = js.native
  
  var small: js.UndefOr[MaxWidth] = js.native
  
  var xlarge: js.UndefOr[MaxWidth] = js.native
  
  var xsmall: js.UndefOr[MaxWidth] = js.native
  
  var xxlarge: js.UndefOr[MaxWidth] = js.native
}
object Xsmall {
  
  @scala.inline
  def apply(): Xsmall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xsmall]
  }
  
  @scala.inline
  implicit class XsmallMutableBuilder[Self <: Xsmall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setLarge(value: MaxWidth): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: MaxWidth): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: MaxWidth): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setXlarge(value: MaxWidth): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    @scala.inline
    def setXsmall(value: MaxWidth): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    
    @scala.inline
    def setXxlarge(value: MaxWidth): Self = StObject.set(x, "xxlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxlargeUndefined: Self = StObject.set(x, "xxlarge", js.undefined)
  }
}
