package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataContentTypeInfo extends js.Object {
  /**
    * gdata
    */
  var bestGuess: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromFileName: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromHeader: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var fromUrlPath: js.UndefOr[String] = js.native
}

object SchemaGdataContentTypeInfo {
  @scala.inline
  def apply(
    bestGuess: String = null,
    fromBytes: String = null,
    fromFileName: String = null,
    fromHeader: String = null,
    fromUrlPath: String = null
  ): SchemaGdataContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (bestGuess != null) __obj.updateDynamic("bestGuess")(bestGuess.asInstanceOf[js.Any])
    if (fromBytes != null) __obj.updateDynamic("fromBytes")(fromBytes.asInstanceOf[js.Any])
    if (fromFileName != null) __obj.updateDynamic("fromFileName")(fromFileName.asInstanceOf[js.Any])
    if (fromHeader != null) __obj.updateDynamic("fromHeader")(fromHeader.asInstanceOf[js.Any])
    if (fromUrlPath != null) __obj.updateDynamic("fromUrlPath")(fromUrlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataContentTypeInfo]
  }
}

