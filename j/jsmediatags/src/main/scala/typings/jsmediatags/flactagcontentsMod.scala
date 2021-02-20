package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flactagcontentsMod {
  
  @JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
  @js.native
  class default () extends FLACTagContents {
    def this(blocks: js.Array[MetadataBlock]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/FLACTagContents", "default.createBlock")
    @js.native
    def createBlock(`type`: Double, data: ByteArray): MetadataBlock = js.native
    
    @JSImport("jsmediatags/build2/FLACTagContents", "default.createCommentBlock")
    @js.native
    def createCommentBlock(data: js.Array[String]*): MetadataBlock = js.native
    
    @JSImport("jsmediatags/build2/FLACTagContents", "default.createPictureBlock")
    @js.native
    def createPictureBlock(): Unit = js.native
    
    @JSImport("jsmediatags/build2/FLACTagContents", "default.createStreamBlock")
    @js.native
    def createStreamBlock(): MetadataBlock = js.native
  }
  
  @JSImport("jsmediatags/build2/FLACTagContents", "MetadataBlock")
  @js.native
  class MetadataBlock protected () extends StObject {
    def this(`type`: Double, data: ByteArray) = this()
    
    var _data: js.Array[Double] = js.native
    
    var _final: Boolean = js.native
    
    var _type: Double = js.native
    
    def setFinal(): Unit = js.native
    
    def toArray(): Unit = js.native
  }
  
  @js.native
  trait FLACTagContents extends StObject {
    
    var blocks: js.Array[MetadataBlock] = js.native
    
    def toArray(): ByteArray = js.native
  }
  object FLACTagContents {
    
    @scala.inline
    def apply(blocks: js.Array[MetadataBlock], toArray: () => ByteArray): FLACTagContents = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[FLACTagContents]
    }
    
    @scala.inline
    implicit class FLACTagContentsMutableBuilder[Self <: FLACTagContents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: js.Array[MetadataBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksVarargs(value: MetadataBlock*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setToArray(value: () => ByteArray): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
}
