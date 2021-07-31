package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.CssClassMap
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("@ionic/core/dist/types/utils/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createColorClasses(color: Null, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  @scala.inline
  def createColorClasses(color: Unit, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  @scala.inline
  def createColorClasses(color: Color, cssClassMap: CssClassMap): CssClassMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createColorClasses")(color.asInstanceOf[js.Any], cssClassMap.asInstanceOf[js.Any])).asInstanceOf[CssClassMap]
  
  @scala.inline
  def getClassList(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")().asInstanceOf[js.Array[String]]
  @scala.inline
  def getClassList(classes: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def getClassList(classes: js.Array[js.UndefOr[String | Null]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassList")(classes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getClassMap(): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")().asInstanceOf[CssClassMap]
  @scala.inline
  def getClassMap(classes: String): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")(classes.asInstanceOf[js.Any]).asInstanceOf[CssClassMap]
  @scala.inline
  def getClassMap(classes: js.Array[String]): CssClassMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassMap")(classes.asInstanceOf[js.Any]).asInstanceOf[CssClassMap]
  
  @scala.inline
  def hostContext(selector: String, el: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hostContext")(selector.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def openURL(url: String, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: String, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: String, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: String, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: String, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: String, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Null, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Null, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Unit, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Event, direction: RouterDirection): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def openURL(url: Unit, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
