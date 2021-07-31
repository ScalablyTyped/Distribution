package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the html property. For example, if operatorName is *subject* and the property's name is *subjectLine*, then
    * queries like *subject:<value>* show results only where the value of the property named *subjectLine* matches *<value>*. By contrast, a search that uses the same *<value>* without an
    * operator return all items where *<value>* matches the value of any html properties or text within the content field for the item. The operator name can only contain lowercase
    * letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.undefined
}
object HtmlOperatorOptions {
  
  @scala.inline
  def apply(): HtmlOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlOperatorOptions]
  }
  
  @scala.inline
  implicit class HtmlOperatorOptionsMutableBuilder[Self <: HtmlOperatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
