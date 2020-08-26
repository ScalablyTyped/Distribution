package typings.gulpRevReplace.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var canonicalUris: js.UndefOr[Boolean] = js.native
  var manifest: js.UndefOr[ReadWriteStream] = js.native
  var modifyReved: js.UndefOr[js.Function] = js.native
  var modifyUnreved: js.UndefOr[js.Function] = js.native
  var prefix: js.UndefOr[String] = js.native
  var replaceInExtensions: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCanonicalUris(value: Boolean): Self = this.set("canonicalUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalUris: Self = this.set("canonicalUris", js.undefined)
    @scala.inline
    def setManifest(value: ReadWriteStream): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setModifyReved(value: js.Function): Self = this.set("modifyReved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyReved: Self = this.set("modifyReved", js.undefined)
    @scala.inline
    def setModifyUnreved(value: js.Function): Self = this.set("modifyUnreved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyUnreved: Self = this.set("modifyUnreved", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setReplaceInExtensionsVarargs(value: String*): Self = this.set("replaceInExtensions", js.Array(value :_*))
    @scala.inline
    def setReplaceInExtensions(value: js.Array[String]): Self = this.set("replaceInExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceInExtensions: Self = this.set("replaceInExtensions", js.undefined)
  }
  
}

