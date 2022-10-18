package typings.inversify.libInterfacesInterfacesMod.interfaces

import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorMetadata extends StObject {
  
  var compilerGeneratedMetadata: js.UndefOr[js.Array[NewableFunction]] = js.undefined
  
  var userGeneratedMetadata: MetadataMap
}
object ConstructorMetadata {
  
  inline def apply(userGeneratedMetadata: MetadataMap): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMetadata]
  }
  
  extension [Self <: ConstructorMetadata](x: Self) {
    
    inline def setCompilerGeneratedMetadata(value: js.Array[NewableFunction]): Self = StObject.set(x, "compilerGeneratedMetadata", value.asInstanceOf[js.Any])
    
    inline def setCompilerGeneratedMetadataUndefined: Self = StObject.set(x, "compilerGeneratedMetadata", js.undefined)
    
    inline def setCompilerGeneratedMetadataVarargs(value: NewableFunction*): Self = StObject.set(x, "compilerGeneratedMetadata", js.Array(value*))
    
    inline def setUserGeneratedMetadata(value: MetadataMap): Self = StObject.set(x, "userGeneratedMetadata", value.asInstanceOf[js.Any])
  }
}
