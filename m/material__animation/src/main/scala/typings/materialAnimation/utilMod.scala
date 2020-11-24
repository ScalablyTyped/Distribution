package typings.materialAnimation

import typings.materialAnimation.typesMod.PrefixedCssPropertyName
import typings.materialAnimation.typesMod.PrefixedJsEventType
import typings.materialAnimation.typesMod.StandardCssPropertyName
import typings.materialAnimation.typesMod.StandardJsEventType
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/animation/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = js.native
  
  def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = js.native
}
