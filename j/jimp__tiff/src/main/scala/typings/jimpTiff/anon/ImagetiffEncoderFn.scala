package typings.jimpTiff.anon

import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagetiffEncoderFn extends js.Object {
  
  @JSName("image/tiff")
  def imageSlashtiff(image: Image): Buffer = js.native
  @JSName("image/tiff")
  var imageSlashtiff_Original: EncoderFn[Image] = js.native
}
