package typings.ioTsTypes

import typings.fpTs.ordMod.Ord_
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlySetFromArrayMod {
  
  @JSImport("io-ts-types/lib/readonlySetFromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  
  type ReadonlySetFromArrayC[C /* <: Mixed_ */] = Type_[ReadonlySet[TypeOf[C]], js.Array[OutputOf[C]], Any]
}
