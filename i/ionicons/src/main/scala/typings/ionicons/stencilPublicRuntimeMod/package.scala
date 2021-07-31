package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Build: typings.ionicons.stencilPublicRuntimeMod.UserBuildConditionals = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Build").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.UserBuildConditionals]

@scala.inline
def Component: typings.ionicons.stencilPublicRuntimeMod.ComponentDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Component").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.ComponentDecorator]

@scala.inline
def Element: typings.ionicons.stencilPublicRuntimeMod.ElementDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Element").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.ElementDecorator]

@scala.inline
def Event: typings.ionicons.stencilPublicRuntimeMod.EventDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Event").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.EventDecorator]

@scala.inline
def Host: typings.ionicons.stencilPublicRuntimeMod.FunctionalComponent[typings.ionicons.stencilPublicRuntimeMod.HostAttributes] = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.FunctionalComponent[typings.ionicons.stencilPublicRuntimeMod.HostAttributes]]

@scala.inline
def Listen: typings.ionicons.stencilPublicRuntimeMod.ListenDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Listen").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.ListenDecorator]

@scala.inline
def Method: typings.ionicons.stencilPublicRuntimeMod.MethodDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Method").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.MethodDecorator]

@scala.inline
def Prop: typings.ionicons.stencilPublicRuntimeMod.PropDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Prop").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.PropDecorator]

@scala.inline
def State: typings.ionicons.stencilPublicRuntimeMod.StateDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("State").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.StateDecorator]

@scala.inline
def Watch: typings.ionicons.stencilPublicRuntimeMod.WatchDecorator = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Watch").asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.WatchDecorator]

@scala.inline
def forceUpdate(ref: js.Any): scala.Unit = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def getAssetPath(path: java.lang.String): java.lang.String = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def getElement(ref: js.Any): typings.ionicons.stencilPublicRuntimeMod.HTMLStencilElement = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[typings.ionicons.stencilPublicRuntimeMod.HTMLStencilElement]

@scala.inline
def getMode[T](ref: js.Any): T = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]

@scala.inline
def getRenderingRef(): js.Any = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[js.Any]

@scala.inline
def readTask(task: typings.ionicons.stencilPublicRuntimeMod.RafCallback): scala.Unit = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def setMode(handler: typings.ionicons.stencilPublicRuntimeMod.ResolutionHandler): scala.Unit = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def writeTask(task: typings.ionicons.stencilPublicRuntimeMod.RafCallback): scala.Unit = typings.ionicons.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

type ComponentDecorator = js.Function1[
/* opts */ js.UndefOr[typings.ionicons.stencilPublicRuntimeMod.ComponentOptions], 
typings.std.ClassDecorator]

type CustomMethodDecorator[T] = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ typings.std.TypedPropertyDescriptor[T], 
typings.std.TypedPropertyDescriptor[T] | scala.Unit]

type ElementDecorator = js.Function0[typings.std.PropertyDecorator]

type EventDecorator = js.Function1[
/* opts */ js.UndefOr[typings.ionicons.stencilPublicRuntimeMod.EventOptions], 
typings.std.PropertyDecorator]

type FunctionalComponent[T] = js.Function3[
/* props */ T, 
/* children */ js.Array[typings.ionicons.stencilPublicRuntimeMod.VNode], 
/* utils */ typings.ionicons.stencilPublicRuntimeMod.FunctionalUtilities, 
typings.ionicons.stencilPublicRuntimeMod.VNode | js.Array[typings.ionicons.stencilPublicRuntimeMod.VNode]]

type ListenDecorator = js.Function2[
/* eventName */ java.lang.String, 
/* opts */ js.UndefOr[typings.ionicons.stencilPublicRuntimeMod.ListenOptions], 
typings.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]]

type MethodDecorator = js.Function1[
/* opts */ js.UndefOr[typings.ionicons.stencilPublicRuntimeMod.MethodOptions], 
typings.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]]

type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]

type PropDecorator = js.Function1[
/* opts */ js.UndefOr[typings.ionicons.stencilPublicRuntimeMod.PropOptions], 
typings.std.PropertyDecorator]

type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]

type ResolutionHandler = js.Function1[/* elm */ typings.std.HTMLElement, js.UndefOr[java.lang.String | scala.Null]]

type StateDecorator = js.Function0[typings.std.PropertyDecorator]

type WatchDecorator = js.Function1[
/* propName */ java.lang.String, 
typings.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]]
