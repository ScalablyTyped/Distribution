package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

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
    getConstructorMetadata: js.Function1[js.Function, ConstructorMetadata],
    getPropertiesMetadata: js.Function1[js.Function, MetadataMap]
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = getConstructorMetadata, getPropertiesMetadata = getPropertiesMetadata)
  
    __obj.asInstanceOf[MetadataReader]
  }
}

