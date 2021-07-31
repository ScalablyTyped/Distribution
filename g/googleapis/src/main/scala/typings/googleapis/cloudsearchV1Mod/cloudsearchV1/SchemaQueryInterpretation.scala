package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInterpretation extends StObject {
  
  var interpretationType: js.UndefOr[String] = js.undefined
  
  /**
    * The interpretation of the query used in search. For example, query
    * &quot;email from john&quot; will be interpreted as &quot;from:john
    * source:mail&quot;
    */
  var interpretedQuery: js.UndefOr[String] = js.undefined
}
object SchemaQueryInterpretation {
  
  @scala.inline
  def apply(): SchemaQueryInterpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretation]
  }
  
  @scala.inline
  implicit class SchemaQueryInterpretationMutableBuilder[Self <: SchemaQueryInterpretation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpretationType(value: String): Self = StObject.set(x, "interpretationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretationTypeUndefined: Self = StObject.set(x, "interpretationType", js.undefined)
    
    @scala.inline
    def setInterpretedQuery(value: String): Self = StObject.set(x, "interpretedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretedQueryUndefined: Self = StObject.set(x, "interpretedQuery", js.undefined)
  }
}
