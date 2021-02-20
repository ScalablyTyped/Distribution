package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a [[SelectionOption|`SelectionOption`]].
  */
@js.native
trait SelectionOptionData extends StObject {
  
  /**
    * Unique identifier of a [[SelectionOption|`SelectionOption`]].
    * Must match with [[SelectionOption.id|`SelectionOption.id`]]
    * field.
    */
  var id: String = js.native
}
object SelectionOptionData {
  
  @scala.inline
  def apply(id: String): SelectionOptionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionOptionData]
  }
  
  @scala.inline
  implicit class SelectionOptionDataMutableBuilder[Self <: SelectionOptionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
