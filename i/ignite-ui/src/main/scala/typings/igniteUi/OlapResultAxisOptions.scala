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
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  var tupleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional="false" array of $.ig.OlapResultTuple objects which form the axis.
    */
  var tuples: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object OlapResultAxisOptions {
  
  @scala.inline
  def apply(): OlapResultAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultAxisOptions]
  }
  
  @scala.inline
  implicit class OlapResultAxisOptionsMutableBuilder[Self <: OlapResultAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTupleSize(value: Double): Self = StObject.set(x, "tupleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleSizeUndefined: Self = StObject.set(x, "tupleSize", js.undefined)
    
    @scala.inline
    def setTuples(value: js.Array[js.Any]): Self = StObject.set(x, "tuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuplesUndefined: Self = StObject.set(x, "tuples", js.undefined)
    
    @scala.inline
    def setTuplesVarargs(value: js.Any*): Self = StObject.set(x, "tuples", js.Array(value :_*))
  }
}
