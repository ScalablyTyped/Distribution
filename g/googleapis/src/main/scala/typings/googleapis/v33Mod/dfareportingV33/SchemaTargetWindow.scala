package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target Window.
  */
@js.native
trait SchemaTargetWindow extends StObject {
  
  /**
    * User-entered value.
    */
  var customHtml: js.UndefOr[String] = js.native
  
  /**
    * Type of browser window for which the backup image of the flash creative
    * can be displayed.
    */
  var targetWindowOption: js.UndefOr[String] = js.native
}
object SchemaTargetWindow {
  
  @scala.inline
  def apply(): SchemaTargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetWindow]
  }
  
  @scala.inline
  implicit class SchemaTargetWindowMutableBuilder[Self <: SchemaTargetWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHtml(value: String): Self = StObject.set(x, "customHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHtmlUndefined: Self = StObject.set(x, "customHtml", js.undefined)
    
    @scala.inline
    def setTargetWindowOption(value: String): Self = StObject.set(x, "targetWindowOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWindowOptionUndefined: Self = StObject.set(x, "targetWindowOption", js.undefined)
  }
}
