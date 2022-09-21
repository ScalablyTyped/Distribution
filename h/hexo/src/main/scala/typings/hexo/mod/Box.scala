package typings.hexo.mod

import typings.hexo.anon.Encoding
import typings.hexo.hexoStrings.create
import typings.hexo.hexoStrings.delete
import typings.hexo.hexoStrings.skip
import typings.hexo.hexoStrings.update
import typings.hexo.mod.Box.File
import typings.hexoUtil.mod.Pattern
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box extends EventEmitter {
  
  /**
    * A processor is an essential element of `Box` and is used to process files.
    * You can use path matching as described above to restrict what exactly the processor should process.
    * Register a new processor with the `addProcessor` method.
    */
  def addProcessor(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: js.RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: Pattern[Boolean], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  
  /**
    * Loads all files in the folder.
    */
  def process(fn: js.Function1[/* err */ Any, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Stop watching.
    */
  def unwatch(): Unit = js.native
  
  /**
    * Loads all files in the folder and start watching for file changes.
    */
  def watch(): js.Promise[Unit] = js.native
  def watch(fn: js.Function1[/* err */ Any, Unit]): js.Promise[Unit] = js.native
}
object Box {
  
  @js.native
  trait File extends StObject {
    
    /**
      * The information from path matching.
      */
    val params: Any = js.native
    
    /**
      * Relative path to the box of the file
      */
    val path: String = js.native
    
    /**
      * Read a file
      */
    def read(): js.Promise[String | Buffer] = js.native
    def read(fn: js.Function2[/* err */ Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
    def read(option: Unit, fn: js.Function2[/* err */ Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
    def read(option: Encoding): js.Promise[String | Buffer] = js.native
    def read(option: Encoding, fn: js.Function2[/* err */ Any, /* result */ String | Buffer, Unit]): js.Promise[String | Buffer] = js.native
    
    /**
      * Read a file synchronously
      */
    def readSync(): String | Buffer = js.native
    def readSync(option: Encoding): String | Buffer = js.native
    
    /**
      * Render a file
      */
    def render(): js.Promise[String] = js.native
    def render(fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[String] = js.native
    def render(option: Any): js.Promise[String] = js.native
    def render(option: Any, fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[String] = js.native
    def render(option: Unit, fn: js.Function2[/* err */ Any, /* result */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * Render a file synchronously
      */
    def renderSync(): String = js.native
    def renderSync(option: Any): String = js.native
    
    /**
      * Full path of the file
      */
    val source: String = js.native
    
    /**
      * Read the status of a file
      */
    def stat(): js.Promise[Stats] = js.native
    def stat(fn: js.Function2[/* err */ Any, /* result */ Stats, Unit]): js.Promise[Stats] = js.native
    
    /**
      * Read the status of a file synchronously
      */
    def statSync(): Stats = js.native
    
    /**
      * File type. The value can be `create` , `update` , `skip`, `delete` .
      */
    val `type`: create | update | skip | delete = js.native
  }
}
