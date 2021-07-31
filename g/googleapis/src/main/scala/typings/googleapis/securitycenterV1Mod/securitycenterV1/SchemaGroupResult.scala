package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result containing the properties and count of a groupBy request.
  */
trait SchemaGroupResult extends StObject {
  
  /**
    * Total count of resources for the given properties.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * Properties matching the groupBy fields in the request.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaGroupResult {
  
  @scala.inline
  def apply(): SchemaGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupResult]
  }
  
  @scala.inline
  implicit class SchemaGroupResultMutableBuilder[Self <: SchemaGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
