package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapMode extends StObject {
  
  def isActive(): Unit = js.native
}
object BootstrapMode {
  
  @scala.inline
  def apply(isActive: () => Unit): BootstrapMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[BootstrapMode]
  }
  
  @scala.inline
  implicit class BootstrapModeMutableBuilder[Self <: BootstrapMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsActive(value: () => Unit): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
  }
}
