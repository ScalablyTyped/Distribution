package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOperatorOptions extends js.Object {
  
  /**
    * If true, the text value is tokenized as one atomic value in operator searches and facet matches. For example, if the operator name is "genre" and the value is "science-fiction" the
    * query restrictions "genre:science" and "genre:fiction" doesn't match the item; "genre:science-fiction" does. Value matching is case-sensitive and does not remove special characters.
    * If false, the text is tokenized. For example, if the value is "science-fiction" the queries "genre:science" and "genre:fiction" matches the item.
    */
  var exactMatchWithOperator: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the operator name required in the query in order to isolate the text property. For example, if operatorName is *subject* and the property's name is *subjectLine*, then
    * queries like *subject:<value>* show results only where the value of the property named *subjectLine* matches *<value>*. By contrast, a search that uses the same *<value>* without an
    * operator returns all items where *<value>* matches the value of any text properties or text within the content field for the item. The operator name can only contain lowercase
    * letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}
object TextOperatorOptions {
  
  @scala.inline
  def apply(): TextOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOperatorOptions]
  }
  
  @scala.inline
  implicit class TextOperatorOptionsOps[Self <: TextOperatorOptions] (val x: Self) extends AnyVal {
    
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
    def setExactMatchWithOperator(value: Boolean): Self = this.set("exactMatchWithOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactMatchWithOperator: Self = this.set("exactMatchWithOperator", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
  }
}
