package typings
package jqueryDotQrcodeLib.JQueryQRCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("JQueryQRCode.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait IMAGE_BOX
    extends jqueryDotQrcodeLib.JQueryQRCodeNs.Mode
  
  @js.native
  sealed trait IMAGE_STRIP
    extends jqueryDotQrcodeLib.JQueryQRCodeNs.Mode
  
  @js.native
  sealed trait LABEL_BOX
    extends jqueryDotQrcodeLib.JQueryQRCodeNs.Mode
  
  @js.native
  sealed trait LABEL_STRIP
    extends jqueryDotQrcodeLib.JQueryQRCodeNs.Mode
  
  @js.native
  sealed trait NORMAL
    extends jqueryDotQrcodeLib.JQueryQRCodeNs.Mode
  
  val IMAGE_BOX: IMAGE_BOX with java.lang.String = js.native
  val IMAGE_STRIP: IMAGE_STRIP with java.lang.String = js.native
  val LABEL_BOX: LABEL_BOX with java.lang.String = js.native
  val LABEL_STRIP: LABEL_STRIP with java.lang.String = js.native
  val NORMAL: NORMAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jqueryDotQrcodeLib.JQueryQRCodeNs.Mode with java.lang.String] = js.native
}

