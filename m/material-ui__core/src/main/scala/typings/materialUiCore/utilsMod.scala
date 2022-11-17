package typings.materialUiCore

import org.scalablytyped.runtime.StringDictionary
import typings.materialUiCore.anon.IsFocusVisible
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import typings.materialUiCore.utilsCreateChainedFunctionMod.ChainedFunction
import typings.materialUiCore.utilsDebounceMod.Cancelable
import typings.materialUiCore.utilsUseControlledMod.UseControlledProps
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Document
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@material-ui/core/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createChainedFunction(funcs: ChainedFunction*): js.Function1[/* repeated */ Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, scala.Nothing]]
  
  inline def createSvgIcon(path: ReactNode, displayName: String): OverridableComponent[SvgIconTypeMap[js.Object, "svg"]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvgIcon")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[OverridableComponent[SvgIconTypeMap[js.Object, "svg"]]]
  
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T & Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[T & Cancelable]
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  
  inline def deprecatedPropType[T](validator: T, reason: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecatedPropType")(validator.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isMuiElement(element: Any, muiNames: js.Array[String]): /* is @material-ui/core.@material-ui/core/utils/isMuiElement.NamedMuiElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMuiElement")(element.asInstanceOf[js.Any], muiNames.asInstanceOf[js.Any])).asInstanceOf[/* is @material-ui/core.@material-ui/core/utils/isMuiElement.NamedMuiElement */ Boolean]
  
  inline def ownerDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")().asInstanceOf[Document]
  inline def ownerDocument(node: Node): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def ownerWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")().asInstanceOf[Window]
  inline def ownerWindow(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
  
  inline def requirePropFactory(componentNameInError: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requirePropFactory")(componentNameInError.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: RefObject[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: RefObject[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unsupportedProp(
    props: StringDictionary[Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedProp")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], propFullName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def useControlled[T](props: UseControlledProps[T]): js.Tuple2[T, js.Function1[/* newValue */ T, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlled")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T, Unit]]]
  
  inline def useEventCallback(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def useForkRef[T](refA: Ref[T], refB: Ref[T]): Ref[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[Ref[T]]
  
  inline def useIsFocusVisible(): IsFocusVisible = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocusVisible")().asInstanceOf[IsFocusVisible]
}
