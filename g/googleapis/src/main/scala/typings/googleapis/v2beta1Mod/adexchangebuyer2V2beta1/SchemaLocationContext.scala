package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The Geo criteria the restriction applies to.
  */
@js.native
trait SchemaLocationContext extends StObject {
  
  /**
    * IDs representing the geo location for this context. Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaLocationContext {
  
  @scala.inline
  def apply(): SchemaLocationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationContext]
  }
  
  @scala.inline
  implicit class SchemaLocationContextMutableBuilder[Self <: SchemaLocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoCriteriaIds(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoCriteriaIdsUndefined: Self = StObject.set(x, "geoCriteriaIds", js.undefined)
    
    @scala.inline
    def setGeoCriteriaIdsVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaIds", js.Array(value :_*))
  }
}
