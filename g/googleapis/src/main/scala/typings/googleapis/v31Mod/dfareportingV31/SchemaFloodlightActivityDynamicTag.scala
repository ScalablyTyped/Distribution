package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Tag
  */
@js.native
trait SchemaFloodlightActivityDynamicTag extends StObject {
  
  /**
    * ID of this dynamic tag. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of this tag.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Tag code.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaFloodlightActivityDynamicTag {
  
  @scala.inline
  def apply(): SchemaFloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityDynamicTag]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivityDynamicTagMutableBuilder[Self <: SchemaFloodlightActivityDynamicTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
