package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreshnessOptions extends StObject {
  
  /** The duration after which an object should be considered stale. The default value is 180 days (in seconds). */
  var freshnessDuration: js.UndefOr[String] = js.undefined
  
  /**
    * This property indicates the freshness level of the object in the index. If set, this property must be a top-level property within the property definitions and it must be a timestamp
    * type or date type. Otherwise, the Indexing API uses updateTime as the freshness indicator. The maximum length is 256 characters. When a property is used to calculate freshness, the
    * value defaults to 2 years from the current time.
    */
  var freshnessProperty: js.UndefOr[String] = js.undefined
}
object FreshnessOptions {
  
  @scala.inline
  def apply(): FreshnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreshnessOptions]
  }
  
  @scala.inline
  implicit class FreshnessOptionsMutableBuilder[Self <: FreshnessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreshnessDuration(value: String): Self = StObject.set(x, "freshnessDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreshnessDurationUndefined: Self = StObject.set(x, "freshnessDuration", js.undefined)
    
    @scala.inline
    def setFreshnessProperty(value: String): Self = StObject.set(x, "freshnessProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreshnessPropertyUndefined: Self = StObject.set(x, "freshnessProperty", js.undefined)
  }
}
