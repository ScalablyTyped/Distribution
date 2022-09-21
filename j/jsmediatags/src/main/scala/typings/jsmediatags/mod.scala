package typings.jsmediatags

import typings.jsmediatags.anon.TypeofMediaFileReader
import typings.jsmediatags.anon.TypeofMediaTagReader
import typings.jsmediatags.mediaFileReaderMod.default
import typings.jsmediatags.typesMod.CallbackType
import typings.jsmediatags.typesMod.LoadCallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsmediatags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    def EXPERIMENTAL_avoidHeadRequests(): Unit
    
    def addFileReader(fileReader: TypeofMediaFileReader): Config
    
    def addTagReader(tagReader: TypeofMediaTagReader): Config
    
    def removeTagReader(tagReader: TypeofMediaTagReader): Config
    
    def setDisallowedXhrHeaders(disallowedXhrHeaders: js.Array[String]): Unit
    
    def setXhrTimeoutInSec(timeoutInSec: Double): Unit
  }
  object Config {
    
    @JSImport("jsmediatags", "Config")
    @js.native
    val ^ : Config = js.native
    
    extension [Self <: Config](x: Self) {
      
      inline def setAddFileReader(value: TypeofMediaFileReader => Config): Self = StObject.set(x, "addFileReader", js.Any.fromFunction1(value))
      
      inline def setAddTagReader(value: TypeofMediaTagReader => Config): Self = StObject.set(x, "addTagReader", js.Any.fromFunction1(value))
      
      inline def setEXPERIMENTAL_avoidHeadRequests(value: () => Unit): Self = StObject.set(x, "EXPERIMENTAL_avoidHeadRequests", js.Any.fromFunction0(value))
      
      inline def setRemoveTagReader(value: TypeofMediaTagReader => Config): Self = StObject.set(x, "removeTagReader", js.Any.fromFunction1(value))
      
      inline def setSetDisallowedXhrHeaders(value: js.Array[String] => Unit): Self = StObject.set(x, "setDisallowedXhrHeaders", js.Any.fromFunction1(value))
      
      inline def setSetXhrTimeoutInSec(value: Double => Unit): Self = StObject.set(x, "setXhrTimeoutInSec", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("jsmediatags", "Reader")
  @js.native
  open class Reader protected () extends StObject {
    def this(file: Any) = this()
    
    var _file: Any = js.native
    
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
  
  inline def read(location: Any, callbacks: CallbackType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(location.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
