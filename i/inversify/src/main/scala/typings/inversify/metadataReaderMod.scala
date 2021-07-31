package typings.inversify

import typings.inversify.interfacesMod.interfaces.ConstructorMetadata
import typings.inversify.interfacesMod.interfaces.MetadataMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataReaderMod {
  
  @JSImport("inversify/dts/planning/metadata_reader", "MetadataReader")
  @js.native
  class MetadataReader ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.MetadataReader {
    
    /* CompleteClass */
    override def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata = js.native
    
    /* CompleteClass */
    override def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap = js.native
  }
}
