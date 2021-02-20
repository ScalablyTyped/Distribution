package typings.gulpConcat

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-concat", JSImport.Namespace)
  @js.native
  val ^ : IConcat = js.native
  
  @js.native
  trait IConcat extends StObject {
    
    def apply(filename: String): ReadWriteStream = js.native
    def apply(filename: String, options: IOptions): ReadWriteStream = js.native
    def apply(options: IVinylOptions): ReadWriteStream = js.native
  }
  
  @js.native
  trait IFsStats extends StObject {
    
    var atime: js.UndefOr[Date] = js.native
    
    var blksize: js.UndefOr[Double] = js.native
    
    var blocks: js.UndefOr[Double] = js.native
    
    var ctime: js.UndefOr[Date] = js.native
    
    var dev: js.UndefOr[Double] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var ino: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Date] = js.native
    
    var nlink: js.UndefOr[Double] = js.native
    
    var rdev: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
  }
  object IFsStats {
    
    @scala.inline
    def apply(): IFsStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFsStats]
    }
    
    @scala.inline
    implicit class IFsStatsMutableBuilder[Self <: IFsStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlksizeUndefined: Self = StObject.set(x, "blksize", js.undefined)
      
      @scala.inline
      def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      @scala.inline
      def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      @scala.inline
      def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInoUndefined: Self = StObject.set(x, "ino", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlinkUndefined: Self = StObject.set(x, "nlink", js.undefined)
      
      @scala.inline
      def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdevUndefined: Self = StObject.set(x, "rdev", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait IOptions extends StObject {
    
    var newLine: String = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(newLine: String): IOptions = {
      val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVinylOptions extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    var contents: js.UndefOr[ReadableStream | Buffer] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var stat: js.UndefOr[IFsStats] = js.native
  }
  object IVinylOptions {
    
    @scala.inline
    def apply(): IVinylOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVinylOptions]
    }
    
    @scala.inline
    implicit class IVinylOptionsMutableBuilder[Self <: IVinylOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setContents(value: ReadableStream | Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStat(value: IFsStats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  type _To = IConcat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IConcat = ^
}
