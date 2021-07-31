package typings.lodash.fpMod

import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashWrap extends StObject {
  
  def apply[T](wrapper: __, value: T): LodashWrap1x2[T] = js.native
  def apply[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult]): LodashWrap1x1[T, TArgs, TResult] = js.native
  def apply[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult], value: T): js.Function1[/* repeated */ TArgs, TResult] = js.native
}
