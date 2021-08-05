package typings.jsonabc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonabc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanJSON(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanJSON")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sort(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sort(inputStr: String, noArray: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(inputStr.asInstanceOf[js.Any], noArray.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sortObj[T /* <: js.Object */](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sortObj")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sortObj[T /* <: js.Object */](input: T, noArray: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sortObj")(input.asInstanceOf[js.Any], noArray.asInstanceOf[js.Any])).asInstanceOf[T]
}
