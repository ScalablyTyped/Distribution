package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  /** A text explaining why this volume is recommended. */
  var explanation: js.UndefOr[String] = js.undefined
}
object Explanation {
  
  inline def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  extension [Self <: Explanation](x: Self) {
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
  }
}
