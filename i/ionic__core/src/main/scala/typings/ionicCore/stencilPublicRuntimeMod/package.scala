package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stencilPublicRuntimeMod {
  
  @scala.inline
  def Build: typings.ionicCore.stencilPublicRuntimeMod.UserBuildConditionals = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Build").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.UserBuildConditionals]
  
  @scala.inline
  def Component: typings.ionicCore.stencilPublicRuntimeMod.ComponentDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Component").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.ComponentDecorator]
  
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.ComponentOptions], 
    typings.std.ClassDecorator
  ]
  
  type CustomMethodDecorator[T] = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typings.std.TypedPropertyDescriptor[T], 
    typings.std.TypedPropertyDescriptor[T] | scala.Unit
  ]
  
  @scala.inline
  def Element: typings.ionicCore.stencilPublicRuntimeMod.ElementDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Element").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.ElementDecorator]
  
  type ElementDecorator = js.Function0[typings.std.PropertyDecorator]
  
  type ErrorHandler = js.Function2[/* err */ js.Any, /* element */ js.UndefOr[typings.std.HTMLElement], scala.Unit]
  
  @scala.inline
  def Event: typings.ionicCore.stencilPublicRuntimeMod.EventDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Event").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.EventDecorator]
  
  type EventDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.EventOptions], 
    typings.std.PropertyDecorator
  ]
  
  @scala.inline
  def Fragment: typings.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[js.Object] = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[js.Object]]
  
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typings.ionicCore.stencilPublicRuntimeMod.VNode], 
    /* utils */ typings.ionicCore.stencilPublicRuntimeMod.FunctionalUtilities, 
    typings.ionicCore.stencilPublicRuntimeMod.VNode | js.Array[typings.ionicCore.stencilPublicRuntimeMod.VNode]
  ]
  
  @scala.inline
  def Host: typings.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[typings.ionicCore.stencilPublicRuntimeMod.HostAttributes] = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.FunctionalComponent[typings.ionicCore.stencilPublicRuntimeMod.HostAttributes]]
  
  @scala.inline
  def Listen: typings.ionicCore.stencilPublicRuntimeMod.ListenDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Listen").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.ListenDecorator]
  
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.ListenOptions], 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def Method: typings.ionicCore.stencilPublicRuntimeMod.MethodDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Method").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.MethodDecorator]
  
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.MethodOptions], 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  @scala.inline
  def Prop: typings.ionicCore.stencilPublicRuntimeMod.PropDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Prop").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.PropDecorator]
  
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.PropOptions], 
    typings.std.PropertyDecorator
  ]
  
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
  
  type ResolutionHandler = js.Function1[/* elm */ typings.std.HTMLElement, js.UndefOr[java.lang.String | scala.Null]]
  
  @scala.inline
  def State: typings.ionicCore.stencilPublicRuntimeMod.StateDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("State").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.StateDecorator]
  
  type StateDecorator = js.Function0[typings.std.PropertyDecorator]
  
  @scala.inline
  def Watch: typings.ionicCore.stencilPublicRuntimeMod.WatchDecorator = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].selectDynamic("Watch").asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.WatchDecorator]
  
  type WatchDecorator = js.Function1[
    /* propName */ java.lang.String, 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  
  @scala.inline
  def forceUpdate(ref: js.Any): scala.Unit = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getAssetPath(path: java.lang.String): java.lang.String = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getElement(ref: js.Any): typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement]
  
  @scala.inline
  def getMode[T](ref: js.Any): T = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getRenderingRef(): js.Any = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[js.Any]
  
  @scala.inline
  def readTask(task: typings.ionicCore.stencilPublicRuntimeMod.RafCallback): scala.Unit = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setAssetPath(path: java.lang.String): java.lang.String = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setErrorHandler(handler: typings.ionicCore.stencilPublicRuntimeMod.ErrorHandler): scala.Unit = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setMode(handler: typings.ionicCore.stencilPublicRuntimeMod.ResolutionHandler): scala.Unit = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeTask(task: typings.ionicCore.stencilPublicRuntimeMod.RafCallback): scala.Unit = typings.ionicCore.stencilPublicRuntimeMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
