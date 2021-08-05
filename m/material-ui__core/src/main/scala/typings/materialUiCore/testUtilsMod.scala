package typings.materialUiCore

import typings.enzyme.mod.ReactWrapper
import typings.materialUiCore.anon.Fn0
import typings.materialUiCore.anon.Fn1
import typings.materialUiCore.anon.NonePSnodeReactElementopt
import typings.materialUiCore.anon.PartialMountOptions
import typings.materialUiCore.anon.PartialRenderOptions
import typings.materialUiCore.anon.PartialShallowOptions
import typings.materialUiCore.anon.PartialwithThemeboolean
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("@material-ui/core/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMount(): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("createMount")().asInstanceOf[NonePSnodeReactElementopt]
  inline def createMount(options: PartialMountOptions): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("createMount")(options.asInstanceOf[js.Any]).asInstanceOf[NonePSnodeReactElementopt]
  
  inline def createRender(): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("createRender")().asInstanceOf[Fn0]
  inline def createRender(options: PartialRenderOptions): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("createRender")(options.asInstanceOf[js.Any]).asInstanceOf[Fn0]
  
  inline def createShallow(): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("createShallow")().asInstanceOf[Fn1]
  inline def createShallow(options: PartialShallowOptions): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("createShallow")(options.asInstanceOf[js.Any]).asInstanceOf[Fn1]
  
  inline def findOutermostIntrinsic(reactWrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOutermostIntrinsic")(reactWrapper.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]]
  
  inline def getClasses[T](element: ReactElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getClasses")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def getClasses[T](element: ReactElement, options: PartialwithThemeboolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getClasses")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unwrap(element: ReactElement): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(element.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
