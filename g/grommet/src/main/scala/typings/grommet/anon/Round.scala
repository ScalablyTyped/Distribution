package typings.grommet.anon

import typings.grommet.utilsMod.RoundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Round extends StObject {
  
  var round: js.UndefOr[RoundType] = js.undefined
}
object Round {
  
  inline def apply(): Round = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Round]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Round] (val x: Self) extends AnyVal {
    
    inline def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
