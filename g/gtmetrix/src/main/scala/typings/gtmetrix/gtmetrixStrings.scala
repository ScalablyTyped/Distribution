package typings.gtmetrix

import typings.gtmetrix.mod.BinaryResourceType
import typings.gtmetrix.mod.NonBinaryResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gtmetrixStrings {
  @js.native
  sealed trait filmstrip extends BinaryResourceType
  
  @js.native
  sealed trait har extends NonBinaryResourceType
  
  @js.native
  sealed trait pagespeed extends NonBinaryResourceType
  
  @js.native
  sealed trait `pagespeed-files` extends BinaryResourceType
  
  @js.native
  sealed trait `report-pdf` extends BinaryResourceType
  
  @js.native
  sealed trait `report-pdf-full` extends BinaryResourceType
  
  @js.native
  sealed trait screenshot extends BinaryResourceType
  
  @js.native
  sealed trait video extends BinaryResourceType
  
  @js.native
  sealed trait yslow extends NonBinaryResourceType
  
  @scala.inline
  def filmstrip: filmstrip = "filmstrip".asInstanceOf[filmstrip]
  @scala.inline
  def har: har = "har".asInstanceOf[har]
  @scala.inline
  def pagespeed: pagespeed = "pagespeed".asInstanceOf[pagespeed]
  @scala.inline
  def `pagespeed-files`: `pagespeed-files` = "pagespeed-files".asInstanceOf[`pagespeed-files`]
  @scala.inline
  def `report-pdf`: `report-pdf` = "report-pdf".asInstanceOf[`report-pdf`]
  @scala.inline
  def `report-pdf-full`: `report-pdf-full` = "report-pdf-full".asInstanceOf[`report-pdf-full`]
  @scala.inline
  def screenshot: screenshot = "screenshot".asInstanceOf[screenshot]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def yslow: yslow = "yslow".asInstanceOf[yslow]
}

