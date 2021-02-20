package typings.materialAnimation

import typings.materialAnimation.typesMod.PrefixedCssPropertyName
import typings.materialAnimation.typesMod.PrefixedJsEventType
import typings.materialAnimation.typesMod.StandardCssPropertyName
import typings.materialAnimation.typesMod.StandardJsEventType
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/animation/util", "getCorrectEventName")
  @js.native
  def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = js.native
  
  @JSImport("@material/animation/util", "getCorrectPropertyName")
  @js.native
  def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = js.native
}
