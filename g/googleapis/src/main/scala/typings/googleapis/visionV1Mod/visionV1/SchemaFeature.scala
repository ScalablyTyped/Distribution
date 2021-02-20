package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of Google Cloud Vision API detection to perform, and the maximum
  * number of results to return for that type. Multiple `Feature` objects can
  * be specified in the `features` list.
  */
@js.native
trait SchemaFeature extends StObject {
  
  /**
    * Maximum number of results of this type. Does not apply to
    * `TEXT_DETECTION`, `DOCUMENT_TEXT_DETECTION`, or `CROP_HINTS`.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Model to use for the feature. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * The feature type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaFeature {
  
  @scala.inline
  def apply(): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeature]
  }
  
  @scala.inline
  implicit class SchemaFeatureMutableBuilder[Self <: SchemaFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
