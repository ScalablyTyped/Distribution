package typings.imagekit

import typings.imagekit.mod.global.ImageKit.FileType
import typings.imagekit.mod.global.ImageKit.Item
import typings.imagekit.mod.global.ImageKit.TransformationPosition
import typings.imagekit.mod.global.ImageKit._FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagekitStrings {
  
  @scala.inline
  def Completed: Completed = "Completed".asInstanceOf[Completed]
  
  @scala.inline
  def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def css: css = "css".asInstanceOf[css]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def folder: folder = "folder".asInstanceOf[folder]
  
  @scala.inline
  def gif: gif = "gif".asInstanceOf[gif]
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @scala.inline
  def m3u8: m3u8 = "m3u8".asInstanceOf[m3u8]
  
  @scala.inline
  def mov: mov = "mov".asInstanceOf[mov]
  
  @scala.inline
  def mp4: mp4 = "mp4".asInstanceOf[mp4]
  
  @scala.inline
  def `non-image`: `non-image` = "non-image".asInstanceOf[`non-image`]
  
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def svg: svg = "svg".asInstanceOf[svg]
  
  @scala.inline
  def swf: swf = "swf".asInstanceOf[swf]
  
  @scala.inline
  def ts: ts = "ts".asInstanceOf[ts]
  
  @scala.inline
  def txt: txt = "txt".asInstanceOf[txt]
  
  @scala.inline
  def webm: webm = "webm".asInstanceOf[webm]
  
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
  
  @js.native
  sealed trait Completed extends js.Object
  
  @js.native
  sealed trait Pending extends js.Object
  
  @js.native
  sealed trait all extends FileType
  
  @js.native
  sealed trait css extends _FileFormat
  
  @js.native
  sealed trait file extends Item
  
  @js.native
  sealed trait folder extends Item
  
  @js.native
  sealed trait gif extends _FileFormat
  
  @js.native
  sealed trait image extends FileType
  
  @js.native
  sealed trait jpg extends _FileFormat
  
  @js.native
  sealed trait js_ extends _FileFormat
  
  @js.native
  sealed trait m3u8 extends _FileFormat
  
  @js.native
  sealed trait mov extends _FileFormat
  
  @js.native
  sealed trait mp4 extends _FileFormat
  
  @js.native
  sealed trait `non-image` extends FileType
  
  @js.native
  sealed trait path extends TransformationPosition
  
  @js.native
  sealed trait pdf extends _FileFormat
  
  @js.native
  sealed trait png extends _FileFormat
  
  @js.native
  sealed trait query extends TransformationPosition
  
  @js.native
  sealed trait svg extends _FileFormat
  
  @js.native
  sealed trait swf extends _FileFormat
  
  @js.native
  sealed trait ts extends _FileFormat
  
  @js.native
  sealed trait txt extends _FileFormat
  
  @js.native
  sealed trait webm extends _FileFormat
  
  @js.native
  sealed trait webp extends _FileFormat
}
