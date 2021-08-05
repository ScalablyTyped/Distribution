package typings.gulpConcat

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait IFsStats extends StObject {
    
    var atime: js.UndefOr[Date] = js.undefined
    
    var blksize: js.UndefOr[Double] = js.undefined
    
    var blocks: js.UndefOr[Double] = js.undefined
    
    var ctime: js.UndefOr[Date] = js.undefined
    
    var dev: js.UndefOr[Double] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var ino: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Date] = js.undefined
    
    var nlink: js.UndefOr[Double] = js.undefined
    
    var rdev: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
  }
  object IFsStats {
    
    inline def apply(): IFsStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFsStats]
    }
    
    extension [Self <: IFsStats](x: Self) {
      
      inline def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setBlksizeUndefined: Self = StObject.set(x, "blksize", js.undefined)
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setInoUndefined: Self = StObject.set(x, "ino", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setNlinkUndefined: Self = StObject.set(x, "nlink", js.undefined)
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setRdevUndefined: Self = StObject.set(x, "rdev", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait IOptions extends StObject {
    
    var newLine: String
  }
  object IOptions {
    
    inline def apply(newLine: String): IOptions = {
      val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVinylOptions extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var contents: js.UndefOr[ReadableStream | Buffer] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var stat: js.UndefOr[IFsStats] = js.undefined
  }
  object IVinylOptions {
    
    inline def apply(): IVinylOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVinylOptions]
    }
    
    extension [Self <: IVinylOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setContents(value: ReadableStream | Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStat(value: IFsStats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  type _To = IConcat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IConcat = ^
}
