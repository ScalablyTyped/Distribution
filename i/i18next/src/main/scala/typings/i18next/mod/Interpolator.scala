package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolator extends StObject {
  
  def init(options: InterpolationOptions, reset: Boolean): Unit
  
  def interpolate(str: String, data: js.Object, lng: String, options: InterpolationOptions): String
  
  def nest(str: String, fc: js.Function1[/* repeated */ js.Any, js.Any], options: InterpolationOptions): String
  
  def reset(): Unit
  
  def resetRegExp(): Unit
}
object Interpolator {
  
  @scala.inline
  def apply(
    init: (InterpolationOptions, Boolean) => Unit,
    interpolate: (String, js.Object, String, InterpolationOptions) => String,
    nest: (String, js.Function1[/* repeated */ js.Any, js.Any], InterpolationOptions) => String,
    reset: () => Unit,
    resetRegExp: () => Unit
  ): Interpolator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init), interpolate = js.Any.fromFunction4(interpolate), nest = js.Any.fromFunction3(nest), reset = js.Any.fromFunction0(reset), resetRegExp = js.Any.fromFunction0(resetRegExp))
    __obj.asInstanceOf[Interpolator]
  }
  
  @scala.inline
  implicit class InterpolatorMutableBuilder[Self <: Interpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: (InterpolationOptions, Boolean) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterpolate(value: (String, js.Object, String, InterpolationOptions) => String): Self = StObject.set(x, "interpolate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNest(value: (String, js.Function1[/* repeated */ js.Any, js.Any], InterpolationOptions) => String): Self = StObject.set(x, "nest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetRegExp(value: () => Unit): Self = StObject.set(x, "resetRegExp", js.Any.fromFunction0(value))
  }
}
