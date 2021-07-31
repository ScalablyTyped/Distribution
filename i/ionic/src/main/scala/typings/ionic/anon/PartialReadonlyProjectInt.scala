package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.ProjectIntegration>> */
trait PartialReadonlyProjectInt extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialReadonlyProjectInt {
  
  @scala.inline
  def apply(): PartialReadonlyProjectInt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyProjectInt]
  }
  
  @scala.inline
  implicit class PartialReadonlyProjectIntMutableBuilder[Self <: PartialReadonlyProjectInt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
