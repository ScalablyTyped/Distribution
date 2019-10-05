package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorMetadata extends js.Object {
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]] = js.undefined
  var userGeneratedMetadata: MetadataMap
}

object ConstructorMetadata {
  @scala.inline
  def apply(userGeneratedMetadata: MetadataMap, compilerGeneratedMetadata: js.Array[js.Function] = null): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata)
    if (compilerGeneratedMetadata != null) __obj.updateDynamic("compilerGeneratedMetadata")(compilerGeneratedMetadata)
    __obj.asInstanceOf[ConstructorMetadata]
  }
}

