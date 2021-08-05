package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkDelegateMod {
  
  @JSImport("@ionic/core/dist/types/utils/framework-delegate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachComponent(delegate: Unit, container: Element, component: ComponentRef): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(delegate: Unit, container: Element, component: ComponentRef, cssClasses: js.Array[String]): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(
    delegate: Unit,
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(
    delegate: Unit,
    container: Element,
    component: ComponentRef,
    cssClasses: Unit,
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(delegate: FrameworkDelegate, container: Element, component: ComponentRef): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String]
  ): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  inline def attachComponent(
    delegate: FrameworkDelegate,
    container: Element,
    component: ComponentRef,
    cssClasses: Unit,
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComponent")(delegate.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement]]
  
  inline def detachComponent(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("detachComponent")().asInstanceOf[js.Promise[Unit]]
  inline def detachComponent(delegate: Unit, element: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("detachComponent")(delegate.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def detachComponent(delegate: FrameworkDelegate): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("detachComponent")(delegate.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def detachComponent(delegate: FrameworkDelegate, element: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("detachComponent")(delegate.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
