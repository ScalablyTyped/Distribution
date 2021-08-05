package typings.gulpTypescript

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.typesMod.VinylFile
import typings.gulpTypescript.utilsMod.Map
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  trait File extends StObject {
    
    var content: String
    
    var fileNameNormalized: String
    
    var fileNameOriginal: String
    
    var gulp: js.UndefOr[VinylFile] = js.undefined
    
    var kind: FileKind
    
    var ts: js.UndefOr[SourceFile] = js.undefined
  }
  object File {
    
    inline def apply(content: String, fileNameNormalized: String, fileNameOriginal: String, kind: FileKind): File = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileNameNormalized = fileNameNormalized.asInstanceOf[js.Any], fileNameOriginal = fileNameOriginal.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @JSImport("gulp-typescript/release/input", "File")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equal(a: File, b: File): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromContent(caseSensitive: Boolean, fileName: String, content: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fromContent")(caseSensitive.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[File]
    
    inline def fromGulp(caseSensitive: Boolean, file: VinylFile): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGulp")(caseSensitive.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[File]
    
    inline def getChangeState(previous: File, current: File): FileChangeState = (^.asInstanceOf[js.Dynamic].applyDynamic("getChangeState")(previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[FileChangeState]
    
    extension [Self <: File](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFileNameNormalized(value: String): Self = StObject.set(x, "fileNameNormalized", value.asInstanceOf[js.Any])
      
      inline def setFileNameOriginal(value: String): Self = StObject.set(x, "fileNameOriginal", value.asInstanceOf[js.Any])
      
      inline def setGulp(value: VinylFile): Self = StObject.set(x, "gulp", value.asInstanceOf[js.Any])
      
      inline def setGulpUndefined: Self = StObject.set(x, "gulp", js.undefined)
      
      inline def setKind(value: FileKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTs(value: SourceFile): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    }
  }
  
  @JSImport("gulp-typescript/release/input", "FileCache")
  @js.native
  class FileCache protected () extends StObject {
    def this(typescript: Typeofts, options: CompilerOptions, caseSensitive: Boolean) = this()
    
    def addContent(fileName: String, content: String): File = js.native
    
    def addGulp(gFile: VinylFile): File = js.native
    
    var caseSensitive: Boolean = js.native
    
    var commonBasePath: String = js.native
    
    var commonSourceDirectory: String = js.native
    
    /* private */ var createDictionary: js.Any = js.native
    
    var current: FileDictionary = js.native
    
    var firstSourceFile: File = js.native
    
    def getFile(name: String): File = js.native
    
    def getFileChange(name: String): FileChange = js.native
    
    def getFileNames(): js.Array[String] = js.native
    def getFileNames(onlyGulp: Boolean): js.Array[String] = js.native
    
    /* private */ var initTypeScriptSourceFile: js.Any = js.native
    
    def isChanged(): Boolean = js.native
    def isChanged(onlyGulp: Boolean): Boolean = js.native
    
    var noParse: Boolean = js.native
    
    var options: CompilerOptions = js.native
    
    var previous: FileDictionary = js.native
    
    def reset(): Unit = js.native
    
    var typescript: Typeofts = js.native
    
    var version: Double = js.native
  }
  
  @js.native
  sealed trait FileChangeState extends StObject
  @JSImport("gulp-typescript/release/input", "FileChangeState")
  @js.native
  object FileChangeState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileChangeState & Double] = js.native
    
    @js.native
    sealed trait Deleted
      extends StObject
         with FileChangeState
    /* 3 */ val Deleted: typings.gulpTypescript.inputMod.FileChangeState.Deleted & Double = js.native
    
    @js.native
    sealed trait Equal
      extends StObject
         with FileChangeState
    /* 1 */ val Equal: typings.gulpTypescript.inputMod.FileChangeState.Equal & Double = js.native
    
    @js.native
    sealed trait Modified
      extends StObject
         with FileChangeState
    /* 2 */ val Modified: typings.gulpTypescript.inputMod.FileChangeState.Modified & Double = js.native
    
    @js.native
    sealed trait New
      extends StObject
         with FileChangeState
    /* 0 */ val New: typings.gulpTypescript.inputMod.FileChangeState.New & Double = js.native
    
    @js.native
    sealed trait NotFound
      extends StObject
         with FileChangeState
    /* 4 */ val NotFound: typings.gulpTypescript.inputMod.FileChangeState.NotFound & Double = js.native
  }
  
  @JSImport("gulp-typescript/release/input", "FileDictionary")
  @js.native
  class FileDictionary protected () extends StObject {
    def this(caseSensitive: Boolean, typescript: Typeofts) = this()
    
    def addContent(fileName: String, content: String): File = js.native
    
    /* private */ var addFile: js.Any = js.native
    
    def addGulp(gFile: VinylFile): File = js.native
    
    var caseSensitive: Boolean = js.native
    
    var commonBasePath: String = js.native
    
    var commonSourceDirectory: String = js.native
    
    var files: Map[File] = js.native
    
    var firstSourceFile: File = js.native
    
    def getFile(name: String): File = js.native
    
    def getFileNames(): js.Array[String] = js.native
    def getFileNames(onlyGulp: Boolean): js.Array[String] = js.native
    
    /* private */ var getSourceFileNames: js.Any = js.native
    
    def initTypeScriptSourceFile(file: File): Unit = js.native
    
    var typescript: Typeofts = js.native
  }
  
  @js.native
  sealed trait FileKind extends StObject
  @JSImport("gulp-typescript/release/input", "FileKind")
  @js.native
  object FileKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileKind & Double] = js.native
    
    @js.native
    sealed trait Config
      extends StObject
         with FileKind
    /* 1 */ val Config: typings.gulpTypescript.inputMod.FileKind.Config & Double = js.native
    
    @js.native
    sealed trait Source
      extends StObject
         with FileKind
    /* 0 */ val Source: typings.gulpTypescript.inputMod.FileKind.Source & Double = js.native
  }
  
  trait FileChange extends StObject {
    
    var current: File
    
    var previous: File
    
    var state: FileChangeState
  }
  object FileChange {
    
    inline def apply(current: File, previous: File, state: FileChangeState): FileChange = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChange]
    }
    
    extension [Self <: FileChange](x: Self) {
      
      inline def setCurrent(value: File): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: File): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setState(value: FileChangeState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
