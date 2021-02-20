package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A feature description of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#featuredesc.
  */
@js.native
trait SchemaFeatureDescription extends StObject {
  
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String] = js.native
  
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaFeatureDescription {
  
  @scala.inline
  def apply(): SchemaFeatureDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureDescription]
  }
  
  @scala.inline
  implicit class SchemaFeatureDescriptionMutableBuilder[Self <: SchemaFeatureDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
