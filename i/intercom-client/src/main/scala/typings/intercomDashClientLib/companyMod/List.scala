package typings
package intercomDashClientLib.companyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait List extends js.Object {
  var companies: js.Array[Company with CompanyIdentifier]
  var pages: intercomDashClientLib.Anon_Next
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.companyDOTlist
}

