package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A location/region designation for language.
  */
@js.native
trait SchemaLocale extends StObject {
  
  /**
    * The id for this locale. Example: &quot;en_US&quot;.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A human-friendly name for this language/locale. Example:
    * &quot;English&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A human-friendly string representing the region for this locale. Example:
    * &quot;United States&quot;. Not present for every locale.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaLocale {
  
  @scala.inline
  def apply(): SchemaLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocale]
  }
  
  @scala.inline
  implicit class SchemaLocaleMutableBuilder[Self <: SchemaLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
