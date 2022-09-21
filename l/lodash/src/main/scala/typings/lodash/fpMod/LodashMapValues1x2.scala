package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMapValues1x2[T] extends StObject {
  
  def apply(iteratee: String): Dictionary[Any] = js.native
  def apply(iteratee: js.Object): Dictionary[Boolean] = js.native
  def apply[TResult](callback: js.Function1[/* value */ T, TResult]): Dictionary[TResult] = js.native
  def apply[TKey /* <: /* keyof T */ String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
}
