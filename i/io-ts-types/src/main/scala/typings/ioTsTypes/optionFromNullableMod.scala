package typings.ioTsTypes

import typings.fpTs.optionMod.Option_
import typings.ioTs.mod.Mixed_
import typings.ioTs.mod.OutputOf
import typings.ioTs.mod.TypeOf
import typings.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionFromNullableMod {
  
  @JSImport("io-ts-types/lib/optionFromNullable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def optionFromNullable[C /* <: Mixed_ */](codec: C): OptionFromNullableC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionFromNullable")(codec.asInstanceOf[js.Any]).asInstanceOf[OptionFromNullableC[C]]
  inline def optionFromNullable[C /* <: Mixed_ */](codec: C, name: String): OptionFromNullableC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionFromNullable")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[OptionFromNullableC[C]]
  
  type OptionFromNullableC[C /* <: Mixed_ */] = Type_[Option_[TypeOf[C]], OutputOf[C] | Null, Any]
}
