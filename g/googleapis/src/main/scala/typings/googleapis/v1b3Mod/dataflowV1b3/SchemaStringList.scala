package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a list of strings.
  */
@js.native
trait SchemaStringList extends StObject {
  
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[String]] = js.native
}
object SchemaStringList {
  
  @scala.inline
  def apply(): SchemaStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringList]
  }
  
  @scala.inline
  implicit class SchemaStringListMutableBuilder[Self <: SchemaStringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
