package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KoLiteActivityDefaultOptions extends StObject {
  
  var activityClass: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var inactiveClass: js.UndefOr[String] = js.undefined
}
object KoLiteActivityDefaultOptions {
  
  @scala.inline
  def apply(): KoLiteActivityDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoLiteActivityDefaultOptions]
  }
  
  @scala.inline
  implicit class KoLiteActivityDefaultOptionsMutableBuilder[Self <: KoLiteActivityDefaultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityClass(value: String): Self = StObject.set(x, "activityClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityClassUndefined: Self = StObject.set(x, "activityClass", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setInactiveClass(value: String): Self = StObject.set(x, "inactiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveClassUndefined: Self = StObject.set(x, "inactiveClass", js.undefined)
  }
}
