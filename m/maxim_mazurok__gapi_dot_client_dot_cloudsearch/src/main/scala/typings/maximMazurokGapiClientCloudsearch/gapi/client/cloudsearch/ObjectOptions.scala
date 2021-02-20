package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptions extends StObject {
  
  /** Options that determine how the object is displayed in the Cloud Search results page. */
  var displayOptions: js.UndefOr[ObjectDisplayOptions] = js.native
  
  /** The freshness options for an object. */
  var freshnessOptions: js.UndefOr[FreshnessOptions] = js.native
}
object ObjectOptions {
  
  @scala.inline
  def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  @scala.inline
  implicit class ObjectOptionsMutableBuilder[Self <: ObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayOptions(value: ObjectDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    @scala.inline
    def setFreshnessOptions(value: FreshnessOptions): Self = StObject.set(x, "freshnessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreshnessOptionsUndefined: Self = StObject.set(x, "freshnessOptions", js.undefined)
  }
}
