package typings.lezerLr

import org.scalablytyped.runtime.NumberDictionary
import typings.lezerLr.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecodeMod {
  
  @JSImport("@lezer/lr/dist/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeArray[T /* <: NumberDictionary[Double] */](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeArray")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def decodeArray[T /* <: NumberDictionary[Double] */](input: T, Type: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeArray")(input.asInstanceOf[js.Any], Type.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def decodeArray[T /* <: NumberDictionary[Double] */](input: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeArray")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def decodeArray[T /* <: NumberDictionary[Double] */](input: String, Type: Instantiable[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeArray")(input.asInstanceOf[js.Any], Type.asInstanceOf[js.Any])).asInstanceOf[T]
}
