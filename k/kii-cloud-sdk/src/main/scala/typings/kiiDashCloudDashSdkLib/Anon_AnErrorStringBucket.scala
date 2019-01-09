package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringBucket[T] extends js.Object {
  def failure(bucket: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, anErrorString: java.lang.String): js.Any
  def success(
    queryPerformed: kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery,
    resultSet: js.Array[T],
    nextQuery: kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery
  ): js.Any
}

