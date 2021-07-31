package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object LoaderOptions {
  
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  
  @scala.inline
  implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
