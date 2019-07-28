package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOption extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var desiredResponseDataType: js.UndefOr[DataType] = js.undefined
  var files: js.UndefOr[js.Array[IFileData]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object IOption {
  @scala.inline
  def apply(
    data: js.Any = null,
    desiredResponseDataType: DataType = null,
    files: js.Array[IFileData] = null,
    method: String = null,
    timeoutInSeconds: Int | Double = null,
    url: String = null
  ): IOption = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (desiredResponseDataType != null) __obj.updateDynamic("desiredResponseDataType")(desiredResponseDataType)
    if (files != null) __obj.updateDynamic("files")(files)
    if (method != null) __obj.updateDynamic("method")(method)
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IOption]
  }
}

