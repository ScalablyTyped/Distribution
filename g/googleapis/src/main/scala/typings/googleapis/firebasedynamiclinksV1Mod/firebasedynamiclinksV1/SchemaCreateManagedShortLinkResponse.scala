package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to create a short Dynamic Link.
  */
trait SchemaCreateManagedShortLinkResponse extends StObject {
  
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var managedShortLink: js.UndefOr[SchemaManagedShortLink] = js.undefined
  
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.undefined
  
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.undefined
}
object SchemaCreateManagedShortLinkResponse {
  
  @scala.inline
  def apply(): SchemaCreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateManagedShortLinkResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateManagedShortLinkResponseMutableBuilder[Self <: SchemaCreateManagedShortLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedShortLink(value: SchemaManagedShortLink): Self = StObject.set(x, "managedShortLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedShortLinkUndefined: Self = StObject.set(x, "managedShortLink", js.undefined)
    
    @scala.inline
    def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    @scala.inline
    def setWarning(value: js.Array[SchemaDynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: SchemaDynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
