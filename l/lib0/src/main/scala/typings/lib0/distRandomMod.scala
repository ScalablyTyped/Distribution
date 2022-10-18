package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRandomMod {
  
  @JSImport("lib0/dist/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneOf[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(arr.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def rand(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand")().asInstanceOf[Double]
  
  inline def uint32(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32")().asInstanceOf[Double]
  
  inline def uint53(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint53")().asInstanceOf[Double]
  
  inline def uuidv4(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidv4")().asInstanceOf[Any]
}
