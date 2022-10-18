package typings.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsAssignAllMod {
  
  @JSImport("lodash-decorators/utils/assignAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignAll[T, U](to: T, from: U): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignAll")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assignAll[T, U](to: T, from: U, excludes: js.Array[String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assignAll")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def assignProperty[T, U](to: T, from: U, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignProperty")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
