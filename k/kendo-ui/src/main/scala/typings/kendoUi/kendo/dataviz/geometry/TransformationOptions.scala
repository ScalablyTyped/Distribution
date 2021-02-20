package typings.kendoUi.kendo.dataviz.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object TransformationOptions {
  
  @scala.inline
  def apply(): TransformationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformationOptions]
  }
  
  @scala.inline
  implicit class TransformationOptionsMutableBuilder[Self <: TransformationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
