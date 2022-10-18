package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsMaybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsNumberLiteralHelperMod {
  
  @JSImport("hyperformula/typings/NumberLiteralHelper", "NumberLiteralHelper")
  @js.native
  open class NumberLiteralHelper protected () extends StObject {
    def this(config: Config) = this()
    
    /* private */ val allThousandSeparatorsRegex: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ val numberPattern: Any = js.native
    
    def numericStringToMaybeNumber(input: String): Maybe[Double] = js.native
    
    def numericStringToNumber(input: String): Double = js.native
  }
}
