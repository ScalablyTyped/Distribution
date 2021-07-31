package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The holds for a matter.
  */
trait SchemaListHoldsResponse extends StObject {
  
  /**
    * The list of holds.
    */
  var holds: js.UndefOr[js.Array[SchemaHold]] = js.undefined
  
  /**
    * Page token to retrieve the next page of results in the list. If this is
    * empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListHoldsResponse {
  
  @scala.inline
  def apply(): SchemaListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHoldsResponse]
  }
  
  @scala.inline
  implicit class SchemaListHoldsResponseMutableBuilder[Self <: SchemaListHoldsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHolds(value: js.Array[SchemaHold]): Self = StObject.set(x, "holds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldsUndefined: Self = StObject.set(x, "holds", js.undefined)
    
    @scala.inline
    def setHoldsVarargs(value: SchemaHold*): Self = StObject.set(x, "holds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
