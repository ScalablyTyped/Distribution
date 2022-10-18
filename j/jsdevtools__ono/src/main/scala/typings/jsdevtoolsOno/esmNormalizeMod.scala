package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.anon.Message
import typings.jsdevtoolsOno.esmTypesMod.ErrorLike
import typings.jsdevtoolsOno.esmTypesMod.OnoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmNormalizeMod {
  
  @JSImport("@jsdevtools/ono/esm/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeArgs[E /* <: ErrorLike */, P /* <: js.Object */](args: js.Array[Any], options: OnoOptions): Message[E, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeArgs")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Message[E, P]]
  
  inline def normalizeOptions(): OnoOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")().asInstanceOf[OnoOptions]
  inline def normalizeOptions(options: OnoOptions): OnoOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeOptions")(options.asInstanceOf[js.Any]).asInstanceOf[OnoOptions]
}
