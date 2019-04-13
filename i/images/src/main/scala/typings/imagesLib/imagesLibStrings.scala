package typings
package imagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object imagesLibStrings {
  @js.native
  sealed trait bmp
    extends imagesLib.imagesMod.SupportType
  
  @js.native
  sealed trait gif
    extends imagesLib.imagesMod.SupportType
  
  @js.native
  sealed trait jpg
    extends imagesLib.imagesMod.SupportType
  
  @js.native
  sealed trait png
    extends imagesLib.imagesMod.SupportType
  
  @js.native
  sealed trait raw
    extends imagesLib.imagesMod.SupportType
  
  @js.native
  sealed trait webp
    extends imagesLib.imagesMod.SupportType
  
  @scala.inline
  def bmp: bmp = "bmp".asInstanceOf[bmp]
  @scala.inline
  def gif: gif = "gif".asInstanceOf[gif]
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
}

