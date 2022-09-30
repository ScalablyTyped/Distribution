package typings.ioTsTypes

import typings.fpTs.nonEmptyArrayMod.NonEmptyArray_
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonEmptyArrayMod {
  
  @JSImport("io-ts-types/lib/nonEmptyArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonEmptyArray[C /* <: Mixed_ */](codec: C): NonEmptyArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyArray")(codec.asInstanceOf[js.Any]).asInstanceOf[NonEmptyArrayC[C]]
  inline def nonEmptyArray[C /* <: Mixed_ */](codec: C, name: String): NonEmptyArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyArray")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[NonEmptyArrayC[C]]
  
  type NonEmptyArrayC[C /* <: Mixed_ */] = Type_[NonEmptyArray_[TypeOf[C]], NonEmptyArray_[OutputOf[C]], Any]
}
