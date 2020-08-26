package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialReportData
import typings.mangopay2NodejsSdk.mod.report.Filters
import typings.mangopay2NodejsSdk.mod.report.ReportData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Report")
@js.native
class Report ()
  extends EntityBase[ReportData]
     with Filters
     with ReportData {
  def this(data: PartialReportData) = this()
}

