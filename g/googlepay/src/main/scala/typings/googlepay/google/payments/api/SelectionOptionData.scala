package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a [[SelectionOption|`SelectionOption`]].
  */
trait SelectionOptionData extends StObject {
  
  /**
    * Unique identifier of a [[SelectionOption|`SelectionOption`]].
    * Must match with [[SelectionOption.id|`SelectionOption.id`]]
    * field.
    */
  var id: String
}
object SelectionOptionData {
  
  inline def apply(id: String): SelectionOptionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptionData]
  }
  
  extension [Self <: SelectionOptionData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
