package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a list of floating point numbers.
  */
@js.native
trait SchemaFloatingPointList extends StObject {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaFloatingPointList {
  
  @scala.inline
  def apply(): SchemaFloatingPointList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointList]
  }
  
  @scala.inline
  implicit class SchemaFloatingPointListMutableBuilder[Self <: SchemaFloatingPointList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Double]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: Double*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
