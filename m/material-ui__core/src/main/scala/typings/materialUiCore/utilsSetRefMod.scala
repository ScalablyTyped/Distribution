package typings.materialUiCore

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsSetRefMod {
  
  @JSImport("@material-ui/core/utils/setRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](ref: RefObject[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](ref: RefObject[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
