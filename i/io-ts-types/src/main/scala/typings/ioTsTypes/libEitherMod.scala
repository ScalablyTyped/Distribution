package typings.ioTsTypes

import typings.fpTs.libEitherMod.Either_
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEitherMod {
  
  @JSImport("io-ts-types/lib/either", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def either[L /* <: Mixed_ */, R /* <: Mixed_ */](leftCodec: L, rightCodec: R): EitherC[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(leftCodec.asInstanceOf[js.Any], rightCodec.asInstanceOf[js.Any])).asInstanceOf[EitherC[L, R]]
  inline def either[L /* <: Mixed_ */, R /* <: Mixed_ */](leftCodec: L, rightCodec: R, name: String): EitherC[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(leftCodec.asInstanceOf[js.Any], rightCodec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[EitherC[L, R]]
  
  type EitherC[L /* <: Mixed_ */, R /* <: Mixed_ */] = Type_[Either_[TypeOf[L], TypeOf[R]], Either_[OutputOf[L], OutputOf[R]], Any]
}
