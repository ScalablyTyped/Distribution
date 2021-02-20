package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeBase extends StObject {
  
  /** The KB name (generally of the form KB[0-9]+ i.e. KB123456). */
  var name: js.UndefOr[String] = js.native
  
  /** A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/ */
  var url: js.UndefOr[String] = js.native
}
object KnowledgeBase {
  
  @scala.inline
  def apply(): KnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeBase]
  }
  
  @scala.inline
  implicit class KnowledgeBaseMutableBuilder[Self <: KnowledgeBase] (val x: Self) extends AnyVal {
    
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
