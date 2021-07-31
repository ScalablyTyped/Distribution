package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for any related URL information
  */
trait SchemaRelatedUrl extends StObject {
  
  /**
    * Label to describe usage of the URL
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specific URL to associate with the note
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaRelatedUrl {
  
  @scala.inline
  def apply(): SchemaRelatedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedUrl]
  }
  
  @scala.inline
  implicit class SchemaRelatedUrlMutableBuilder[Self <: SchemaRelatedUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
