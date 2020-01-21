package typings.lwip.mod

import typings.lwip.lwipStrings.gif
import typings.lwip.lwipStrings.jpg
import typings.lwip.lwipStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch extends js.Object {
  /**
    * Gaussian blur.
    * @param sigma Standard deviation of the Gaussian filter.
    */
  def blur(sigma: Double): Batch = js.native
  /**
    * Add a colored border to the image.
    * @param width Border width in pixels.
    */
  def border(width: Double): Batch = js.native
  /**
    * Add a colored border to the image.
    * @param width Border width in pixels.
    * @param color Color of the border.
    */
  def border(width: Double, color: Color): Batch = js.native
  /**
    * Contain the image in a colored canvas. The image will be resized to the largest possible size such that it's fully contained inside the canvas.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    */
  def contain(width: Double, height: Double): Batch = js.native
  /**
    * Contain the image in a colored canvas. The image will be resized to the largest possible size such that it's fully contained inside the canvas.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    * @param color Color of the canvas.
    */
  def contain(width: Double, height: Double, color: Color): Batch = js.native
  /**
    * Contain the image in a colored canvas. The image will be resized to the largest possible size such that it's fully contained inside the canvas.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    * @param color Color of the canvas.
    * @param inter Interpolation method.
    */
  def contain(width: Double, height: Double, color: Color, inter: String): Batch = js.native
  /**
    * Contain the image in a colored canvas. The image will be resized to the largest possible size such that it's fully contained inside the canvas.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    * @param inter Interpolation method.
    */
  def contain(width: Double, height: Double, inter: String): Batch = js.native
  /**
    * Cover a canvas with the image. The image will be resized to the smallest possible size such that both its dimensions are bigger than the canvas's dimensions. Margins of the image exceeding the canvas will be discarded.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    */
  def cover(width: Double, height: Double): Batch = js.native
  /**
    * Cover a canvas with the image. The image will be resized to the smallest possible size such that both its dimensions are bigger than the canvas's dimensions. Margins of the image exceeding the canvas will be discarded.
    * @param width Canvas' width in pixels.
    * @param height Canvas' height in pixels.
    * @param inter Interpolation method.
    */
  def cover(width: Double, height: Double, inter: String): Batch = js.native
  /**
    * Crop with rectangle coordinates
    */
  def crop(left: Double, top: Double, right: Double, bottom: Double): Batch = js.native
  /**
    * Crop a rectangle from center
    * @param width Width of the rectangle to crop from the center of the image.
    * @param height Height of the rectangle to crop from the center of the image.
    */
  def crop(width: Double, height: Double): Batch = js.native
  /**
    * Adjust image lightness. Equivalent to image.lighten(-delta, callback).
    * @param delta By how much to increase / decrease the lightness.
    */
  def darken(delta: Double): Batch = js.native
  // Executing a batch
  /**
    * Execute batch and obtain the manipulated image object
    */
  def exec(callback: ImageCallback): Unit = js.native
  /**
    * Adjust image transperancy.
    * 
    * Examples:
    * 1. image.fade(0, ...) will have no effect on the image.
    * 2. image.fade(0.5, ...) will increase the transparency by 50%.
    * 3. image.fade(1, ...) will make the image completely transparent.
    * 
    * Note: The transparency is adjusted independently for each pixel.
    * 
    * @param delta By how much to increase / decrease the transperancy.
    */
  def fade(delta: Double): Batch = js.native
  /**
    * Alias of mirror. Mirror an image along the 'x' axis, 'y' axis or both.
    * @param axes 'x', 'y' or 'xy' (case sensitive).
    */
  def flip(axes: String): Batch = js.native
  /**
    * Adjust image hue.
    * 
    * Examples:
    * 1. image.hue(0, ...) will have no effect on the image.
    * 2. image.hue(100, ...) will shift pixels' hue by 100 degrees.
    * 
    * Note: The hue is shifted in a circular manner in the range [0,360] for each pixel individually.
    * 
    * @param shift By how many degrees to shift each pixel's hue.
    */
  def hue(shift: Double): Batch = js.native
  /**
    * Adjust image lightness.
    * 
    * Examples:
    * 1. image.lighten(0, ...) will have no effect on the image.
    * 2. image.lighten(0.5, ...) will increase the lightness by 50%.
    * 3. image.lighten(-1, ...) will decrease the lightness by 100%, effectively making the image black.
    * 
    * @param delta By how much to increase / decrease the lightness.
    */
  def lighten(delta: Double): Batch = js.native
  /**
    * Mirror an image along the 'x' axis, 'y' axis or both.
    * @param axes 'x', 'y' or 'xy' (case sensitive).
    */
  def mirror(axes: String): Batch = js.native
  /**
    * Make image completely opaque.
    */
  def opacity(callback: ImageCallback): Unit = js.native
  /**
    * Pad image edges with colored pixels.
    * @param left Number of pixels to add to left edge.
    * @param top Number of pixels to add to top edge.
    * @param right Number of pixels to add to right edge.
    * @param bottom Number of pixels to add to bottom edge.
    */
  def pad(left: Double, top: Double, right: Double, bottom: Double): Batch = js.native
  /**
    * Pad image edges with colored pixels.
    * @param left Number of pixels to add to left edge.
    * @param top Number of pixels to add to top edge.
    * @param right Number of pixels to add to right edge.
    * @param bottom Number of pixels to add to bottom edge.
    * @param color Color of the padding.
    */
  def pad(left: Double, top: Double, right: Double, bottom: Double, color: Color): Batch = js.native
  /**
    * Paste an image on top of this image.
    * 
    * Notes:
    * 1. If the pasted image exceeds the bounds of the base image, an exception is thrown.
    * 2. img is pasted in the state it was at the time image.paste( ... ) was called, eventhough callback is called asynchronously.
    * 3. For transparent images, alpha blending is done according to the equations described here.
    * 4. Extra caution is required when using this method in batch mode, as the images may change by the time this operation is called.
    * 
    * @param left Coordinates of the left corner of the pasted image.
    * @param top Coordinates of the top corner of the pasted image.
    * @param img The image to paste.
    */
  def paste(left: Double, top: Double, img: Image): Batch = js.native
  // Using a batch object
  /**
    * Resize
    * @param Width in pixels.
    */
  def resize(width: Double): Batch = js.native
  /**
    * Resize
    * @param Width in pixels.
    * @param Height in pixels.
    */
  def resize(width: Double, height: Double): Batch = js.native
  /**
    * Resize
    * @param Width in pixels.
    * @param Height in pixels.
    * @param Interpolation method.
    */
  def resize(width: Double, height: Double, inter: String): Batch = js.native
  /**
    * Resize
    * @param Width in pixels.
    * @param Interpolation method.
    */
  def resize(width: Double, inter: String): Batch = js.native
  /**
    * Rotate
    * @param degs Clockwise rotation degrees.
    */
  def rotate(degs: Double): Batch = js.native
  /**
    * Rotate
    * @param degs Clockwise rotation degrees.
    * @param color Color of the canvas.
    */
  def rotate(degs: Double, color: Color): Batch = js.native
  /**
    * Adjust image saturation.
    * 
    * Examples:
    * 1. image.saturate(0, ...) will have no effect on the image.
    * 2. image.saturate(0.5, ...) will increase the saturation by 50%.
    * 3. image.saturate(-1, ...) will decrease the saturation by 100%, effectively desaturating the image.
    * 
    * @param delta By how much to increase / decrease the saturation.
    */
  def saturate(delta: Double): Batch = js.native
  /**
    * Scale
    * @param wRatio Width scale ratio.
    */
  def scale(wRatio: Double): Batch = js.native
  /**
    * Scale
    * @param wRatio Width scale ratio.
    * @param hRatio Height scale ratio.
    */
  def scale(wRatio: Double, hRatio: Double): Batch = js.native
  /**
    * Scale
    * @param wRatio Width scale ratio.
    * @param hRatio Height scale ratio.
    * @param inter Interpolation method.
    */
  def scale(wRatio: Double, hRatio: Double, inter: String): Batch = js.native
  /**
    * Scale
    * @param wRatio Width scale ratio.
    * @param inter Interpolation method.
    */
  def scale(wRatio: Double, inter: String): Batch = js.native
  /**
    * Set the metadata in an image. This is currently only supported for PNG files. Sets a tEXt chunk with the key lwip_data and comment as the given string. If called with a null parameter, removes existing metadata from the image, if present.
    * @param metadata A string of arbitrary length, or null.
    */
  def setMetaData(metadata: String): Unit = js.native
  /**
    * Set the color of a pixel.
    * 
    * Notes:
    * 1. If the coordinates exceed the bounds of the image, an exception is thrown.
    * 2. Extra caution is required when using this method in batch mode, as the dimensions of the image may change by the time this operation is called.
    * 
    * @param left Coordinates of the pixel from the left corner of the image.
    * @param top Coordinates of the pixel from the top corner of the image.
    * @param color Color of the pixel to set.
    */
  def setPixel(left: Double, top: Double, color: Color): Batch = js.native
  /**
    * Inverse diffusion shapren.
    * @param amplitude Sharpening amplitude.
    */
  def sharpen(amplitude: Double): Batch = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    */
  def toBuffer(format: String, callback: BufferCallback): Unit = js.native
  def toBuffer(format: String, params: GifBufferParams, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  def toBuffer(format: String, params: JpegBufferParams, callback: BufferCallback): Unit = js.native
  def toBuffer(format: String, params: PngBufferParams, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    */
  @JSName("toBuffer")
  def toBuffer_gif(format: gif, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("toBuffer")
  def toBuffer_gif(format: gif, params: GifBufferParams, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    */
  @JSName("toBuffer")
  def toBuffer_jpg(format: jpg, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("toBuffer")
  def toBuffer_jpg(format: jpg, params: JpegBufferParams, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    */
  @JSName("toBuffer")
  def toBuffer_png(format: png, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and obtain a Buffer object
    * 
    * When opening an image, it is decoded and stored in memory as an uncompressed image. All manipulations are done on the uncompressed data in memory. This method allows to encode the image to one of the specified formats and get the encoded data as a NodeJS Buffer object.
    * 
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("toBuffer")
  def toBuffer_png(format: png, params: PngBufferParams, callback: BufferCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    */
  def writeFile(path: String, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    */
  def writeFile(path: String, format: String, callback: ImageCallback): Unit = js.native
  def writeFile(path: String, format: String, params: GifBufferParams, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  def writeFile(path: String, format: String, params: JpegBufferParams, callback: ImageCallback): Unit = js.native
  def writeFile(path: String, format: String, params: PngBufferParams, callback: ImageCallback): Unit = js.native
  def writeFile(path: String, params: GifBufferParams, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param params Format-specific parameters.
    */
  def writeFile(path: String, params: JpegBufferParams, callback: ImageCallback): Unit = js.native
  def writeFile(path: String, params: PngBufferParams, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    */
  @JSName("writeFile")
  def writeFile_gif(path: String, format: gif, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("writeFile")
  def writeFile_gif(path: String, format: gif, params: GifBufferParams, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    */
  @JSName("writeFile")
  def writeFile_jpg(path: String, format: jpg, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("writeFile")
  def writeFile_jpg(path: String, format: jpg, params: JpegBufferParams, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    */
  @JSName("writeFile")
  def writeFile_png(path: String, format: png, callback: ImageCallback): Unit = js.native
  /**
    * Execute batch and write to file
    * 
    * @param path Path of file to write.
    * @param format Encoding format.
    * @param params Format-specific parameters.
    */
  @JSName("writeFile")
  def writeFile_png(path: String, format: png, params: PngBufferParams, callback: ImageCallback): Unit = js.native
}

