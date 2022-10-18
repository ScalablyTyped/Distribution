package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.LineTerminatorSequence
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`
  extends StObject
     with Token {
  
  var `type`: LineTerminatorSequence
  
  var value: String
}
object `7` {
  
  inline def apply(value: String): `7` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LineTerminatorSequence")
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setType(value: LineTerminatorSequence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
