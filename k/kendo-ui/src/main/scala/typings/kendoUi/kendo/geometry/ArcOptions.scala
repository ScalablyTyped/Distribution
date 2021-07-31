package typings.kendoUi.kendo.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ArcOptions {
  
  @scala.inline
  def apply(): ArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcOptions]
  }
  
  @scala.inline
  implicit class ArcOptionsMutableBuilder[Self <: ArcOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
