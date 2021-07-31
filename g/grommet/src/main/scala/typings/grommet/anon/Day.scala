package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var day: js.UndefOr[`14`] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var heading: js.UndefOr[`15`] = js.undefined
  
  var icons: js.UndefOr[Previous] = js.undefined
  
  var large: js.UndefOr[DaySize] = js.undefined
  
  var medium: js.UndefOr[DaySize] = js.undefined
  
  var small: js.UndefOr[DaySize] = js.undefined
}
object Day {
  
  @scala.inline
  def apply(): Day = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit class DayMutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: `14`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setHeading(value: `15`): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setIcons(value: Previous): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setLarge(value: DaySize): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: DaySize): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: DaySize): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
