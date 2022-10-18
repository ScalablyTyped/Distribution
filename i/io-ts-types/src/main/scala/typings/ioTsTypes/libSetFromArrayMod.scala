package typings.ioTsTypes

import typings.fpTs.libOrdMod.Ord_
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSetFromArrayMod {
  
  @JSImport("io-ts-types/lib/setFromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  
  type SetFromArrayC[C /* <: Mixed_ */] = Type_[Set[TypeOf[C]], js.Array[OutputOf[C]], Any]
}
