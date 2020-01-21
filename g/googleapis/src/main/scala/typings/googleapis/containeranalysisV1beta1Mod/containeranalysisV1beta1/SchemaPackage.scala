package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular package that is distributed over various
  * channels. E.g., glibc (aka libc6) is distributed by many, at various
  * versions.
  */
@js.native
trait SchemaPackage extends js.Object {
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.native
  /**
    * Required. Immutable. The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPackage {
  @scala.inline
  def apply(distribution: js.Array[SchemaDistribution] = null, name: String = null): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPackage]
  }
}

