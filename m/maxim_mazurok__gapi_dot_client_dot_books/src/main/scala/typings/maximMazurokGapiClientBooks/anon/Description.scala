package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /** Name of the source. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Extra text about the source of the review. */
  var extraDescription: js.UndefOr[String] = js.undefined
  
  /** URL of the source of the review. */
  var url: js.UndefOr[String] = js.undefined
}
object Description {
  
  @scala.inline
  def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExtraDescription(value: String): Self = StObject.set(x, "extraDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDescriptionUndefined: Self = StObject.set(x, "extraDescription", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
