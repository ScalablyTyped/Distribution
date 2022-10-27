package typings.httpErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHttpError extends StObject {
  
  def apply(rest: UnknownError*): HttpError[Double] = js.native
  def apply[N /* <: Double */](arg: N, rest: UnknownError*): HttpError[N] = js.native
}
