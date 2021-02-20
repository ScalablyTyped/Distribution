package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Screen orientation of the device.
  */
@js.native
trait SchemaOrientation extends StObject {
  
  /**
    * The id for this orientation. Example: &quot;portrait&quot;.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A human-friendly name for this orientation. Example:
    * &quot;portrait&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaOrientation {
  
  @scala.inline
  def apply(): SchemaOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrientation]
  }
  
  @scala.inline
  implicit class SchemaOrientationMutableBuilder[Self <: SchemaOrientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
