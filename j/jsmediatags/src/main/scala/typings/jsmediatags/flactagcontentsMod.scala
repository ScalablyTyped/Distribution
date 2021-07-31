package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flactagcontentsMod {
  
  @JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with FLACTagContents {
    def this(blocks: js.Array[MetadataBlock]) = this()
    
    /* CompleteClass */
    var blocks: js.Array[MetadataBlock] = js.native
    
    /* CompleteClass */
    override def toArray(): ByteArray = js.native
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/FLACTagContents", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createBlock(`type`: Double, data: ByteArray): MetadataBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MetadataBlock]
    
    @scala.inline
    def createCommentBlock(data: js.Array[String]*): MetadataBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommentBlock")(data.asInstanceOf[js.Any]).asInstanceOf[MetadataBlock]
    
    @scala.inline
    def createPictureBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPictureBlock")().asInstanceOf[Unit]
    
    @scala.inline
    def createStreamBlock(): MetadataBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("createStreamBlock")().asInstanceOf[MetadataBlock]
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
  
  trait FLACTagContents extends StObject {
    
    var blocks: js.Array[MetadataBlock]
    
    def toArray(): ByteArray
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
