package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.ErrorPOJO
import typings.jsdevtoolsOno.typesMod.OnoError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendErrorMod {
  
  @JSImport("@jsdevtools/ono/esm/extend-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error): js.Error & E & P & (OnoError[js.Error & E & P]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any]).asInstanceOf[js.Error & E & P & (OnoError[js.Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E): js.Error & E & P & (OnoError[js.Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[js.Error & E & P & (OnoError[js.Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E, props: P): js.Error & E & P & (OnoError[js.Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Error & E & P & (OnoError[js.Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: Unit, props: P): js.Error & E & P & (OnoError[js.Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Error & E & P & (OnoError[js.Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: Unit, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
}
