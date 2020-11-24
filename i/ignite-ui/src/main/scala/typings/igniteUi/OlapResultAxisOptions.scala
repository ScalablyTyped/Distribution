package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultAxisOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" the count of the $.ig.OlapResultAxisMember objects of each tuple.
    */
  var tupleSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional="false" array of $.ig.OlapResultTuple objects which form the axis.
    */
  var tuples: js.UndefOr[js.Array[_]] = js.native
}
object OlapResultAxisOptions {
  
  @scala.inline
  def apply(): OlapResultAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultAxisOptions]
  }
  
  @scala.inline
  implicit class OlapResultAxisOptionsOps[Self <: OlapResultAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTupleSize(value: Double): Self = this.set("tupleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTupleSize: Self = this.set("tupleSize", js.undefined)
    
    @scala.inline
    def setTuplesVarargs(value: js.Any*): Self = this.set("tuples", js.Array(value :_*))
    
    @scala.inline
    def setTuples(value: js.Array[_]): Self = this.set("tuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTuples: Self = this.set("tuples", js.undefined)
  }
}
