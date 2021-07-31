package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to create a short Dynamic Link.
  */
trait SchemaCreateShortDynamicLinkResponse extends StObject {
  
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.undefined
  
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var shortLink: js.UndefOr[String] = js.undefined
  
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.undefined
}
object SchemaCreateShortDynamicLinkResponse {
  
  @scala.inline
  def apply(): SchemaCreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateShortDynamicLinkResponseMutableBuilder[Self <: SchemaCreateShortDynamicLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    @scala.inline
    def setShortLink(value: String): Self = StObject.set(x, "shortLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortLinkUndefined: Self = StObject.set(x, "shortLink", js.undefined)
    
    @scala.inline
    def setWarning(value: js.Array[SchemaDynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: SchemaDynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
