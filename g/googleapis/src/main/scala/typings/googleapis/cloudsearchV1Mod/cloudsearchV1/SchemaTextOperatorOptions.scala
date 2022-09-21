package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextOperatorOptions extends StObject {
  
  /**
    * If true, the text value is tokenized as one atomic value in operator searches and facet matches. For example, if the operator name is "genre" and the value is "science-fiction" the query restrictions "genre:science" and "genre:fiction" doesn't match the item; "genre:science-fiction" does. Text value matching is case-sensitive and does not remove special characters. If false, the text is tokenized. For example, if the value is "science-fiction" the queries "genre:science" and "genre:fiction" matches the item.
    */
  var exactMatchWithOperator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates the operator name required in the query in order to isolate the text property. For example, if operatorName is *subject* and the property's name is *subjectLine*, then queries like *subject:<value\>* show results only where the value of the property named *subjectLine* matches *<value\>*. By contrast, a search that uses the same *<value\>* without an operator returns all items where *<value\>* matches the value of any text properties or text within the content field for the item. The operator name can only contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTextOperatorOptions {
  
  inline def apply(): SchemaTextOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextOperatorOptions]
  }
  
  extension [Self <: SchemaTextOperatorOptions](x: Self) {
    
    inline def setExactMatchWithOperator(value: Boolean): Self = StObject.set(x, "exactMatchWithOperator", value.asInstanceOf[js.Any])
    
    inline def setExactMatchWithOperatorNull: Self = StObject.set(x, "exactMatchWithOperator", null)
    
    inline def setExactMatchWithOperatorUndefined: Self = StObject.set(x, "exactMatchWithOperator", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
