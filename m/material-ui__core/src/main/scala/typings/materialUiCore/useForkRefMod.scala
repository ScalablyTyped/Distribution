package typings.materialUiCore

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useForkRefMod {
  
  @JSImport("@material-ui/core/utils/useForkRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](refA: Ref[T], refB: Ref[T]): Ref[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[Ref[T]]
}
