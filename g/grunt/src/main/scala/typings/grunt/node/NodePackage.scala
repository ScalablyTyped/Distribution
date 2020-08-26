package typings.grunt.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://npmjs.org/doc/json.html}
  */
@js.native
trait NodePackage extends js.Object {
  var description: js.UndefOr[String] = js.native
  var homepage: js.UndefOr[String] = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var version: String = js.native
}

object NodePackage {
  @scala.inline
  def apply(name: String, version: String): NodePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePackage]
  }
  @scala.inline
  implicit class NodePackageOps[Self <: NodePackage] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
  }
  
}

