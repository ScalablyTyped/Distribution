package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionFlag extends StObject {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var setter: js.UndefOr[String] = js.native
}
object ExtensionFlag {
  
  @scala.inline
  def apply(): ExtensionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionFlag]
  }
  
  @scala.inline
  implicit class ExtensionFlagMutableBuilder[Self <: ExtensionFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setSetter(value: String): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
  }
}
