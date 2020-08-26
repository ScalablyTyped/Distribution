package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Version contains structured information about the version of the package.
  * For a discussion of this in Debian/Ubuntu:
  * http://serverfault.com/questions/604541/debian-packages-version-convention
  * For a discussion of this in Redhat/Fedora/Centos:
  * http://blog.jasonantman.com/2014/07/how-yum-and-rpm-compare-versions/
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double] = js.native
  /**
    * Distinguish between sentinel MIN/MAX versions and normal versions. If
    * kind is not NORMAL, then the other fields are ignored.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The main part of the version name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The iteration of the package build from the above version.
    */
  var revision: js.UndefOr[String] = js.native
}

object SchemaVersion {
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  @scala.inline
  implicit class SchemaVersionOps[Self <: SchemaVersion] (val x: Self) extends AnyVal {
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
    def setEpoch(value: Double): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("epoch", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

