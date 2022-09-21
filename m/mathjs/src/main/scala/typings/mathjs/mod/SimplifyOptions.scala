package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplifyOptions extends StObject {
  
  /** A boolean which is `false` by default. */
  var consoleDebug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * gives properties of each operator, which determine what simplifications
    * are allowed. Properties are commutative, associative, total (whether
    * the operation is defined for all arguments), and trivial (whether
    * the operation applied to a single argument leaves that argument
    * unchanged).
    */
  var context: js.UndefOr[SimplifyContext] = js.undefined
  
  /** A boolean which is `true` by default. */
  var exactFractions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `exactFractions` is true, a fraction will be returned only
    * when both numerator and denominator are smaller than `fractionsLimit`.
    * Default value is 10000.
    */
  var fractionsLimit: js.UndefOr[Double] = js.undefined
}
object SimplifyOptions {
  
  inline def apply(): SimplifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimplifyOptions]
  }
  
  extension [Self <: SimplifyOptions](x: Self) {
    
    inline def setConsoleDebug(value: Boolean): Self = StObject.set(x, "consoleDebug", value.asInstanceOf[js.Any])
    
    inline def setConsoleDebugUndefined: Self = StObject.set(x, "consoleDebug", js.undefined)
    
    inline def setContext(value: SimplifyContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExactFractions(value: Boolean): Self = StObject.set(x, "exactFractions", value.asInstanceOf[js.Any])
    
    inline def setExactFractionsUndefined: Self = StObject.set(x, "exactFractions", js.undefined)
    
    inline def setFractionsLimit(value: Double): Self = StObject.set(x, "fractionsLimit", value.asInstanceOf[js.Any])
    
    inline def setFractionsLimitUndefined: Self = StObject.set(x, "fractionsLimit", js.undefined)
  }
}
