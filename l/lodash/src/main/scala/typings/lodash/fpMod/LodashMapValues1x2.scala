package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMapValues1x2[T] extends js.Object {
  def apply(iteratee: String): Dictionary[_] = js.native
  def apply(iteratee: js.Object): Dictionary[Boolean] = js.native
  def apply[TResult](callback: js.Function1[/* value */ T, TResult]): Dictionary[TResult] = js.native
  def apply[TKey /* <: /* keyof T */ String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
}

