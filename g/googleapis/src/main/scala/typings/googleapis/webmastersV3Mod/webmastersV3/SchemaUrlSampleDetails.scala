package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details about the URL, set only when calling get().
  */
trait SchemaUrlSampleDetails extends StObject {
  
  /**
    * List of sitemaps pointing at this URL.
    */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A sample set of URLs linking to this URL.
    */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaUrlSampleDetails {
  
  @scala.inline
  def apply(): SchemaUrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlSampleDetails]
  }
  
  @scala.inline
  implicit class SchemaUrlSampleDetailsMutableBuilder[Self <: SchemaUrlSampleDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainingSitemaps(value: js.Array[String]): Self = StObject.set(x, "containingSitemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainingSitemapsUndefined: Self = StObject.set(x, "containingSitemaps", js.undefined)
    
    @scala.inline
    def setContainingSitemapsVarargs(value: String*): Self = StObject.set(x, "containingSitemaps", js.Array(value :_*))
    
    @scala.inline
    def setLinkedFromUrls(value: js.Array[String]): Self = StObject.set(x, "linkedFromUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedFromUrlsUndefined: Self = StObject.set(x, "linkedFromUrls", js.undefined)
    
    @scala.inline
    def setLinkedFromUrlsVarargs(value: String*): Self = StObject.set(x, "linkedFromUrls", js.Array(value :_*))
  }
}
