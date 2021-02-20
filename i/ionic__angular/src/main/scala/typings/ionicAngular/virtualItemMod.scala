package typings.ionicAngular

import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import typings.ionicAngular.virtualUtilsMod.VirtualContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualItemMod {
  
  @JSImport("@ionic/angular/directives/virtual-scroll/virtual-item", "VirtualItem")
  @js.native
  class VirtualItem protected () extends StObject {
    def this(templateRef: TemplateRef[VirtualContext], viewContainer: ViewContainerRef) = this()
    
    var templateRef: TemplateRef[VirtualContext] = js.native
    
    var viewContainer: ViewContainerRef = js.native
  }
}
