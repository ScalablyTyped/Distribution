package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("qrcode")
@js.native
object qrcode extends js.Object {
  // tslint:disable-next-line:prefer-method-signature
  var callback: js.Function1[/* result */ java.lang.String, scala.Unit] = js.native
  var debug: scala.Boolean = js.native
  var height: scala.Double = js.native
  var imagedata: stdLib.ImageData = js.native
  var maxImgSize: scala.Double = js.native
  var qrCodeSymbol: js.Any = js.native
  val sizeOfDataLengthInfo: js.Tuple3[
    js.Tuple4[
      jsqrcodeLib.jsqrcodeLibNumbers.`10`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`9`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`8`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`8`
    ], 
    js.Tuple4[
      jsqrcodeLib.jsqrcodeLibNumbers.`12`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`11`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`16`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`10`
    ], 
    js.Tuple4[
      jsqrcodeLib.jsqrcodeLibNumbers.`14`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`13`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`16`, 
      jsqrcodeLib.jsqrcodeLibNumbers.`12`
    ]
  ] = js.native
  var width: scala.Double = js.native
  def binarize(th: scala.Double): js.Array[scala.Boolean] = js.native
  def captureToCanvas(): scala.Unit = js.native
  def decode(): scala.Unit = js.native
  def decode(src: java.lang.String): scala.Unit = js.native
  def decode_url(s: java.lang.String): java.lang.String = js.native
  def decode_utf8(s: java.lang.String): java.lang.String = js.native
  def getMiddleBrightnessPerArea(image: js.Array[scala.Double]): js.Array[js.Array[scala.Double]] = js.native
  def getPixel(x: scala.Double, y: scala.Double): scala.Double = js.native
  def grayScaleToBitmap(grayScale: js.Array[scala.Double]): stdLib.Uint8Array = js.native
  def grayscale(): stdLib.Uint8Array = js.native
  def isUrl(s: java.lang.String): scala.Boolean = js.native
  def orderBestPatterns(patterns: js.Array[jsqrcodeLib.AlignmentPattern]): scala.Unit = js.native
  def process(ctx: stdLib.CanvasRenderingContext2D): java.lang.String = js.native
  def setWebcam(videoId: java.lang.String): scala.Unit = js.native
  def vidError(): scala.Unit = js.native
  def vidError(error: js.Any): scala.Unit = js.native
}

