package typings.materialAnimation

import typings.materialAnimation.typesMod.PrefixedCssPropertyName
import typings.materialAnimation.typesMod.PrefixedJsEventType
import typings.materialAnimation.typesMod.StandardCssPropertyName
import typings.materialAnimation.typesMod.StandardJsEventType
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = (^.asInstanceOf[js.Dynamic].applyDynamic("getCorrectEventName")(windowObj.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[StandardJsEventType | PrefixedJsEventType]
  
  @scala.inline
  def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = (^.asInstanceOf[js.Dynamic].applyDynamic("getCorrectPropertyName")(windowObj.asInstanceOf[js.Any], cssProperty.asInstanceOf[js.Any])).asInstanceOf[StandardCssPropertyName | PrefixedCssPropertyName]
}
