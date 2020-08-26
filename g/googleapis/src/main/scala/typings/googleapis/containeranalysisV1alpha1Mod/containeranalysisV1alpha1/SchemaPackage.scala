package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular package that is distributed over various
  * channels. e.g. glibc (aka libc6) is distributed by many, at various
  * versions.
  */
@js.native
trait SchemaPackage extends js.Object {
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.native
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPackage {
  @scala.inline
  def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  @scala.inline
  implicit class SchemaPackageOps[Self <: SchemaPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistributionVarargs(value: SchemaDistribution*): Self = this.set("distribution", js.Array(value :_*))
    @scala.inline
    def setDistribution(value: js.Array[SchemaDistribution]): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

