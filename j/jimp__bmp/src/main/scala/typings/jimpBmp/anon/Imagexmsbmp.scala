package typings.jimpBmp.anon

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imagexmsbmp extends js.Object {
  
  @JSName("image/bmp")
  def imageSlashbmp(data: Buffer): Bitmap = js.native
  @JSName("image/bmp")
  var imageSlashbmp_Original: DecoderFn = js.native
  
  @JSName("image/x-ms-bmp")
  def `imageSlashx-ms-bmp`(data: Buffer): Bitmap = js.native
  @JSName("image/x-ms-bmp")
  var `imageSlashx-ms-bmp_Original`: DecoderFn = js.native
}
