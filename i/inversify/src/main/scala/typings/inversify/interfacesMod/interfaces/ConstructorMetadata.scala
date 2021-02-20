package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorMetadata extends StObject {
  
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]] = js.native
  
  var userGeneratedMetadata: MetadataMap = js.native
}
object ConstructorMetadata {
  
  @scala.inline
  def apply(userGeneratedMetadata: MetadataMap): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMetadata]
  }
  
  @scala.inline
  implicit class ConstructorMetadataMutableBuilder[Self <: ConstructorMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerGeneratedMetadata(value: js.Array[js.Function]): Self = StObject.set(x, "compilerGeneratedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerGeneratedMetadataUndefined: Self = StObject.set(x, "compilerGeneratedMetadata", js.undefined)
    
    @scala.inline
    def setCompilerGeneratedMetadataVarargs(value: js.Function*): Self = StObject.set(x, "compilerGeneratedMetadata", js.Array(value :_*))
    
    @scala.inline
    def setUserGeneratedMetadata(value: MetadataMap): Self = StObject.set(x, "userGeneratedMetadata", value.asInstanceOf[js.Any])
  }
}
