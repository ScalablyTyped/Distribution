package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metaline is a list of properties that are displayed along with the search
  * result to provide context.
  */
@js.native
trait SchemaMetaline extends StObject {
  
  /**
    * The list of displayed properties for the metaline.
    */
  var properties: js.UndefOr[js.Array[SchemaDisplayedProperty]] = js.native
}
object SchemaMetaline {
  
  @scala.inline
  def apply(): SchemaMetaline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetaline]
  }
  
  @scala.inline
  implicit class SchemaMetalineMutableBuilder[Self <: SchemaMetaline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[SchemaDisplayedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SchemaDisplayedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
