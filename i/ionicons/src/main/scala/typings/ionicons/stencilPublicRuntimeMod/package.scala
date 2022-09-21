package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicons.anon.Ael
import typings.ionicons.stencilPublicRuntimeMod.^
import typings.std.ClassDecorator
import typings.std.HTMLElement
import typings.std.PropertyDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Build: UserBuildConditionals = ^.asInstanceOf[js.Dynamic].selectDynamic("Build").asInstanceOf[UserBuildConditionals]

inline def Component: ComponentDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Component").asInstanceOf[ComponentDecorator]

inline def Element: ElementDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Element").asInstanceOf[ElementDecorator]

inline def Event: EventDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Event").asInstanceOf[EventDecorator]

inline def Fragment: FunctionalComponent[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[FunctionalComponent[js.Object]]

inline def Host: FunctionalComponent[HostAttributes] = ^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[FunctionalComponent[HostAttributes]]

inline def Listen: ListenDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Listen").asInstanceOf[ListenDecorator]

inline def Method: MethodDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Method").asInstanceOf[MethodDecorator]

inline def Prop: PropDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Prop").asInstanceOf[PropDecorator]

inline def State: StateDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("State").asInstanceOf[StateDecorator]

inline def Watch: WatchDecorator = ^.asInstanceOf[js.Dynamic].selectDynamic("Watch").asInstanceOf[WatchDecorator]

inline def forceUpdate(ref: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getAssetPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getElement(ref: Any): HTMLStencilElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[HTMLStencilElement]

inline def getMode[T](ref: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]

inline def getRenderingRef(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[Any]

inline def readTask(task: RafCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setAssetPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("setAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def setErrorHandler(handler: ErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setMode(handler: ResolutionHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setPlatformHelpers(helpers: Ael): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformHelpers")(helpers.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def writeTask(task: RafCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ComponentDecorator = js.Function1[/* opts */ js.UndefOr[ComponentOptions], ClassDecorator]

type CustomMethodDecorator[T] = js.Function3[
/* target */ js.Object, 
/* propertyKey */ String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[T], 
TypedPropertyDescriptor[T] | Unit]

type ElementDecorator = js.Function0[PropertyDecorator]

type ErrorHandler = js.Function2[/* err */ Any, /* element */ js.UndefOr[HTMLElement], Unit]

type EventDecorator = js.Function1[/* opts */ js.UndefOr[EventOptions], PropertyDecorator]

type FunctionalComponent[T] = js.Function3[
/* props */ T, 
/* children */ js.Array[VNode], 
/* utils */ FunctionalUtilities, 
VNode | js.Array[VNode]]

type ListenDecorator = js.Function2[
/* eventName */ String, 
/* opts */ js.UndefOr[ListenOptions], 
CustomMethodDecorator[Any]]

type MethodDecorator = js.Function1[/* opts */ js.UndefOr[MethodOptions], CustomMethodDecorator[Any]]

type ModeStyles = StringDictionary[String | js.Array[String]]

type PropDecorator = js.Function1[/* opts */ js.UndefOr[PropOptions], PropertyDecorator]

type RafCallback = js.Function1[/* timeStamp */ Double, Unit]

type ResolutionHandler = js.Function1[/* elm */ HTMLElement, js.UndefOr[String | Null]]

type StateDecorator = js.Function0[PropertyDecorator]

type WatchDecorator = js.Function1[/* propName */ String, CustomMethodDecorator[Any]]
