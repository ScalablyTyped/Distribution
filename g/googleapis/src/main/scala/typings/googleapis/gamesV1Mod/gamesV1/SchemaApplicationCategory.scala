package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an application category object.
  */
trait SchemaApplicationCategory extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationCategory.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The primary category.
    */
  var primary: js.UndefOr[String] = js.undefined
  
  /**
    * The secondary category.
    */
  var secondary: js.UndefOr[String] = js.undefined
}
object SchemaApplicationCategory {
  
  @scala.inline
  def apply(): SchemaApplicationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationCategory]
  }
  
  @scala.inline
  implicit class SchemaApplicationCategoryMutableBuilder[Self <: SchemaApplicationCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
