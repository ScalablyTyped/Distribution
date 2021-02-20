package typings.kendoUi.kendo.dataviz.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object PointOptions {
  
  @scala.inline
  def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  
  @scala.inline
  implicit class PointOptionsMutableBuilder[Self <: PointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
