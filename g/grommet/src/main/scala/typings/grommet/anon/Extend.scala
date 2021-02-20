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
trait Extend extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var font: js.UndefOr[js.Object] = js.native
  
  var level: js.UndefOr[`2`] = js.native
  
  var responsiveBreakpoint: js.UndefOr[String] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object Extend {
  
  @scala.inline
  def apply(): Extend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extend]
  }
  
  @scala.inline
  implicit class ExtendMutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setFont(value: js.Object): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLevel(value: `2`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setResponsiveBreakpoint(value: String): Self = StObject.set(x, "responsiveBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveBreakpointUndefined: Self = StObject.set(x, "responsiveBreakpoint", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
