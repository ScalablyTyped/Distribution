package typings.jsmediatags

import typings.jsmediatags.anon.TypeofMediaFileReader
import typings.jsmediatags.anon.TypeofMediaTagReader
import typings.jsmediatags.mediaFileReaderMod.default
import typings.jsmediatags.typesMod.CallbackType
import typings.jsmediatags.typesMod.LoadCallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Config extends StObject {
    
    def EXPERIMENTAL_avoidHeadRequests(): Unit = js.native
    
    def addFileReader(fileReader: TypeofMediaFileReader): Config = js.native
    
    def addTagReader(tagReader: TypeofMediaTagReader): Config = js.native
    
    def removeTagReader(tagReader: TypeofMediaTagReader): Config = js.native
    
    def setDisallowedXhrHeaders(disallowedXhrHeaders: js.Array[String]): Unit = js.native
    
    def setXhrTimeoutInSec(timeoutInSec: Double): Unit = js.native
  }
  object Config {
    
    @JSImport("jsmediatags", "Config")
    @js.native
    val ^ : Config = js.native
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFileReader(value: TypeofMediaFileReader => Config): Self = StObject.set(x, "addFileReader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddTagReader(value: TypeofMediaTagReader => Config): Self = StObject.set(x, "addTagReader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEXPERIMENTAL_avoidHeadRequests(value: () => Unit): Self = StObject.set(x, "EXPERIMENTAL_avoidHeadRequests", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveTagReader(value: TypeofMediaTagReader => Config): Self = StObject.set(x, "removeTagReader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisallowedXhrHeaders(value: js.Array[String] => Unit): Self = StObject.set(x, "setDisallowedXhrHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetXhrTimeoutInSec(value: Double => Unit): Self = StObject.set(x, "setXhrTimeoutInSec", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("jsmediatags", "Reader")
  @js.native
  class Reader protected () extends StObject {
    def this(file: js.Any) = this()
    
    var _file: js.Any = js.native
    
    var _fileReader: TypeofMediaFileReader = js.native
    
    def _findFileReader(): TypeofMediaFileReader = js.native
    
    def _findTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
    
    def _getFileReader(): TypeofMediaFileReader = js.native
    
    def _getTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
    
    def _loadTagIdentifierRanges(fileReader: default, tagReaders: js.Array[TypeofMediaTagReader], callbacks: LoadCallbackType): Unit = js.native
    
    var _tagReader: TypeofMediaTagReader = js.native
    
    var _tagsToRead: js.Array[String] = js.native
    
    def read(callbacks: CallbackType): Unit = js.native
    
    def setFileReader(fileReader: TypeofMediaFileReader): Reader = js.native
    
    def setTagReader(tagReader: TypeofMediaTagReader): Reader = js.native
    
    def setTagsToRead(tagsToRead: js.Array[String]): Reader = js.native
  }
  
  @JSImport("jsmediatags", "read")
  @js.native
  def read(location: js.Any, callbacks: CallbackType): Unit = js.native
}
