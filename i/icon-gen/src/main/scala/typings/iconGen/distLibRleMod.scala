package typings.iconGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRleMod {
  
  @JSImport("icon-gen/dist/lib/rle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packBits(src: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packBits")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def packBitsLiteralToResult(literals: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packBitsLiteralToResult")(literals.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def packICNS(src: js.Array[Double]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("packICNS")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def unpackBits(src: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackBits")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
