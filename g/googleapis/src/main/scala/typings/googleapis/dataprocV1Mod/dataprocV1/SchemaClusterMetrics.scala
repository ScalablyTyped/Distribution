package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains cluster daemon metrics, such as HDFS and YARN stats.Beta Feature:
  * This report is available for testing purposes only. It may be changed
  * before final release.
  */
@js.native
trait SchemaClusterMetrics extends js.Object {
  /**
    * The HDFS metrics.
    */
  var hdfsMetrics: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The YARN metrics.
    */
  var yarnMetrics: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaClusterMetrics {
  @scala.inline
  def apply(hdfsMetrics: StringDictionary[String] = null, yarnMetrics: StringDictionary[String] = null): SchemaClusterMetrics = {
    val __obj = js.Dynamic.literal()
    if (hdfsMetrics != null) __obj.updateDynamic("hdfsMetrics")(hdfsMetrics.asInstanceOf[js.Any])
    if (yarnMetrics != null) __obj.updateDynamic("yarnMetrics")(yarnMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterMetrics]
  }
}

