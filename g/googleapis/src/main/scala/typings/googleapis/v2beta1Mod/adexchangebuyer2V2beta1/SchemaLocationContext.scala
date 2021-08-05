package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The Geo criteria the restriction applies to.
  */
trait SchemaLocationContext extends StObject {
  
  /**
    * IDs representing the geo location for this context. Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaLocationContext {
  
  inline def apply(): SchemaLocationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationContext]
  }
  
  extension [Self <: SchemaLocationContext](x: Self) {
    
    inline def setGeoCriteriaIds(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setGeoCriteriaIdsUndefined: Self = StObject.set(x, "geoCriteriaIds", js.undefined)
    
    inline def setGeoCriteriaIdsVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaIds", js.Array(value :_*))
  }
}
