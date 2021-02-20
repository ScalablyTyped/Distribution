package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkDelegateMod {
  
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(delegate: js.UndefOr[scala.Nothing], container: Element, component: ComponentRef): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: js.UndefOr[scala.Nothing],
    container: Element,
    component: ComponentRef,
    cssClasses: js.UndefOr[scala.Nothing],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: js.UndefOr[scala.Nothing],
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String]
  ): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: js.UndefOr[scala.Nothing],
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(delegate: FrameworkDelegate, container: Element, component: ComponentRef): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: js.UndefOr[scala.Nothing],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String]
  ): js.Promise[HTMLElement] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "attachComponent")
  @js.native
  def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "detachComponent")
  @js.native
  def detachComponent(): js.Promise[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "detachComponent")
  @js.native
  def detachComponent(delegate: js.UndefOr[scala.Nothing], element: HTMLElement): js.Promise[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "detachComponent")
  @js.native
  def detachComponent(delegate: FrameworkDelegate): js.Promise[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", "detachComponent")
  @js.native
  def detachComponent(delegate: FrameworkDelegate, element: HTMLElement): js.Promise[Unit] = js.native
}
