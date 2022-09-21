package typings.inversify

import typings.inversify.interfacesMod.interfaces.ConstructorMetadata
import typings.inversify.interfacesMod.interfaces.MetadataMap
import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataReaderMod {
  
  @JSImport("inversify/lib/planning/metadata_reader", "MetadataReader")
  @js.native
  open class MetadataReader ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.MetadataReader {
    
    /* CompleteClass */
    override def getConstructorMetadata(constructorFunc: NewableFunction): ConstructorMetadata = js.native
    
    /* CompleteClass */
    override def getPropertiesMetadata(constructorFunc: NewableFunction): MetadataMap = js.native
  }
}
