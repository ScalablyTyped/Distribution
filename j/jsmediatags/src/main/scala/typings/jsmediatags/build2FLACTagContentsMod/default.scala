package typings.jsmediatags.build2FLACTagContentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
@js.native
class default () extends FLACTagContents {
  def this(blocks: js.Array[MetadataBlock]) = this()
  /* CompleteClass */
  override var blocks: js.Array[MetadataBlock] = js.native
  /* CompleteClass */
  override def toArray(): ByteArray = js.native
}

/* static members */
@JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
@js.native
object default extends js.Object {
  def createBlock(`type`: Double, data: ByteArray): MetadataBlock = js.native
  def createCommentBlock(data: js.Array[String]*): MetadataBlock = js.native
  def createPictureBlock(): Unit = js.native
  def createStreamBlock(): MetadataBlock = js.native
}

