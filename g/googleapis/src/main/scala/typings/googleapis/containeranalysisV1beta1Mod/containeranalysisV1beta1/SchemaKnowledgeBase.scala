package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKnowledgeBase extends StObject {
  
  /**
    * The KB name (generally of the form KB[0-9]+ i.e. KB123456).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the KB in the Windows update catalog -
    * https://www.catalog.update.microsoft.com/
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaKnowledgeBase {
  
  @scala.inline
  def apply(): SchemaKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnowledgeBase]
  }
  
  @scala.inline
  implicit class SchemaKnowledgeBaseMutableBuilder[Self <: SchemaKnowledgeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
