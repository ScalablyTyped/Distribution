package typings.gulpIf

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import typings.std.RegExp
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-if", JSImport.Namespace)
  @js.native
  val ^ : GulpIf = js.native
  
  @js.native
  trait GulpIf extends StObject {
    
    /** 
      * gulp-if will pipe data to stream whenever condition is truthy.
      * If condition is falsey and elseStream is passed, data will pipe to elseStream
      * After data is piped to stream or elseStream or neither, data is piped down-stream.
      * 
      * @param condition a function taking a vinyl file and returning a boolean
      * @param stream the stream to pipe to if condition is true
      * @param elseStream (optional) the stream to pipe to if condition is false 
      */
    def apply(condition: js.Function1[/* fs */ File, Boolean], stream: ReadWriteStream): ReadWriteStream = js.native
    def apply(
      condition: js.Function1[/* fs */ File, Boolean],
      stream: ReadWriteStream,
      elseStream: ReadWriteStream
    ): ReadWriteStream = js.native
    /** 
      * gulp-if will pipe data to stream whenever condition is truthy.
      * If condition is falsey and elseStream is passed, data will pipe to elseStream
      * After data is piped to stream or elseStream or neither, data is piped down-stream.
      * 
      * @param condition whether input should be piped to stream
      * @param stream the stream to pipe to if condition is true
      * @param elseStream (optional) the stream to pipe to if condition is false 
      */
    def apply(condition: Boolean, stream: ReadWriteStream): ReadWriteStream = js.native
    def apply(condition: Boolean, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
    /** 
      * gulp-if will pipe data to stream whenever condition is truthy.
      * If condition is falsey and elseStream is passed, data will pipe to elseStream
      * After data is piped to stream or elseStream or neither, data is piped down-stream.
      * 
      * @param condition a Node Stat filter condition to be executed on the vinyl file's Stats object
      * @param stream the stream to pipe to if condition is true
      * @param elseStream (optional) the stream to pipe to if condition is false 
      */
    def apply(condition: StatFilterCondition, stream: ReadWriteStream): ReadWriteStream = js.native
    def apply(condition: StatFilterCondition, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
    /** 
      * gulp-if will pipe data to stream whenever condition is truthy.
      * If condition is falsey and elseStream is passed, data will pipe to elseStream
      * After data is piped to stream or elseStream or neither, data is piped down-stream.
      * 
      * @param condition a RegularExpression that works on the file.path
      * @param stream the stream to pipe to if condition is true
      * @param elseStream (optional) the stream to pipe to if condition is false 
      */
    def apply(condition: RegExp, stream: ReadWriteStream): ReadWriteStream = js.native
    def apply(condition: RegExp, stream: ReadWriteStream, elseStream: ReadWriteStream): ReadWriteStream = js.native
  }
  
  trait StatFilterCondition extends StObject {
    
    var isDirectory: js.UndefOr[Boolean] = js.undefined
    
    var isFile: js.UndefOr[Boolean] = js.undefined
  }
  object StatFilterCondition {
    
    inline def apply(): StatFilterCondition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatFilterCondition]
    }
    
    extension [Self <: StatFilterCondition](x: Self) {
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    }
  }
  
  type _To = GulpIf
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpIf = ^
}
