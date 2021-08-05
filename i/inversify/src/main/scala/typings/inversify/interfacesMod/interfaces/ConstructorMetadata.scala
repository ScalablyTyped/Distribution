package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorMetadata extends StObject {
  
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]] = js.undefined
  
  var userGeneratedMetadata: MetadataMap
}
object ConstructorMetadata {
  
  inline def apply(userGeneratedMetadata: MetadataMap): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMetadata]
  }
  
  extension [Self <: ConstructorMetadata](x: Self) {
    
    inline def setCompilerGeneratedMetadata(value: js.Array[js.Function]): Self = StObject.set(x, "compilerGeneratedMetadata", value.asInstanceOf[js.Any])
    
    inline def setCompilerGeneratedMetadataUndefined: Self = StObject.set(x, "compilerGeneratedMetadata", js.undefined)
    
    inline def setCompilerGeneratedMetadataVarargs(value: js.Function*): Self = StObject.set(x, "compilerGeneratedMetadata", js.Array(value :_*))
    
    inline def setUserGeneratedMetadata(value: MetadataMap): Self = StObject.set(x, "userGeneratedMetadata", value.asInstanceOf[js.Any])
  }
}
