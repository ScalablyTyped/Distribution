package typings.inversify

import typings.inversify.interfacesMod.interfaces.ConstructorMetadata
import typings.inversify.interfacesMod.interfaces.MetadataMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/metadata_reader", JSImport.Namespace)
@js.native
object metadataReaderMod extends js.Object {
  @js.native
  class MetadataReader ()
    extends typings.inversify.interfacesMod.interfaces.MetadataReader {
    /* CompleteClass */
    override def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata = js.native
    /* CompleteClass */
    override def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap = js.native
  }
  
}

