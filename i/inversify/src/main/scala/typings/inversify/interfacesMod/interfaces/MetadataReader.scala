package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataReader extends StObject {
  
  def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata
  
  def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap
}
object MetadataReader {
  
  inline def apply(
    getConstructorMetadata: js.Function => ConstructorMetadata,
    getPropertiesMetadata: js.Function => MetadataMap
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = js.Any.fromFunction1(getConstructorMetadata), getPropertiesMetadata = js.Any.fromFunction1(getPropertiesMetadata))
    __obj.asInstanceOf[MetadataReader]
  }
  
  extension [Self <: MetadataReader](x: Self) {
    
    inline def setGetConstructorMetadata(value: js.Function => ConstructorMetadata): Self = StObject.set(x, "getConstructorMetadata", js.Any.fromFunction1(value))
    
    inline def setGetPropertiesMetadata(value: js.Function => MetadataMap): Self = StObject.set(x, "getPropertiesMetadata", js.Any.fromFunction1(value))
  }
}
