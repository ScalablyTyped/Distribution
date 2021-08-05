package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.ErrorPOJO
import typings.jsdevtoolsOno.typesMod.OnoError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendErrorMod {
  
  @JSImport("@jsdevtools/ono/esm/extend-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: Unit, props: P): ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ErrorPOJO & E & P & (OnoError[ErrorPOJO & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error): Error & E & P & (OnoError[Error & E & P]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any]).asInstanceOf[Error & E & P & (OnoError[Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E): Error & E & P & (OnoError[Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[Error & E & P & (OnoError[Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: E, props: P): Error & E & P & (OnoError[Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Error & E & P & (OnoError[Error & E & P])]
  inline def extendError[E /* <: ErrorLike */, P /* <: js.Object */](error: Error, originalError: Unit, props: P): Error & E & P & (OnoError[Error & E & P]) = (^.asInstanceOf[js.Dynamic].applyDynamic("extendError")(error.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Error & E & P & (OnoError[Error & E & P])]
}
