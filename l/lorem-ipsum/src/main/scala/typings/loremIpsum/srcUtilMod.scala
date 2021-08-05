package typings.loremIpsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  @JSImport("lorem-ipsum/types/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  inline def isReactNative(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNative")().asInstanceOf[Boolean]
  
  inline def isWindows(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindows")().asInstanceOf[Boolean]
  
  inline def makeArrayOfLength(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayOfLength")().asInstanceOf[js.Array[Double]]
  inline def makeArrayOfLength(length: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayOfLength")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def makeArrayOfStrings(length: Double, makeString: js.Function0[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayOfStrings")(length.asInstanceOf[js.Any], makeString.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
