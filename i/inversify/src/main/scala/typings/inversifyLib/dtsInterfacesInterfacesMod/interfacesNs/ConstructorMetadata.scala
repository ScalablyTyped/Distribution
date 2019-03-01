package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorMetadata extends js.Object {
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]]
  var userGeneratedMetadata: MetadataMap
}

object ConstructorMetadata {
  @scala.inline
  def apply(userGeneratedMetadata: MetadataMap, compilerGeneratedMetadata: js.Array[js.Function] = null): ConstructorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userGeneratedMetadata")(userGeneratedMetadata)
    if (compilerGeneratedMetadata != null) __obj.updateDynamic("compilerGeneratedMetadata")(compilerGeneratedMetadata)
    __obj.asInstanceOf[ConstructorMetadata]
  }
}

