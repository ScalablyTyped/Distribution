package typings.lodash.fpMod

import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashThru extends StObject {
  
  def apply[T](interceptor: __, value: T): LodashThru1x2[T] = js.native
  def apply[T, TResult](interceptor: js.Function1[/* value */ T, TResult]): LodashThru1x1[T, TResult] = js.native
  def apply[T, TResult](interceptor: js.Function1[/* value */ T, TResult], value: T): TResult = js.native
}
