package typings.inversify.libInterfacesInterfacesMod.interfaces

import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataReader extends StObject {
  
  def getConstructorMetadata(constructorFunc: NewableFunction): ConstructorMetadata
  
  def getPropertiesMetadata(constructorFunc: NewableFunction): MetadataMap
}
object MetadataReader {
  
  inline def apply(
    getConstructorMetadata: NewableFunction => ConstructorMetadata,
    getPropertiesMetadata: NewableFunction => MetadataMap
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = js.Any.fromFunction1(getConstructorMetadata), getPropertiesMetadata = js.Any.fromFunction1(getPropertiesMetadata))
    __obj.asInstanceOf[MetadataReader]
  }
  
  extension [Self <: MetadataReader](x: Self) {
    
    inline def setGetConstructorMetadata(value: NewableFunction => ConstructorMetadata): Self = StObject.set(x, "getConstructorMetadata", js.Any.fromFunction1(value))
    
    inline def setGetPropertiesMetadata(value: NewableFunction => MetadataMap): Self = StObject.set(x, "getPropertiesMetadata", js.Any.fromFunction1(value))
  }
}
