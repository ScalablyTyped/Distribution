package typings.ioTsTypes

import typings.ioTs.mod.Any_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWithValidateMod {
  
  @JSImport("io-ts-types/lib/withValidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withValidate_validate[C /* <: Any_ */](
    codec: C,
    validate: /* import warning: importer.ImportType#apply Failed type conversion: C['validate'] */ js.Any
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withValidate")(codec.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def withValidate_validate[C /* <: Any_ */](
    codec: C,
    validate: /* import warning: importer.ImportType#apply Failed type conversion: C['validate'] */ js.Any,
    name: String
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("withValidate")(codec.asInstanceOf[js.Any], validate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[C]
}
