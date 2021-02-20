package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Names extends StObject {
  
  /** A list of category resource names. For example, "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed. */
  var names: js.UndefOr[js.Array[String]] = js.native
}
object Names {
  
  @scala.inline
  def apply(): Names = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Names]
  }
  
  @scala.inline
  implicit class NamesMutableBuilder[Self <: Names] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
