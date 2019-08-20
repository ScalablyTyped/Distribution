package typings.jsmediatags.build2FLACTagContentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FLACTagContents extends js.Object {
  var blocks: js.Array[MetadataBlock]
  def toArray(): ByteArray
}

object FLACTagContents {
  @scala.inline
  def apply(blocks: js.Array[MetadataBlock], toArray: () => ByteArray): FLACTagContents = {
    val __obj = js.Dynamic.literal(blocks = blocks, toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[FLACTagContents]
  }
}

