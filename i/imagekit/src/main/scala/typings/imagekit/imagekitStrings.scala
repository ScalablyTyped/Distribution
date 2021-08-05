package typings.imagekit

import typings.imagekit.mod.global.ImageKit.FileType
import typings.imagekit.mod.global.ImageKit.Item
import typings.imagekit.mod.global.ImageKit.TransformationPosition
import typings.imagekit.mod.global.ImageKit._FileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagekitStrings {
  
  @js.native
  sealed trait Completed extends StObject
  inline def Completed: Completed = "Completed".asInstanceOf[Completed]
  
  @js.native
  sealed trait Pending extends StObject
  inline def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @js.native
  sealed trait all
    extends StObject
       with FileType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait css
    extends StObject
       with _FileFormat
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait file
    extends StObject
       with Item
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait folder
    extends StObject
       with Item
  inline def folder: folder = "folder".asInstanceOf[folder]
  
  @js.native
  sealed trait gif
    extends StObject
       with _FileFormat
  inline def gif: gif = "gif".asInstanceOf[gif]
  
  @js.native
  sealed trait image
    extends StObject
       with FileType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait jpg
    extends StObject
       with _FileFormat
  inline def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @js.native
  sealed trait js_
    extends StObject
       with _FileFormat
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait m3u8
    extends StObject
       with _FileFormat
  inline def m3u8: m3u8 = "m3u8".asInstanceOf[m3u8]
  
  @js.native
  sealed trait mov
    extends StObject
       with _FileFormat
  inline def mov: mov = "mov".asInstanceOf[mov]
  
  @js.native
  sealed trait mp4
    extends StObject
       with _FileFormat
  inline def mp4: mp4 = "mp4".asInstanceOf[mp4]
  
  @js.native
  sealed trait `non-image`
    extends StObject
       with FileType
  inline def `non-image`: `non-image` = "non-image".asInstanceOf[`non-image`]
  
  @js.native
  sealed trait path
    extends StObject
       with TransformationPosition
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pdf
    extends StObject
       with _FileFormat
  inline def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @js.native
  sealed trait png
    extends StObject
       with _FileFormat
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait query
    extends StObject
       with TransformationPosition
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait svg
    extends StObject
       with _FileFormat
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait swf
    extends StObject
       with _FileFormat
  inline def swf: swf = "swf".asInstanceOf[swf]
  
  @js.native
  sealed trait ts
    extends StObject
       with _FileFormat
  inline def ts: ts = "ts".asInstanceOf[ts]
  
  @js.native
  sealed trait txt
    extends StObject
       with _FileFormat
  inline def txt: txt = "txt".asInstanceOf[txt]
  
  @js.native
  sealed trait webm
    extends StObject
       with _FileFormat
  inline def webm: webm = "webm".asInstanceOf[webm]
  
  @js.native
  sealed trait webp
    extends StObject
       with _FileFormat
  inline def webp: webp = "webp".asInstanceOf[webp]
}
