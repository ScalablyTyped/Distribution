package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultDisplayMetadata extends StObject {
  
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[SchemaResultDisplayLine]] = js.undefined
  
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String] = js.undefined
}
object SchemaResultDisplayMetadata {
  
  @scala.inline
  def apply(): SchemaResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayMetadata]
  }
  
  @scala.inline
  implicit class SchemaResultDisplayMetadataMutableBuilder[Self <: SchemaResultDisplayMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalines(value: js.Array[SchemaResultDisplayLine]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    @scala.inline
    def setMetalinesVarargs(value: SchemaResultDisplayLine*): Self = StObject.set(x, "metalines", js.Array(value :_*))
    
    @scala.inline
    def setObjectTypeLabel(value: String): Self = StObject.set(x, "objectTypeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeLabelUndefined: Self = StObject.set(x, "objectTypeLabel", js.undefined)
  }
}
