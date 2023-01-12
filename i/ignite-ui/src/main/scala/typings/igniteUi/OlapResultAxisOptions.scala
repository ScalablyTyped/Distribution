package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultAxisOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Optional="false" the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  var tupleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional="false" array of $.ig.OlapResultTuple objects which form the axis.
    */
  var tuples: js.UndefOr[js.Array[Any]] = js.undefined
}
object OlapResultAxisOptions {
  
  inline def apply(): OlapResultAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultAxisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlapResultAxisOptions] (val x: Self) extends AnyVal {
    
    inline def setTupleSize(value: Double): Self = StObject.set(x, "tupleSize", value.asInstanceOf[js.Any])
    
    inline def setTupleSizeUndefined: Self = StObject.set(x, "tupleSize", js.undefined)
    
    inline def setTuples(value: js.Array[Any]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    inline def setTuplesUndefined: Self = StObject.set(x, "tuples", js.undefined)
    
    inline def setTuplesVarargs(value: Any*): Self = StObject.set(x, "tuples", js.Array(value*))
  }
}
