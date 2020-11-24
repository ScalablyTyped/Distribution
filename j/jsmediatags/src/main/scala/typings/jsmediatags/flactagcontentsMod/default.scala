package typings.jsmediatags.flactagcontentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
@js.native
class default () extends FLACTagContents {
  def this(blocks: js.Array[MetadataBlock]) = this()
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
