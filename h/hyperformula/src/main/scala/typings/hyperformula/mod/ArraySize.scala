package typings.hyperformula.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "ArraySize")
@js.native
open class ArraySize protected ()
  extends typings.hyperformula.typingsArraySizeMod.ArraySize {
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, isRef: Boolean) = this()
}
/* static members */
object ArraySize {
  
  @JSImport("hyperformula", "ArraySize")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(): typings.hyperformula.typingsArraySizeMod.ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.hyperformula.typingsArraySizeMod.ArraySize]
  
  inline def fromArray[T](array: js.Array[js.Array[T]]): typings.hyperformula.typingsArraySizeMod.ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsArraySizeMod.ArraySize]
  
  inline def scalar(): typings.hyperformula.typingsArraySizeMod.ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")().asInstanceOf[typings.hyperformula.typingsArraySizeMod.ArraySize]
}
