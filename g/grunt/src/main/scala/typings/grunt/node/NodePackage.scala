package typings.grunt.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://npmjs.org/doc/json.html}
  */
trait NodePackage extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var version: String
}

object NodePackage {
  @scala.inline
  def apply(
    name: String,
    version: String,
    description: String = null,
    homepage: String = null,
    keywords: js.Array[String] = null
  ): NodePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePackage]
  }
}

