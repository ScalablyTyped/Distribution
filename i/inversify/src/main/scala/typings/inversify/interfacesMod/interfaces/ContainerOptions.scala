package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerOptions extends StObject {
  
  var autoBindInjectable: js.UndefOr[Boolean] = js.native
  
  var defaultScope: js.UndefOr[BindingScope] = js.native
  
  var skipBaseClassChecks: js.UndefOr[Boolean] = js.native
}
object ContainerOptions {
  
  @scala.inline
  def apply(): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOptions]
  }
  
  @scala.inline
  implicit class ContainerOptionsMutableBuilder[Self <: ContainerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBindInjectable(value: Boolean): Self = StObject.set(x, "autoBindInjectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindInjectableUndefined: Self = StObject.set(x, "autoBindInjectable", js.undefined)
    
    @scala.inline
    def setDefaultScope(value: BindingScope): Self = StObject.set(x, "defaultScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultScopeUndefined: Self = StObject.set(x, "defaultScope", js.undefined)
    
    @scala.inline
    def setSkipBaseClassChecks(value: Boolean): Self = StObject.set(x, "skipBaseClassChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipBaseClassChecksUndefined: Self = StObject.set(x, "skipBaseClassChecks", js.undefined)
  }
}
