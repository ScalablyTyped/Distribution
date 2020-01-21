package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataReader extends js.Object {
  def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata
  def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap
}

object MetadataReader {
  @scala.inline
  def apply(
    getConstructorMetadata: js.Function => ConstructorMetadata,
    getPropertiesMetadata: js.Function => MetadataMap
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = js.Any.fromFunction1(getConstructorMetadata), getPropertiesMetadata = js.Any.fromFunction1(getPropertiesMetadata))
  
    __obj.asInstanceOf[MetadataReader]
  }
}

