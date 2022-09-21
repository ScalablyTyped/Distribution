package typings.knockoutPreRendered

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputedStatic extends StObject {
  
  def apply[T](): KnockoutComputed[T] = js.native
  def apply[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def apply[T](`def`: KnockoutComputedDefine[T], context: Any): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T], context: Any): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T], context: Any, options: Any): KnockoutComputed[T] = js.native
  def apply[T](func: js.Function0[T], context: Unit, options: Any): KnockoutComputed[T] = js.native
  
  var fn: KnockoutComputedFunctions[Any] = js.native
}
