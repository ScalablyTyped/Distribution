package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The placeholder information that uniquely identifies a placeholder shape.
  */
@js.native
trait SchemaPlaceholder extends StObject {
  
  /**
    * The index of the placeholder. If the same placeholder types are present
    * in the same page, they would have different index values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * The object ID of this shape&#39;s parent placeholder. If unset, the
    * parent placeholder shape does not exist, so the shape does not inherit
    * properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String] = js.native
  
  /**
    * The type of the placeholder.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaPlaceholder {
  
  @scala.inline
  def apply(): SchemaPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceholder]
  }
  
  @scala.inline
  implicit class SchemaPlaceholderMutableBuilder[Self <: SchemaPlaceholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setParentObjectId(value: String): Self = StObject.set(x, "parentObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentObjectIdUndefined: Self = StObject.set(x, "parentObjectId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
