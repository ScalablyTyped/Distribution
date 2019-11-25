package typings.libnpmsearch.libnpmsearchMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var maintainers: js.UndefOr[js.Array[Maintainer]] = js.undefined
  var name: String
  var version: String
}

object Result {
  @scala.inline
  def apply(
    name: String,
    version: String,
    date: Date = null,
    description: String = null,
    keywords: js.Array[String] = null,
    maintainers: js.Array[Maintainer] = null
  ): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

