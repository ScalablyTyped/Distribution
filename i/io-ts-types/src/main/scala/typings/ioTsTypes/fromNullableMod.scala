package typings.ioTsTypes

import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.TypeOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromNullableMod {
  
  @JSImport("io-ts-types/lib/fromNullable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromNullable[C /* <: Mixed_ */](codec: C, a: TypeOf[C]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def fromNullable[C /* <: Mixed_ */](codec: C, a: TypeOf[C], name: String): C = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(codec.asInstanceOf[js.Any], a.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
}
