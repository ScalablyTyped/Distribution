package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasureList extends StObject {
  
  /**
    * Returns the caption of the measure list used when displaying the name of the measure list to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns an array of $.ig.Measure objects this measure list is grouping.
    *
    * @param value
    */
  def measures(value: js.Object): js.Array[_] = js.native
}
object MeasureList {
  
  @scala.inline
  def apply(caption: js.Object => String, measures: js.Object => js.Array[_]): MeasureList = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), measures = js.Any.fromFunction1(measures))
    __obj.asInstanceOf[MeasureList]
  }
  
  @scala.inline
  implicit class MeasureListMutableBuilder[Self <: MeasureList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: js.Object => String): Self = StObject.set(x, "caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasures(value: js.Object => js.Array[_]): Self = StObject.set(x, "measures", js.Any.fromFunction1(value))
  }
}
